package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public static AndroidDriver<AndroidElement> capabilities(String device,String androidApp) throws IOException {


        File appDir = new File("src");

        File app = new File(appDir, androidApp);

        DesiredCapabilities cap = new DesiredCapabilities();

        if(device.equalsIgnoreCase("emulator")) {
            cap.setCapability(MobileCapabilityType.DEVICE_NAME,globalReader.get("EmulatorDeviceName"));
        }else if(device.equalsIgnoreCase("real")){

            cap.setCapability(MobileCapabilityType.DEVICE_NAME,globalReader.get("RealDeviceName")); //==> it is for real device. before this, you have to control on the terminal with "adb devices" command

        }


        cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());

        //UI Automator ->Android apps
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        return driver;


    }

}
