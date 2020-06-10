package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyReferralsPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Earn coins and spend them on different rewards!' and @index='0']") private MobileElement sugestiontext;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TOTAL COIN BALANCE' and @index='1']") private MobileElement totalcoinbalancetextkey;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
    @AndroidFindBy (id = "in.rebase.app:id/cl_title") private MobileElement myreferralspagetitle;
    @AndroidFindBy (id = "in.rebase.app:id/number_of_coins") private MobileElement numberofcoins;
    @AndroidFindBy (id = "in.rebase.app:id/generate_referral_code") private MobileElement generatereferalcode;
    @AndroidFindBy (id = "in.rebase.app:id/referral_code") private MobileElement referalcode;
    @AndroidFindBy (id = "in.rebase.app:id/referral_code_copy_icon") private MobileElement referalcodecopyicon;
    @AndroidFindBy (id = "in.rebase.app:id/referral_card_button") private MobileElement sharebutton;
    @AndroidFindBy (id = "in.rebase.app:id/home_title") private MobileElement homrtitle;
    @AndroidFindBy (id = "in.rebase.app:id/referral_desc_text_1") private MobileElement howtogetcoinskey;
    @AndroidFindBy (id = "in.rebase.app:id/referral_desc_text_2") private MobileElement howtogetcoinsvalue;


    public String getMyReferralsPageTitle() {
        String title = getText(myreferralspagetitle, "My Referrals Page Title Text");
        return title;
    }
    public String getReferralCode(){
        String referals = getText(referalcode, "referrals code  is:-"+referalcode);
        return  referals;
    }

    public String getTotalCoinBalance(){
        String coins = getText(numberofcoins, "total number of coins is:-"+numberofcoins);
        return  coins;
    }
    public SocialMediaPage pressShareBtn() {
        click(sharebutton,"press on share Button");
        return new SocialMediaPage();
    }
  public MyReferralsPage pressOnCopyIcon(){
        click(referalcodecopyicon,"pressed on referal code copy icon");
        return this;
        }

    public HomePageSmartCoin pressReverseBtn() {

        click(reversebtn,"press on Reverse Button");
        return new HomePageSmartCoin();
    }

}
