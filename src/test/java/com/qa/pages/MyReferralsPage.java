package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyReferralsPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
    @AndroidFindBy (id = "in.rebase.app:id/cl_title") private MobileElement myreferralspagetitle;


    public String getMyReferralsPageTitle() {
        String title = getText(myreferralspagetitle, "My Referrals Page Title Text");
        return title;
    }

    public HomePageSmartCoin pressReverseBtn() {

        click(reversebtn,"press on Reverse Button");
        return new HomePageSmartCoin();
    }

}
