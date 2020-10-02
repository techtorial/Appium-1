package com.techtorial.appiumIntro;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumIntro1 {
    DesiredCapabilities desiredCapabilities;
    File apkFile;
    URL url;

    @Before
    public void setUp() throws MalformedURLException {
        apkFile= new File("src/test/resources/AppiumPractice.apk");
        desiredCapabilities=new DesiredCapabilities(); // is gonna build key and value format

        desiredCapabilities.setCapability("deviceName","Pixel 2 API 28");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("app", apkFile.getAbsolutePath());
        url=new URL("http://localhost:4723/wd/hub");
    }

    @Test
    public void intro1(){

        try {
            url = new URL("http://localhost:4723/wd/hub"); // appium server
        }catch (MalformedURLException ex){

            throw new RuntimeException(ex);
        }

        AndroidDriver<AndroidElement> androidDriver=new AndroidDriver(url, desiredCapabilities);

        AndroidElement accessibility=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']"));
        accessibility.click();

        androidDriver.navigate().back();

        AndroidElement animationView=androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Animation']"));
        animationView.click();
        androidDriver.navigate().back();

        AndroidElement appView =androidDriver.findElement(By.xpath("//android.widget.TextView[@text='App']"));
        appView.click();
        androidDriver.navigate().back();

        AndroidElement contentView=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Content']"));
        contentView.click();
        androidDriver.navigate().back();

        AndroidElement element4=androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Graphics']"));
        element4.click();
        androidDriver.navigate().back();

        AndroidElement element5=androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Media']"));
        element5.click();
        androidDriver.navigate().back();

        AndroidElement element6=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='NFC']"));
        element6.click();
        androidDriver.navigate().back();

        AndroidElement element7=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='OS']"));
        element7.click();
        androidDriver.navigate().back();

        AndroidElement element8=androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']"));
        element8.click();
        androidDriver.navigate().back();

        AndroidElement element9=androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Text']"));
        element9.click();
        androidDriver.navigate().back();

        AndroidElement element10=androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']"));
        element10.click();
        androidDriver.navigate().back();
    }
    @Test
    public void intro2() throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver= new AndroidDriver(url,desiredCapabilities);

        AndroidElement element=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"));
        element.click();

        AndroidElement element1=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='4. Default values']"));
        element1.click();

        AndroidElement element2=androidDriver.findElement(By.xpath("//android.widget.CheckBox[@resource-id='android:id/checkbox']"));
        element2.click();
    }

    @Test
    public void intro3() throws MalformedURLException {

        AndroidDriver<AndroidElement> androidDriver= new AndroidDriver(url,desiredCapabilities);

        AndroidElement element=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"));
        element.click();

        AndroidElement element1=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='4. Default values']"));
        element1.click();

        AndroidElement element2=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Edit text preference']"));
        element2.click();

        AndroidElement element3=androidDriver.findElement(By.xpath("//android.widget.EditText[@text='Default value']"));
        element3.click();
        element3.clear();
        element3.sendKeys("Hello Techtorial");

        AndroidElement element4=androidDriver.findElement(By.xpath("//android.widget.Button[@text='OK']"));
        element4.click();
    }

    @Test
    public void intro4() throws MalformedURLException {
        AndroidDriver<AndroidElement> androidDriver= new AndroidDriver(url,desiredCapabilities);

        AndroidElement element=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Preference']"));
        element.click();

        AndroidElement element1=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='4. Default values']"));
        element1.click();

        AndroidElement element2=androidDriver.findElement(By.xpath("//android.widget.TextView[@text='List preference']"));
        element2.click();

        AndroidElement element3=androidDriver.findElement(By.xpath("//android.widget.Button[@text='CANCEL']"));
        element3.click();







    }
}
