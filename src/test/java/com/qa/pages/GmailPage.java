package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GmailPage extends BasePage{

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Choose an account' and @index='1']") private MobileElement choosegmailaccounttitletxt;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='amit.kumar@smartcoin.co.in' and @index='1']") private MobileElement clickongmail;




    public String getTitleChooseGmailAccount() {
        String title = getText(choosegmailaccounttitletxt, "Gmail Page Title Text is:-");
        return title;
    }
    public CreatePasswordPage pressGmailId(){
        click(clickongmail,"Press On Gmail Id");
        return  new CreatePasswordPage();

    }



}
