package runner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;
import pages.Preferences;
import utilities.Base;
import utilities.globalReader;

import java.io.IOException;
import java.net.MalformedURLException;

public class basic extends Base {

    public static void main(String[] args) throws IOException {
        AndroidDriver<AndroidElement> driver = capabilities(globalReader.get("device"), globalReader.get("GeneralStoreApp"));

        HomePage h = new HomePage(driver);

        //Constructor of class will be invoked when you create object for the class
        //default constructor be called
        //constructor can be defined with argument
        //You can call objects or methods
        h.Preferences.click();

        Preferences p = new Preferences(driver);

    }
}
