package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;
    //  ---   selector  ---
    By button_login = By.xpath("//a[contains(.,'Sign in')]");
    By field_email = By.cssSelector("#identifierId");
    By button_next = By.xpath("//span[.='Next']");
    By field_password = By.xpath("//input[@name='password']");
    // ---  end selector ---


    public loginPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLoginBtn(){
        driver.findElement(button_login).click();
    }

    public void loginValidData(String valEmail, String valPassword){
        driver.findElement(field_email).sendKeys(valEmail);
        driver.findElement(button_next).click();
        driver.findElement(field_password).sendKeys(valPassword);
        driver.findElement(button_next).click();
    }

}
