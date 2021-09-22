package co.com.tcs.training.retomobileoutlook.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TheApp {
    private WebDriver miDriver;

    public static TheApp enElTelefono() {
        return new TheApp();
    }

    public WebDriver getMyDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.microsoft.office.outlook");
        capabilities.setCapability("appActivity", "com.microsoft.office.outlook.MainActivity");
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("deviceName", "HUAWEI Mate 20 lite");
        capabilities.setCapability("unicodeKeyboard","true");
        capabilities.setCapability("autoGrantPermissions","true");

        try {
            miDriver = new AppiumDriver(new URL("http:/127.0.0.1:4723/wd/hub"),capabilities);
        }catch(MalformedURLException e) {
            e.printStackTrace();
        }
        return miDriver;
    }
}
