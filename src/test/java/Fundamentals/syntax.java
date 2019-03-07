package Fundamentals;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/syntax.feature",
        glue = "TestSteps",
        dryRun = false,
        plugin = "html:target/CucumberReport"
)
public class syntax {


}
