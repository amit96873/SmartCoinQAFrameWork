package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageSmartCoin extends BasePage{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SmartCoin' and @index='1']") private MobileElement homepagetitletext;


    public String getTitleHomePage() {
        String title = getText(homepagetitletext, "Home Page Title Text is :- ");
        return title;
    }
}
