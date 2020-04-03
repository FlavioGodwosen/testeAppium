package br.co.testbvb;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBvB {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("plataformName", "Android");
        desiredCapabilities.setCapability("deviceName", "samsung sm-j500M");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.bvbbr.bvb_brasil");
        desiredCapabilities.setCapability("appActivity", "com.bvbbr.bvb_brasil.SplashActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);

        MobileElement el3;
        el3 = (MobileElement) driver.findElementById("com.bvbbr.bvb_brasil:id/Bundesliga");
        el3.click();

        driver.quit();
    }
}
