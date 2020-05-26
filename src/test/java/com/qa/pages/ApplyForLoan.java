package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApplyForLoan extends BasePage{
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Apply for Loan' and @index='0']") private MobileElement applyforloantitletext;
	@AndroidFindBy (id = "in.rebase.app:id/actionButton") private MobileElement durationbarbtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement applybtn;
	@AndroidFindBy (id = "in.rebase.app:id/error") private MobileElement errortext;
	@AndroidFindBy (id = "in.rebase.app:id/spinner") private MobileElement selectreasionspinnerbtn;
	
	
	
	public String getTitleApplyForLoanPage() {	
		String title =  getText(applyforloantitletext, "Apply For Loan Page Title Text");
		return title;
		
	}
	
	public LoanApplicationSubmittedPage pressApplyBtn() {
		click(applybtn, "Press On Apply Button");
		return new LoanApplicationSubmittedPage();
	}
	public WhyDoYouNeedThisLoanPage pressSelectReasionBtn() {
		click(selectreasionspinnerbtn,"Press On Select Reasion Button");
		return new WhyDoYouNeedThisLoanPage();
	}
	
	
	public String getErrorText() {	
		return getText(errortext, "Error Text is:-");
		
	}
	public ApplyForLoan pressDurationBarBtn() {
		click(durationbarbtn,"press on Duration Bar Button");
		return this;
	}
	

}
