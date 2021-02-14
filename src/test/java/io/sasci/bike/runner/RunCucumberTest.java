package io.sasci.bike.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                , "html:report/cucumber"
                , "json:report/cucumber.json"
                , "summary"
                , "de.monochromata.cucumber.report.PrettyReports:report/cucumber"}
        ,features = {"src/test/resources"}
        ,glue = {"stepDef"}
        ,snippets = CAMELCASE
        ,dryRun=false
        ,monochrome=true
        ,strict=true
        ,tags = "@face"
)
public class RunCucumberTest {
}