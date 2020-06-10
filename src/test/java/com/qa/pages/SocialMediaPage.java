package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SocialMediaPage extends  BasePage{
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@text='' and @index='1']") private MobileElement whatsup;

    public WhatsupPage pressShareBtn() {
        click(whatsup,"press on whatsup");
        return new WhatsupPage();
    }
}
