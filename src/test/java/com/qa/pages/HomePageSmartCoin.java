package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageSmartCoin extends BasePage{
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='SmartCoin' and @index='1']") private MobileElement homepagetitletext;
    @AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement homepagechatshortcut;
    @AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc='Open' and @index='0']") private MobileElement menuebutton;
    @AndroidFindBy (xpath = "//android.widget.Button[@text='VERIFY' and @index='0']") private MobileElement numberverificationbtn;
    @AndroidFindBy (xpath = "//android.widget.Button[@text='UPLOAD' and @index='0']") private MobileElement uploadbankstatementbtn;
    @AndroidFindBy (xpath = "//android.widget.Button[@text='EARN' and @index='0']") private MobileElement earnbtn;
    @AndroidFindBy (xpath = "//android.widget.Button[@text='APPLY' and @index='0']") private MobileElement applybtn;
    @AndroidFindBy (xpath = "//android.widget.Button[@text='VIEW ALL' and @index='0']") private MobileElement viewallbtn;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='My Loan Offers' and @index='1']") private MobileElement myloanoffertitletext;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='My Coins' and @index='1']") private MobileElement mycointext;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Total Coin Balance' and @index='0']") private MobileElement totalcoinbalancetext;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='My Khata' and @index='1']") private MobileElement mykhata;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='My Profile' and @index='1']") private MobileElement myprofile;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Contact Us' and @index='1']") private MobileElement contactus;
    @AndroidFindBy (id = "in.rebase.app:id/card_sub_title") private MobileElement myloanoffersvaluetext;
    @AndroidFindBy (id = "in.rebase.app:id/home_subtitle") private MobileElement mycoinsvaluetext;
    @AndroidFindBy (xpath = "//android.widget.TextView[@text='My Utilities' and @index='1']") private MobileElement myutilitykeytext;



    public String getTitleHomePage() {
        String title = getText(homepagetitletext, "Home Page Title Text is :- ");
        return title;
    }

    public String getMyLoanOffersValueText() {
        String text = getText(myloanoffersvaluetext, "My loan offers value Text is:- ");
        return text;

    }

    public String getMyCoinValueText() {
        String text = getText(mycoinsvaluetext, "My Coin value Text is:- ");
        return text;

    }

    public String getMyUtilityKeyText() throws Exception {
        return getText(scrollToElement(myutilitykeytext,"up"),"my utility test is : "+myutilitykeytext);
    }

    public String getMyCoinKeyText() {
        String text = getText(mycointext, "My Coin key Text is:- ");
        return text;

    }

    public String getTotalCoinBalanceKeyText() {
        String text = getText(totalcoinbalancetext, "Total Coin Balance key Text is:- ");
        return text;
    }

    public String getMyLoanOfferKeyText() {
        String text = getText(myloanoffertitletext, "My Loan Offer key Tet is:- ");
        return text;

    }
    public LoanOffersPage pressViewAllBtn() {
        click(viewallbtn,"Press On View Button");
        return new LoanOffersPage();
    }

    public ApplyForLoan pressApplyBtn() {
        click(applybtn,"Press On Apply Button");
        return new ApplyForLoan();
    }

    public MyKhataPage pressMyKhataBtn() throws Exception {
        click(scrollToElement(mykhata,"up"),"clicked on my khata button");
        return new MyKhataPage();
    }
    public MyProfilePage pressMyProfileBtn() throws Exception {
        click(scrollToElement(myprofile,"up"),"clicked on my profile button");
        return new MyProfilePage();
    }
    public HelpAndSupportPage pressContactUsBtn() throws Exception {
        click(scrollToElement(contactus,"up"),"clicked on contact us button");
        return new HelpAndSupportPage();
    }

    public SmartCoinRewardsPage pressEarnBtn() {
        click(earnbtn,"Press On Earn Button");
        return new SmartCoinRewardsPage();
    }

    public MobileNumberOTPVerificationPage pressVerifyMobileNumberBtn() {
        click(numberverificationbtn,"Press On Mobile_Number_Verification Button");
        return new MobileNumberOTPVerificationPage();
    }
    public MenuPage pressMenuBtn() {
        click(menuebutton,"Press On Menu Button");
        return new MenuPage();
    }

    public ChatPage pressChatShortCutBtn() {
        click(homepagechatshortcut,"Press On Home Page Short Cut Button");
        return new ChatPage();
    }


    public UploadBankStatementsPage pressUploadBankStatementBtn() {
        click(uploadbankstatementbtn,"Press On Upload Bank Statement Button");
        return new UploadBankStatementsPage();
    }
}
