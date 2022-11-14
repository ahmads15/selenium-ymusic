package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class explorePage {
    WebDriver driver;
    //  ---   selector  ---
    By menu_explore = By.xpath("//*[text()='Explore']");
    By field_email = By.cssSelector("#identifierId");
    By button_next = By.xpath("//span[.='Next']");
    By field_password = By.xpath("//input[@name='password']");
    // ---  end selector ---


    public explorePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickMenu(){
        driver.findElement(menu_explore).click();
    }
}
