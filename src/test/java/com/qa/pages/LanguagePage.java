package com.qa.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LanguagePage extends BasePage {

	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='English' and @index='0']") private MobileElement englishlanguagebutton;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='हिंदी' and @index='1']") private MobileElement hindilanguagebutton;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='ಕನ್ನಡ' and @index='2']") private MobileElement otherlanguagebutton;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebutton;
	@AndroidFindBy (id = "in.rebase.app:id/cl_title") private MobileElement languagetitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Please Select your Language' and @index='0']") private MobileElement instructiontext1;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='You can always change this in Language Settings' and @index='1']") private MobileElement instructiontext2;

	public String getTitle() {
		String title =  getText(languagetitletxt, "Language Page Title Text is :- ");
		return title;
	}
	public String getInstruction1() {
		String title =  getText(instructiontext1, "Language Page Title Text is :- ");
		return title;
	}
	public String getInstruction2() {
		String title =  getText(instructiontext2, "Language Page Title Text is :- ");
		return title;
	}
	public LanguagePage pressOtherLangBtn() {

		click(otherlanguagebutton,"press on select other language button ");
		return this;
	}
	public LanguagePage pressHindiLangBtn() {

		click(hindilanguagebutton,"press on select hindi language button");
		return this;
	}
	public LanguagePage pressEnglishLangBtn() {

		click(englishlanguagebutton,"press on english language button");
		return this;
	}
	public PermissionPage pressContinueBtnSignin() {

		click(continuebutton,"press on continue button signin");
		return new PermissionPage();
	}
	public RegisterNameMobileNumberPage pressContinueBtnSignup() {

		click(continuebutton, "press on continue button signup");
		return new RegisterNameMobileNumberPage();
	}

}
