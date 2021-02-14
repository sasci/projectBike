package io.sasci.bike.APIs;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.sasci.bike.model.BikeNetwork;
import io.sasci.bike.model.BikeNetworkWithStation;

import java.util.List;

import static io.restassured.RestAssured.given;

public class CityBikeService {

    public Response getNetworks(){
        return given()
                .basePath("networks")
                .contentType(ContentType.JSON)
            .when()
                .get();

    }

    public List<BikeNetwork> getAllNetworks(){
        return given()
                .basePath("networks")
                .contentType(ContentType.JSON)
            .when()
                .get()
                .then().extract().body().jsonPath().getList("networks",BikeNetwork.class);

    }

    public Response getNetworkResponseById(String networkId){
        return given()
                .basePath("networks/{network_id}")
                .pathParam("network_id",networkId)
                .contentType(ContentType.JSON)
            .when()
                .get();
    }

    public BikeNetworkWithStation getNetworkWithStationById(String networkId){
         return given()
                .basePath("networks/{network_id}")
                .pathParam("network_id",networkId)
                .contentType(ContentType.JSON)
                .when()
                .get()
                .then().extract().body().jsonPath().getObject("network",BikeNetworkWithStation.class);
    }
}
