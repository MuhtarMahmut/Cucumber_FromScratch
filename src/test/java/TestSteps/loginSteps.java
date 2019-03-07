package TestSteps;

import cucumber.api.java.After;
import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class loginSteps {

    WebDriver driver;

    @Given("browser is opened")
    public void browser_is_opened() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("website is uploaded")
    public void website_is_uploaded() {
            driver.navigate().to("https://www.google.com");
            driver.findElement(By.linkText("Sign in")).click();
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        WebElement email=driver.findElement(By.xpath(".//input[@type='email']"));
        email.sendKeys("Muhtar.Mahmut0519@gmail.com" + Keys.ENTER);

        WebElement password= driver.findElement(By.xpath("//input[@type='password' and @class='whsOnd zHQkBf']"));

        password.sendKeys("sssssss" + Keys.ENTER);

    }





}
