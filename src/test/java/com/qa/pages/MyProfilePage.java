package com.qa.pages;



import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyProfilePage extends BasePage{
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='DESIGNATION' and @index='29']") private MobileElement designationtext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='CUSTOMER RELATIONSHIP NUMBER (CRN)' and @index='0']") private MobileElement crnnumber;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Profile' and @index='0']") private MobileElement myprofilestitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='OWNER OF SHOP' and @index='0']") private MobileElement ownerofshoptext;
	@AndroidFindBy (id = "in.rebase.app:id/chat_shortcut") private MobileElement chatbtn;
	@AndroidFindBy (id = "in.rebase.app:id/fab_expand_menu_button") private MobileElement expendmenuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Documents Uploaded!' and @index='0']") private MobileElement documentsuploadedconfirmationmessage;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Profile Saved Successfully!' and @index='0']") private MobileElement editworkdetailssavedsuccesfully;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Profile Saved Successfully!' and @index='0']") private MobileElement editpersionaldetailssavedsuccesfully;





	public String getMyProfilePageTitle() {
		String title = getText(myprofilestitletext, "My Profile Page Title Text is:- ");
		return title;
	}

	public String getCRNText() throws Exception {
		return getText(scrollToElement(crnnumber,"down"),"get crn number text");

	}


	public String getDesignationText() throws Exception {
		return getText(scrollToElement(crnnumber,"up"),"get designation text");
	}





	public String getDocumentsUploadedConfirmationMessage() {
		String msg = getText(documentsuploadedconfirmationmessage, "Documents upload confirmation Message is:- ");
		return msg;
	}
	public String getEditPersionaldetailsSavedSuccessfully() {
		String msg1 = getText(editpersionaldetailssavedsuccesfully, "Persional details added message is :- ");
		return msg1;
	}
	public String getEditworkdetailsSavedSuccessfully() {
		String msg2 = getText(editworkdetailssavedsuccesfully, "Work details added message is:- ");
		return msg2;
	}
	public String getEndPageText() {
		String msg3 = getText(ownerofshoptext, "Bottom of my profile Page text is:- ");
		return msg3;
	}


	public HomePageSmartCoin pressReverseBtn() {

		click(reversebtn,"press reverse button");
		return new HomePageSmartCoin();
	}
	public ChatPage pressChatShortCutBtn() {

		click(chatbtn,"press chat short cut button");
		return new ChatPage();
	}

	public ProfileExpendMenueButonPage pressExpendMenueBtn() {
		click(expendmenuebtn,"press epend menu button");
		return new ProfileExpendMenueButonPage();
	}


}
