package com.qa.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AddBankAccountSugestationPage extends BasePage {
	
	
	@AndroidFindBy (id = "in.rebase.app:id/question") private MobileElement helpaddbanktitletext;
	
	@AndroidFindBy (id = "in.rebase.app:id/negative_button") private MobileElement okbtn;
	
	public String getHelpAddBankAccountDetailsPageTitle() {
		String title =getText(helpaddbanktitletext, "Help Add Bank Account Page Title is :- ");
		return title;
		
	}
	
	
	public AddBankAccountWithChequeLeafPage pressCheckLeafSuggestionPageOkButton() {
		
		click(okbtn, "press OK button");	
		return new AddBankAccountWithChequeLeafPage();
	}
	

	public AddBankAccountWithIfscCodePage pressIfscCodeSuggestionPageOkButton() {
		
		click(okbtn, "press Ok button");	
		return new AddBankAccountWithIfscCodePage();
	}


}
