package com.otus.driver;

import static com.otus.appium.Capabilities.getAppiumCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileDriver {
  public static AppiumDriver getAppiumDriver() {
    AppiumDriver driver;
    try {
      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), getAppiumCapabilities());
    } catch (MalformedURLException e) {
      throw new RuntimeException(e);
    }
    return driver;
  }
}
