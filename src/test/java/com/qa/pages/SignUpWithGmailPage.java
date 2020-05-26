package com.qa.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpWithGmailPage extends BasePage{



	@AndroidFindBy (id = "in.rebase.app:id/login_google") private MobileElement signinwithgmailbtn;
	@AndroidFindBy (id = "in.rebase.app:id/cl_title") private MobileElement signinwithgmailtitletxt;


	public String getTitleSignUpWithGmail() {
		String title = getText(signinwithgmailtitletxt, "Sign up With Gmail  page Title Text is:- ");
		return title;
	}

	public GmailPage pressGmailBtn() {

		click(signinwithgmailbtn,"press on sign up with gmail button");
		return new GmailPage();
	}
}
