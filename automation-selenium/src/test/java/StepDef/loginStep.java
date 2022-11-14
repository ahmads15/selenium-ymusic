package StepDef;
import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class loginStep {
    WebDriver driver;
    loginPage login;

    @Given("User Open browser")
    public void iOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        driver = new ChromeDriver();
    }

    @When("Open website Youtube Music")
    public void openWebsiteYoutubeMusic() {
        login = new loginPage(driver);
        driver.get("https://music.youtube.com/");
    }

    @When("^User successfully login with data \"([^\"]*)\" and \"([^\"]*)\"")
    public void loginWithValidData(String valEmail, String valPass) {
        login = new loginPage(driver);
        login.clickLoginBtn();
        login.loginValidData(valEmail,valPass);
    }


}
