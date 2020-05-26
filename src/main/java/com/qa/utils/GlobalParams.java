package com.qa.utils;

import java.security.Key;

public class GlobalParams {

    private  static ThreadLocal<String> platformName = new ThreadLocal<String>();
    private  static ThreadLocal<String> udid = new ThreadLocal<String>();
    private  static ThreadLocal<String> deviceName = new ThreadLocal<String>();
    private  static ThreadLocal<String> systemPort = new ThreadLocal<String>();
    private  static ThreadLocal<String> chromDriverPort = new ThreadLocal<String>();
    private  static ThreadLocal<String> wdaLocalPort = new ThreadLocal<String>();
    private  static ThreadLocal<String> webkitDebugProxyPort = new ThreadLocal<String>();
    private  static ThreadLocal<Boolean> fullReset = new ThreadLocal<Boolean>();
    private  static ThreadLocal<Boolean> noReset = new ThreadLocal<Boolean>();


    public void setFullReset(Boolean fullReset1){
    fullReset.set(fullReset1);
      }

      public Boolean getFullReset(){
        return fullReset.get();
      }

      public void setNoReset(Boolean noReset1){
          noReset.set(noReset1);
      }

    public  Boolean getNoReset(){

        return noReset.get();
     }


    public void setPlatformName(String platformName1){

        platformName.set(platformName1);
    }
    public String getPlatformName(){

        return platformName.get();
    }
    public  void setUdid(String udid1){
        udid.set(udid1);
    }
    public String getUdid(){
        return  udid.get();
    }
    public  void setDeviceName(String  deviceName1){
        deviceName.set(deviceName1);
    }
    public String getDeviceName(){
        return deviceName.get();
    }
    public void setSystemPort(String systemPort1){
        systemPort.set(systemPort1);
    }
    public String getSystemPort(){
        return systemPort.get();
    }
    public void setChromDriverPort(String chromDriverPort1){
        chromDriverPort.set(chromDriverPort1);
    }
    public String getChromDriverPort(){
        return chromDriverPort.get();
    }
    public void setWdaLocalPort(String wdaLocalPort1){
        wdaLocalPort.set(wdaLocalPort1);
    }

    public String getWdaLocalPort(){
        return wdaLocalPort.get();
    }

    public void setWebkitDebugProxyPort(String webkitDebugProxyPort1){
        webkitDebugProxyPort.set(webkitDebugProxyPort1);
    }
    public String getWebkitDebugProyPort(){
        return webkitDebugProxyPort.get();
    }


    public void initializeGlobalParams(){
        GlobalParams params = new GlobalParams();
        params.setPlatformName(System.getProperty("platformName","Android"));
        params.setUdid(System.getProperty("udid","86f8e4640906"));
        params.setDeviceName(System.getProperty("deviceName","Redmi 8A_Dual"));

        switch (params.getPlatformName()){
            case "Android":
                params.setSystemPort(System.getProperty("systemPort","10000"));
                params.setChromDriverPort(System.getProperty("chromDriverPort","11000"));
            break;
            case "iOS":
                params.setWdaLocalPort(System.getProperty("WdaLocalPort","10001"));
                params.setWebkitDebugProxyPort(System.getProperty("WebkitDebugProxyPort","11001"));
                break;
            default:
                throw new IllegalStateException("Invalid PlatformName!");
        }
    }
}
