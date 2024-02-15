package com.setup;

import java.net.MalformedURLException;

import java.net.URL;
import java.util.HashMap;
import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.frameworkConstants.ConfigEnum;
import com.frameworkConstants.Constants;
import com.utility.PropertiesUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public final class Driver {

	Driver() {

	}

	private WebDriver driver;

	public WebDriver getDriver(String testName, String Device, String UDID) throws MalformedURLException {
//		System.out.println("driver " + driver);
		if (Objects.isNull(driver)) {
			driver = createDriver(testName, Device, UDID);
		}

//		else if(driver.toString().contains("null"))
//		{
//		
//			driver = createDriver(browser,version);
//		}
//		System.out.println("driver2 " + driver);
//		else
//		{
//			
//		}

		return driver;
	}

	public void setDriverNull() {
		driver = null;
	}

	private WebDriver createDriver(String testName, String device, String UDID) throws MalformedURLException {
		// WebDriver driver = null;
		DesiredCapabilities dc = new DesiredCapabilities();
		if (device.equalsIgnoreCase("android")) {
			dc.setCapability("testName", testName);
			dc.setCapability("accessKey", PropertiesUtils.get(ConfigEnum.ACCESSKEY));
			dc.setCapability(MobileCapabilityType.UDID, UDID);
			dc.setCapability(MobileCapabilityType.APP, PropertiesUtils.get(ConfigEnum.ANDROIDAPP));
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, PropertiesUtils.get(ConfigEnum.APPPACKAGE));
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, PropertiesUtils.get(ConfigEnum.IOSAPPACTIVITY));
			dc.setCapability("appiumVersion", PropertiesUtils.get(ConfigEnum.APPIUMVERSION));
			driver = new AndroidDriver<>(new URL(PropertiesUtils.get(ConfigEnum.CLOUD)), dc);
		} else {
			dc.setCapability("testName", testName);
			dc.setCapability("accessKey", PropertiesUtils.get(ConfigEnum.ACCESSKEY));
			dc.setCapability(MobileCapabilityType.UDID, UDID);
			//dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
			dc.setCapability(MobileCapabilityType.APP, PropertiesUtils.get(ConfigEnum.IOSAPP));
			dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, PropertiesUtils.get(ConfigEnum.BUNDLEID));
			dc.setCapability("appiumVersion", PropertiesUtils.get(ConfigEnum.APPIUMVERSION));
			driver = new IOSDriver<>(new URL(PropertiesUtils.get(ConfigEnum.CLOUD)), dc);
		}

		return driver;
	}
//	
//		public static void endDriver() {
//			driver.quit();
//
////		if (Objects.nonNull(DriverManager.getDriver())) {
////			DriverManager.getDriver().quit();
////			DriverManager.removeDriver();
////		}
//
//	}

}
