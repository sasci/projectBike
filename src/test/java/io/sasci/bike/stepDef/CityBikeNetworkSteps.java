package io.sasci.bike.stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.sasci.bike.APIs.CityBikeService;
import io.sasci.bike.model.BikeNetwork;
import io.sasci.bike.model.BikeNetworkWithStation;
import io.sasci.bike.model.Station;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CityBikeNetworkSteps {
    private CityBikeService cityBikeService;
    private List<BikeNetwork> allNetworks;
    private BikeNetworkWithStation networkById;

    @Given("User opens bike project page")
    public void userOpensBikeProjectPage() {
       cityBikeService=new CityBikeService();
    }

    @When("User calls to all networks")
    public void userCallsToAllNetworks() {
        allNetworks = cityBikeService.getAllNetworks();
    }

    @Then("User should see {int} networks")
    public void userShouldSeeNetworks(int arg0) {
        assertThat(allNetworks, hasSize(646));
    }

    @When("User calls to {string} as a network_id")
    public void userCallsToAsANetwork_id(String networkId) {
        networkById = cityBikeService.getNetworkWithStationById(networkId);
    }

    @Then("User should see following table")
    public void userShouldSeeFollowingTable(DataTable locationTable) {
        final List<List<String>> location = locationTable.asLists();
        assertThat(networkById.getLocation().getCity(),is(location.get(1).get(0)));
        assertThat(networkById.getLocation().getCountry(),is(location.get(1).get(1)));
        assertThat(networkById.getLocation().getLatitude(),is(Double.valueOf(location.get(1).get(2))));
        assertThat(networkById.getLocation().getLongitude(),is(Double.valueOf(location.get(1).get(3))));
    }

    @And("User should see at least {int} free bikes")
    public void userShouldSeeTotalFreeBikes(int total_Free_Bikes) {
        final int totalFreeBikes = networkById.getStations().stream().mapToInt(Station::getFree_bikes).sum();
        assertThat(totalFreeBikes,greaterThanOrEqualTo(total_Free_Bikes));
    }

    @And("User should see station count as {int}")
    public void userShouldSeeStationCountAs(int stationSize) {
        assertThat(networkById.getStations(),hasSize(stationSize));
    }
}
