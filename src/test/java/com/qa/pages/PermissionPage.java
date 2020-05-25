package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.aspectj.apache.bcel.generic.RET;

public class PermissionPage extends BasePage {

	@AndroidFindBy (id = "com.android.packageinstaller:id/do_not_ask_checkbox") private MobileElement dontaskagain;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='This is for verification purposes only. Please enable your required permissions and help us serve you better.' and @index='0']") private MobileElement nopermissionmessage;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Give us the okay' and @index='0']") private MobileElement giveustheokaykey;
	@AndroidFindBy (id = "in.rebase.app:id/privacy_policy_msg") private MobileElement giveustheokayvalue;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Financial Sms' and @index='0']") private MobileElement smskey;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='We collect and monitor financial SMS to create a financial summary for your profile, which includes only financial and transactional SMS about bank related transactions, name of transacting parties, description of the transaction, amount of transaction for performing credit risk assessment - all to provide the best loan offers; and to keep the loan process convenient and seamless. We store this financial information on our secure servers. No personal SMS data is ever collected, read or stored by our app.' and @index='1']") private MobileElement smsvalue;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Contacts' and @index='0']") private MobileElement contactskey;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]") private MobileElement contactsvalue;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Phone' and @index='0']") private MobileElement phonekey;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Our app collects and monitors specific information about your device including your hardware model, RAM, storage, unique device identifiers like IMEI, serial number, SSAID, SIM information that includes network operator, roaming state, MNC and MCC codes, WIFI information that includes MAC address and mobile network information to uniquely identify devices and to prevent fraud. This also helps in enriching your credit profile and providing you with the best loan offers according to your profile.' and @index='1']") private MobileElement phonevalue;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Location' and @index='0']") private MobileElement locationkey;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='We collect and monitor the information about the location of your device to service your loan application, to reduce risk associated with your loan application and to provide better loan offers. This also helps us to verify the address and make a better credit risk decision.' and @index='1']") private MobileElement locationvalue;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Installed Apps' and @index='0']") private MobileElement installedappskey;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]") private MobileElement installedappsvalue;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Experian Report' and @index='0']") private MobileElement eperianreportkey;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='We require authorisation for Smartcoin to fetch your Credit Report from Experian (Credit Information Company) and agree to the Terms and Conditions. This helps in making a better credit risk assessment of your profile and providing the best loan offers to you.' and @index='1']") private MobileElement eperialreportvalue;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='ALLOW' and @index='1']") private MobileElement aadharfrontallowbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='AGREE AND CONTINUE' and @index='2']") private MobileElement agreeandcontinuebutton;
	@AndroidFindBy (id = "com.android.packageinstaller:id/permission_allow_button") private MobileElement allowbutton;
	@AndroidFindBy (id = "com.android.packageinstaller:id/permission_deny_button") private MobileElement denybutton;
	@AndroidFindBy (id = "in.rebase.app:id/login_google") private MobileElement signupwithgamil;
	@AndroidFindBy (id = "com.google.android.gms:id/account_name") private MobileElement gmailid;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Permissions' and @index='0']") private MobileElement permissiontitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Allow SmartCoin to send and view SMS messages?' and @index='1']") private MobileElement sendviewsmstitletext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Allow SmartCoin to access your contacts?' and @index='1']") private MobileElement accesscontactstitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Allow SmartCoin to make and manage phone calls?' and @index='1']") private MobileElement managephonecallstitletxt;
	@AndroidFindBy (id = "com.android.packageinstaller:id/permission_message") private MobileElement locationtitletxt;
	@AndroidFindBy (id = "com.android.packageinstaller:id/permission_message") private MobileElement permissionmessagetext;


	public String getGWarningText() {
		String key =  getText(nopermissionmessage, "Permission Warning Text is :- ");
		return key;
	}

	public String getGiveUsTheOkayKeyText() {
		String key =  getText(giveustheokaykey, "Give us the okay key Text is :- ");
		return key;
	}

	public String getGiveUsTheOkayValueText() {
		String value =  getText(giveustheokayvalue, "Give us the okay value Text is :- ");
		return value;
	}


	public String getFinancialSmsKeyText() {
		String key =  getText(smskey, "Sms Key text is :- ");
		return key;
	}

	public String getFinancialSmsValueText() {
		String value =  getText(smsvalue, "Financial sms value Text is :- ");
		return value;
	}


	public String getContactsKeyText() throws Exception {
		return getText(scrollToElement(contactskey,"up"),"Contacts Key text is:"+contactskey) ;

	}

	public String getContactsValueText() throws Exception {
		return getText(scrollToElement(contactsvalue,"up"),"Contacts Value Text is:"+contactsvalue);

	}



	public String getPhoneKeyText() throws Exception {
		return getText(scrollToElement(phonekey,"up"),"Phone Key Text Is: " +phonekey);

	}

	public String getPhoneValueText() throws Exception {
		return getText(scrollToElement(phonevalue,"up"),"Phone Value Text is: "+ phonevalue);

	}


	public String getLocationKeyText() throws Exception {
		return getText(scrollToElement(locationkey,"up"),"Location key text is : "+ locationkey);

	}

	public String getLocationValueText() throws Exception {
		return getText(scrollToElement(locationvalue,"up"),"Location Value text is :"+locationvalue);

	}


	public String getInstalledAppsKeyText() throws Exception {
		return getText(scrollToElement(installedappskey,"up"),"Installed Apps Key Text is:"+installedappskey);

	}

	public String getInstalledAppsValueText() throws Exception {
		return getText(scrollToElement(installedappsvalue,"up"),"Installed Apps Value Text is:"+installedappsvalue);
	}


	public String getExperianReportKeyText() throws Exception {
		return getText(scrollToElement(eperianreportkey,"up"),"Experian Report key text is:"+eperianreportkey);

	}

	public String getExperianReportValueText() throws Exception {
		return getText(scrollToElement(eperialreportvalue,"up"),"Experian Report Value text is:"+eperialreportvalue);

	}



	public String getTitlepermission() {
		String title = getText(permissiontitletxt, "Permission page title is:- ");
		return title;
	}

	public String getPermissionMessage() {
		String title = getText(permissionmessagetext, "Title of  permission Message is:- ");
		return title;
	}




	public String getTitleSms() {
		String title = getText(sendviewsmstitletext, "Title of sms permission page is:- ");
		return title;
	}

	public String getTitleContats() {
		String title = getText(accesscontactstitletxt, "title of contacts permission page is:- ");
		return title;
	}

	public String getTitlePhoneCall() {
		String title = getText(managephonecallstitletxt, "title of phone call permission page is:- ");
		return title;
	}

	public String getTitleLocation() {
		String title = getText(locationtitletxt, "title of location permission page is:- ");
		return title;
	}
	public PermissionPage pressagreeAndContinuebtn() {

		click(agreeandcontinuebutton,"press agree and continue button");
		return this;
	}

	public PermissionPage pressCheckBoxDontAskAgain() {
		click(dontaskagain,"press on check box don't ask again");
		return this;
	}

	public PermissionPage pressdenyButton() {

		click(denybutton,"press on deny button");
		return this;
	}
	public PermissionPage pressLoginWithGmailButton() {

		click(signupwithgamil,"press on sign up with gmail button");
		return this;
	}
	public PermissionPage pressOnGmailId() {

		click(gmailid,"press on gmail id button");
		return this;
	}

	public PermissionPage pressallowButton() {
		click(allowbutton,"press on allow button");
		return this;
	}


}
