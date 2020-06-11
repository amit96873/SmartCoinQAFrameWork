package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FAQPage extends BasePage {


	@AndroidFindBy (xpath = "//android.widget.TextView[@text='What is SmartCoin?' and @index='0']") private MobileElement aboutsmartcoinquection1english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How does SmartCoin work?' and @index='0']") private MobileElement aboutsmartcoinquection2english;
	@AndroidFindBy (xpath = "//android.view.View[@text='SmartCoin is a mobile application based online loan provider which makes it easier for anyone to borrow cash in a fast and convenient manner. We believe getting a loan should be an easy and pleasant experience, just like online shopping, and not tiring or embarrassing. SmartCoin is like a friend you can borrow from without hesitation. In fact, the more you borrow and repay on time, the better it becomes for you.' and @index='1']") private MobileElement aboutsmartcoinanswer1english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='What details are required for registration?' and @index='0']") private MobileElement myRegquection1english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@content_desc='Why am I not able to receive the OTP for completing my registration?' and @index='0']") private MobileElement myRegquection2english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='When will I get loan offers?' and @index='0']") private MobileElement myRegquection3english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How can I edit my Profile details (like phone number, work details etc)?' and @index='0']") private MobileElement myprofilequection1english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How can I change my bank account details?' and @index='0']") private MobileElement myprofilequection2english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How can I change my phone number?' and @index='0']") private MobileElement myprofilequection3english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='What KYC documents are needed to apply for a loan?' and @index='0']") private MobileElement myDocumentsquection1english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How can I upload my ID Proof and Address Proof documents on the app?' and @index='0']") private MobileElement myDocumentsquection2english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Which documents can be used for current address proof?' and @index='0']") private MobileElement myDocumentsquection3english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How can I upload my selfie photograph on the app?' and @index='0']") private MobileElement myDocumentsquection4english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='When will my KYC documents be approved?' and @index='0']") private MobileElement myDocumentsquection5english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Can I send my KYC documents over e-mail? How long will it take to process?' and @index='0']") private MobileElement myDocumentsquection6english;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How do you decide my eligibility and loan amount limit?' and @index='0']") private MobileElement myloanofferquectionfirstenglish;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='What is a loan recall?' and @index='0']") private MobileElement myloanofferquectionlastenglish;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How should I repay my loan?' and @index='0']") private MobileElement mypaymentsquectionfirstenglish;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='When my CIBIL Score will be updated?' and @index='0']") private MobileElement mypaymentsofferquectionlastenglish;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='What is the “My Coins” section?' and @index='0']") private MobileElement mycoinsquectionfirstenglish;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='How do I use my coins?' and @index='0']") private MobileElement mycoinsofferquectionlastenglish;


	@AndroidFindBy (xpath = "//android.widget.TextView[@text='FAQ' and @index='0']") private MobileElement faqtitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ABOUT SMARTCOIN' and @index='1']") private MobileElement aboutsmartcoin;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MY REGISTRATION' and @index='1']") private MobileElement myregestration;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MY PROFILE and @index='0']") private MobileElement myprofile;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MY KYC DOCUMENTS' and @index='1']") private MobileElement mykycdocuments;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MY LOAN OFFERS' and @index='1']") private MobileElement myloanoffers;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MY PAYMENTS' and @index='1']") private MobileElement mypayments;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MY COINS & REWARDS' and @index='1']") private MobileElement mycoins;
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='MY KHATA' and @index='1']") private MobileElement mykhata;
	@AndroidFindBy(xpath = "//android.view.View[@text='' and @index='0']") private MobileElement close;
	@AndroidFindBy (xpath = "//android.view.View[@text='English' and @index='0']") private MobileElement english;
	@AndroidFindBy (xpath = "//android.view.View[@text='हिंदी' and @index='2']") private MobileElement hindi;
	@AndroidFindBy (xpath = "//android.view.View[@text='ಕನ್ನಡ' and @index='4']") private MobileElement kanada;



	public FAQPage pressOnEnglish(){
		click(english,"pressed on english language");
		return this;
	}
	public FAQPage pressOnHindi(){
		click(hindi,"pressed on hindi language");
		return this;
	}
	public  FAQPage pressOnKanada(){
		click(kanada,"pressed on Kanada language");
		return this;
	}
	public  FAQPage pressOnAboutSmartCoin(){
		click(aboutsmartcoin,"pressed on about smartCoin");
		return this;
	}
	public  FAQPage pressOnMyRegistration(){
		click(myregestration,"pressed on My Registration");
		return this;
	}
	public  FAQPage pressOnMyProfile(){
		click(myprofile,"pressed on My Profile");
		return this;
	}

	public  FAQPage pressOnMyKYCDocuments(){
		click(mykycdocuments,"pressed on My KYC Documents");
		return this;
	}
	public  FAQPage pressOnMyLoanOffer(){
		click(myloanoffers,"pressed on My Loan Offer");
		return this;
	}
	public  FAQPage pressOnMyPayments(){
		click(mypayments,"pressed on My Payments");
		return this;
	}
	public  FAQPage pressOnMyCoins(){
		click(mycoins,"pressed on My Coins");
		return this;
	}

	public  FAQPage pressOnMyKhata(){
		click(mykhata,"pressed on My Khata");
		return this;
	}

	public  FAQPage pressOnClose(){
		click(close,"pressed on Close");
		return this;
	}
	public String getFAQPageTitle() {
		String title = getText(faqtitletext, "FAQ Page Title Text is:-");
		return title;
	}
    public HomePageSmartCoin pressReverseBtn() {
		
		click(reversebtn,"Press On Reverse Button");
		return new HomePageSmartCoin();
	}

	public ChatPage pressChatShortCutBtn() {
	
	click(chatbtn,"Press On chat Button");
	return new ChatPage();
}

}
