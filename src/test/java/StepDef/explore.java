package StepDef;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class explore {
    WebDriver driver;
    @Given("User Open browser")

    @Before
    public void SetupBrowser() {
        final String dir = System.getProperty("user.dir");
        System.out.println("=== iOpenBrowser ===");
        System.setProperty("webdriver.chrome.driver", dir+"/driver/chromedriver");
        driver = new ChromeDriver();
    }


    @When("Open website Youtube Music")
    public void openWebsiteYoutubeMusic(){
        driver.get("https://music.youtube.com/");
    }

    @When("User click menu {string}")
    public void clickMenu(String value)  throws InterruptedException{
        driver.findElement(By.xpath("//*[text()='"+value+"']")).click();
        Thread.sleep(1000); // waiting after transaition page
    }

    @When("User search music {string} in search page")
    public void searchMusic(String value){
        driver.findElement(By.cssSelector(".search-icon > #icon")).click();
        driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys(value);
        driver.findElement(By.cssSelector("[placeholder='Search']")).sendKeys(Keys.ENTER);
    }

    @Then("User can see result search and play music")
    public void verifyResultSearch() throws InterruptedException {
        Thread.sleep(1000); // waiting after transition page
        driver.findElement(By.cssSelector("[aria-label='Oasis']")).isDisplayed();
        driver.findElement(By.xpath("//ytmusic-shelf-renderer[2]//ytmusic-responsive-list-item-renderer[2]//div[@id='content']")).click();
        String getSlidePlay = String.valueOf(driver.findElement(By.cssSelector("#sliderBar[value='0']")));
        Thread.sleep(6000); // waiting music already play
        Assert.assertFalse(Boolean.parseBoolean(getSlidePlay));
    }


    @Then("User can see new releases music")
    public void verifyNewReleasesMusic() {
        String getUrl = driver.getCurrentUrl();
        Assert.assertEquals(getUrl,"https://music.youtube.com/new_releases");
        driver.findElement(By.xpath("//a[.='RELEASED']")).isDisplayed();
    }

    @When("User click dropdown country charts {string}")
    public void clickDropdownCountry(String value) throws InterruptedException {
        driver.findElement(By.xpath("//button[@id='button']")).isDisplayed();
        driver.findElement(By.xpath("//button[@id='button']")).click();
        driver.findElement(By.xpath("//yt-formatted-string[.='"+value+"']")).click();
        Thread.sleep(1000); // waiting transition page
    }

    @Then("User can see Top chart from Country {string}")
    public void verifyResultTopChart(String value) throws InterruptedException {
        Thread.sleep(2000); // waiting element displayed
        driver.findElement(By.xpath("//ytmusic-carousel-shelf-renderer[3]//ytmusic-responsive-list-item-renderer[2]//a[.='"+value+"']")).isDisplayed();
    }

    @When("User click Profile Artist")
    public void clickProfileArtist() throws InterruptedException {
        Thread.sleep(2000); // waiting element displayed
        driver.findElement(By.xpath("//ytmusic-shelf-renderer[1]//ytmusic-responsive-list-item-renderer[@class='style-scope ytmusic-shelf-renderer']")).click();
    }

    @When("User play music on Songs {string}")
    public void playSongs(String songs) throws InterruptedException  {
        Thread.sleep(3000); // waiting element visible
        driver.findElement(By.xpath("//ytmusic-section-list-renderer[@class='style-scope ytmusic-browse-response']//a[.='"+songs+"']")).isDisplayed();
        driver.findElement(By.xpath("//ytmusic-section-list-renderer[@class='style-scope ytmusic-browse-response']//a[.='"+songs+"']")).click();
        String getSlidePlay = String.valueOf(driver.findElement(By.cssSelector("#sliderBar[value='0']")));
        Thread.sleep(6000); // waiting music already play
        Assert.assertFalse(Boolean.parseBoolean(getSlidePlay));
    }

    @Then("User can see LYCRICS music")
    public void verifyLyrics() throws InterruptedException {
        driver.findElement(By.cssSelector("tp-yt-paper-tab:nth-of-type(2)")).click();
        Thread.sleep(2000); // waiting element visible
        driver.findElement(By.cssSelector("[expanded] > .non-expandable")).isDisplayed();
    }

    @After
    public void closeBrowser(){
        System.out.println("=== Close Browser ===");
        driver.close();
        driver.quit();
    }
}
