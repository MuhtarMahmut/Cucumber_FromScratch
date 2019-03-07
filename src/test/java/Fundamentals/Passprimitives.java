package Fundamentals;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features","Features2"},
        glue = "TestSteps",
        tags = "@zz",
        dryRun = false

)
public class Passprimitives {
}
