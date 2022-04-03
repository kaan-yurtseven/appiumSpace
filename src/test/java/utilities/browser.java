package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class browser {
    public static void main(String[] args) throws MalformedURLException, MalformedURLException {


        AndroidDriver<AndroidElement> driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"kaan");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);

        driver = new AndroidDriver<>(new URL("http://127.0.0.1::4723/wd/hub"),capabilities);



    }
}
