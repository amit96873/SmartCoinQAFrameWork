package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UploadBankStatementSugestationPage extends BasePage {
	
	
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement okbtn;
	@AndroidFindBy (id = "in.rebase.app:id/question") private MobileElement helpbankstatementtitletext;
	
	public String getSelectBankStatementHelpPageTitle() {
		String title = getText(helpbankstatementtitletext, "upload bank statement sugestation page title text is:- ");
		return title;
	}
	

	public UploadBankStatementsPage pressOkBtn() {
		click(okbtn,"press on ok button");
		return new UploadBankStatementsPage();
	}
}
