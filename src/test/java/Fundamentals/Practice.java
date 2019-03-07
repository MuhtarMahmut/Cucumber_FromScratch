package Fundamentals;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features" ,
                glue = "TestSteps",
                tags = "@DDT2",
        dryRun = false,
        plugin = {"html:target/Day1Report" ,
                "junit:target/Day1Report/myJunitReport.xml" ,
                        "pretty:target/Day1Report/MyPretty.txt",
                "usage:target/Day1Report/MyUsage.json"
        }
)
public class Practice {

}
