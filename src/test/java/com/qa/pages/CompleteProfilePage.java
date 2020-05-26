package com.qa.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CompleteProfilePage extends BasePage {

	@AndroidFindBy (id = "in.rebase.app:id/title") private MobileElement titletext;


	public String getTitleCurrentLoanPage() {	
		String title =  getText(titletext, "Current Loan Page Title Text is:- ");
		return title;

	}
}
