package com.testCon;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.AndroidMobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

public class Test2 {
	private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoyNjY4MDkzMywieHAucCI6MjY2ODA5MzIsInhwLm0iOjE3MDc0NjQ3MDkxNjAsImV4cCI6MjAyMjgzMjMwMCwiaXNzIjoiY29tLmV4cGVyaXRlc3QifQ.PRhVeMQ6L7kkJ_ZpzpQ_o6Hj_EjsWnO9NIHZ4fYmI3Y";
	@Test
	public void test1() throws MalformedURLException {
		AndroidDriver driver = null;
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("testName", "Android Mobile Native Test Execution");
		dc.setCapability("accessKey", accessKey);
		dc.setCapability("deviceName", "RF8MA1SHX3H");
		dc.setCapability("deviceQuery", "@os='android'");
		dc.setCapability("deviceModel", "RF8MA1SHX3H");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "device OS_version");
		dc.setCapability(MobileCapabilityType.UDID, "RF8MA1SHX3H");
		dc.setCapability(MobileCapabilityType.APP, "application_location_in_SeeTest");
		
//		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "application_package_name");
//		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "application_activity_name");
		
		dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
        //dc.setCapability(MobileCapabilityType.APP, "com.experitest.ExperiBank/.LoginActivity");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
        dc.setCapability("appiumVersion", "2.2.2");
		driver = new AndroidDriver<>(new URL("https://cloud.seetest.io/wd/hub"), dc);
	}

}
