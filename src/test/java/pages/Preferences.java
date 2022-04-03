package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Preferences extends HomePage{


  @FindBy(xpath = "")
    public WebElement x;


    public Preferences(AppiumDriver driver) {
        super(driver);
    }
}
