package Fundamentals;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
        glue = "TestSteps",
        dryRun = false,
        plugin = "html:target/CucumberReport",
        tags = "@Muhtar"
)
public class tag {
}
