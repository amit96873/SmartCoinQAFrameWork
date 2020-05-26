package com.qa.utils;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class CapabilitiesManager {

    TestUtils utils = new TestUtils();

    public DesiredCapabilities getCaps() throws IOException {
        GlobalParams params = new GlobalParams();
        Properties props = new PropertyManager().getProps();
       try {
           utils.log().info("getting Capabilities");
      DesiredCapabilities caps = new DesiredCapabilities();
           caps.setCapability(MobileCapabilityType.APPLICATION_NAME, params.getPlatformName());
           caps.setCapability(MobileCapabilityType.UDID, params.getUdid());
           caps.setCapability(MobileCapabilityType.DEVICE_NAME, params.getDeviceName());
           caps.setCapability(MobileCapabilityType.FULL_RESET, props.getProperty("fullReset"));
           caps.setCapability(MobileCapabilityType.NO_RESET,props.getProperty("noReset"));

           switch (params.getPlatformName()){
               case "Android":
                   caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("AndroidAutomationName"));
                   caps.setCapability("appPackage",props.getProperty("androidAppPackage"));
                   caps.setCapability("appActivity",props.getProperty("androidAppActivity"));
                   caps.setCapability("systemPort", params.getSystemPort());
                   caps.setCapability("chromeDriverPort",params.getChromDriverPort());
//                   String androidAppUrl = getClass().getResource(props.getProperty("androidAppLocation")).getFile();
                   String androidAppUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
                           +File.separator + "resources" + File.separator + "apps" + File.separator + "app-release.apk";
                   utils.log().info("appUrl is" +androidAppUrl);
                   caps.setCapability("app", androidAppUrl);
           break;
               case "iOS":
                   caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iOS Automation Name"));
                   String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
                   utils.log().info("App Url is" + iOSAppUrl);
                   caps.setCapability("bundleId", props.getProperty("iOSBundleId"));
                   caps.setCapability("wdsLocalPort",props.getProperty("wdaLocalPort"));
                   caps.setCapability("webKitDebugProxyPort", props.getProperty("webKitDebugProxyPort"));
                   caps.setCapability("app", iOSAppUrl);
           break;

           }
        return  caps;

       }catch (Exception e){
     e.printStackTrace();
     utils.log().fatal("failed to load capabilities. Abort!!" + e.toString());
     throw e;
       }
    }
}
