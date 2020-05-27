package com.qa.pages;



import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectBankPage  extends BasePage{

	@AndroidFindBy (xpath = "//android.widget.TextView[@text='BANK NAME' and @index='0']") private MobileElement selectbanktitletext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Start typing to search...' and @index='0']") private MobileElement serchbanknameedittext;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='ADCB' and @index='0']") private MobileElement acdbbankbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='AU SMALL FINANCE BANK' and @index='0']") private MobileElement ausmallfinancebbankbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='ACME BANK LTD.' and @index='0']") private MobileElement amcbankbtn;
	@AndroidFindBy (xpath = "//android.widget.Button[@text='ADARSH BANK' and @index='0']") private MobileElement adarshbankbtn;

	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;

	public String getSelectBankPageTitle() {
		String title =getText(selectbanktitletext, "Select Bank Page Title is:- ");
		return title;
	}


}
