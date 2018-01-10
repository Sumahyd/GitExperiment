import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    @Given("^enter url$")
    public void enterUrl()  {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        driver= new ChromeDriver();

        driver.get("https://www.facebook.com");
       System.out.println("first stsmt");

    }

    @When("^enter username and password$")
    public void enterUsernameAndPassword()  {
        System.out.println("second stmt");
    }

    @Then("^login successful$")
    public void loginSuccessful()  {
        System.out.println("third stmt");
    }
}
