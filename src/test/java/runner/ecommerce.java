package runner;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Base;
import utilities.globalReader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ecommerce extends Base {
    @Test
    public void addToBag() throws IOException {

        AndroidDriver<AndroidElement> driver = capabilities(globalReader.get("device"), globalReader.get("GeneralStoreApp"));

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("hello");
        driver.hideKeyboard();//it is for to hide keyboard on the screen.

        driver.findElement(By.xpath("//*[@text='Female']")).click();

        driver.findElement(By.id("android:id/text1")).click();

        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
        //scroll down the menu until you find Turkey
        /*if the above syntax does not work, you can use this syntax
         * driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));
         */
        driver.findElement(By.xpath("//*[@text='Argentina']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        driver.findElements(By.xpath("//*[@text = 'ADD TO CART']")).get(0).click();
        driver.findElements(By.xpath("//*[@text = 'ADD TO CART']")).get(0).click();//element will be changed. so that if we dont put the element in List, we have to write it like this.

		/*List<AndroidElement> element = driver.findElements(By.xpath("//*[@text = 'ADD TO CART']"));
		element.get(0).click();
		element.get(1).click();
		*/


        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();



    }
}
