package com.selenium.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources/Amazon.feature"},
        strict = false,
        glue = {"com.selenium.infrastructure"
})

public class Amazon {
}
