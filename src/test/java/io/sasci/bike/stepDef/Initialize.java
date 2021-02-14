package io.sasci.bike.stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.sasci.bike.utility.ConfigUtils;

import static io.sasci.bike.utility.ConfigUtils.getValue;

public class Initialize {
    @Before
    public void setup(){
        new ConfigUtils().loadValues("/Props/test.properties");
        RestAssured.baseURI=String.format(getValue("baseUri"),getValue("env"));
    }

    @After
    public void tearDown(){
        RestAssured.reset();
    }
}
