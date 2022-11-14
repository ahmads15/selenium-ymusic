package StepDef;

import Pages.explorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exploreStep {
    WebDriver driver;
    explorePage explore;

    @When("User click menu Explore")
    public void clickMenuExplore() throws InterruptedException {
        explore = new explorePage(driver);
        explore.clickMenu();
        Thread.sleep(4000);
    }
}
