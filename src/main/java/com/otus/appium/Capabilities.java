package com.otus.appium;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {
  public static DesiredCapabilities getAppiumCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setPlatform(Platform.ANDROID);
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
    capabilities.setCapability(MobileCapabilityType.APP, "D:/Automation/block2/mobilePractice/src/main/resources/app_release-61572-1d4406.apk");
    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
    capabilities.setCapability("autoGrantPermission", true);
    return capabilities;
  }
}
