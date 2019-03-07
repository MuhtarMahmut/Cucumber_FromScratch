package TestSteps;

import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class primitivesSteps {
WebDriver driver;

    @Then("go to the {string}")
    public void go_to_the(String muhtar) {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.navigate().to(muhtar);

    }

    @Then("search {string}")
    public void search(String Rayisa) {
        WebElement searchbox=driver.findElement(By.xpath(".//input[@class='gLFyf gsfi' and @type='text']"));
        searchbox.sendKeys(Rayisa + Keys.ENTER);



    }

}
