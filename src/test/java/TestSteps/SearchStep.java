package TestSteps;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchStep {
    WebDriver driver;

    @Given("Environemnt is ready")
    public void environemnt_is_ready() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @When("got to the Website {string}")
    public void got_to_the_Website(String web) {
        driver.navigate().to(web);

    }

    @When("search {string} keyword")
    public void search_keyword(String string) {
        WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
        search.sendKeys(string + Keys.ENTER);

    }

    @Then("Close the browser")
    public void close_the_browser() {
        new Actions(driver).pause(3000).perform();
        driver.quit();
    }

    @Then("Test Ended")
    public void test_Ended() {
        System.out.println("Test Ended");
    }


    @Then("print {string} on the console.")
    public void print_on_the_console(String string) {
        System.out.println(string);
    }

}
