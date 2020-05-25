package com.qa.utils;

import com.google.gson.internal.$Gson$Preconditions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.cucumber.java.en_scouse.An;

import java.io.IOException;

public class DriverManager {

    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    TestUtils utils = new TestUtils();

    public AppiumDriver getDriver() {
        return driver.get();
    }

    public void setDriver(AppiumDriver driver1) {
        driver.set(driver1);
    }

    public void initializeDriver() throws IOException {
        AppiumDriver driver = null;
        GlobalParams params = new GlobalParams();
        PropertyManager props = new PropertyManager();
        if (driver == null) {
            try {
                utils.log().info("initializing Appium Driver");
                switch (params.getPlatformName()) {
                    case "Android":
                        driver = new AndroidDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                        break;
                    case "iOS":
                        driver = new IOSDriver(new ServerManager().getServer().getUrl(), new CapabilitiesManager().getCaps());
                        break;
                }
                if (driver == null) {
                    throw new Exception("Driver is null.ABORT!!!");
                }
            utils.log().info("driver is initialized");
            this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure.ABORT!!!" + e.toString());
                throw e;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}