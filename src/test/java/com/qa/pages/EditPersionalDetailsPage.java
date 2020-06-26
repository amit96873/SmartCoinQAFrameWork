package com.qa.pages;

import org.openqa.selenium.By;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditPersionalDetailsPage extends BasePage{

	TestUtils utils = new TestUtils();
	@AndroidFindBy (id = "in.rebase.app:id/name") private MobileElement enternametext;
	@AndroidFindBy (id = "in.rebase.app:id/mobile_number") private MobileElement entermobilenumbertext;
	@AndroidFindBy (id = "in.rebase.app:id/dob") private MobileElement dobspinner;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Trans' and @index='2']") private MobileElement transgender;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Female' and @index='1']") private MobileElement famale;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Male' and @index='0']") private MobileElement male;
	@AndroidFindBy (id = "in.rebase.app:id/residence_address") private MobileElement editaddresstext;
	@AndroidFindBy (id = "in.rebase.app:id/residence_pincode") private MobileElement pincodeedittext;
	@AndroidFindBy (id = "in.rebase.app:id/father_name") private MobileElement fathersnameedittext;
	@AndroidFindBy (id = "in.rebase.app:id/mother_name") private MobileElement mothersnameedittext;
	@AndroidFindBy (id = "in.rebase.app:id/cl_title") private MobileElement editpersionaldetailstitletext;
	@AndroidFindBy (xpath = "//android.widget.ImageButton[@text='' and @index='0']") private MobileElement reversebtn;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='Yes' and @index='0']") private MobileElement yesbtn;
	@AndroidFindBy (xpath = "//android.widget.RadioButton[@text='No' and @index='1']") private MobileElement nobtn;
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement continuebtn;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Are you married?' and @index='9']") private By areyoumarriedtext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Full Name?' and @index='2']") private By fullnametext;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Name' and @index='0']") private By errormessageofname;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Mobile No.' and @index='0']") private By errormessageofmobilenumber;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='This field is required' and @index='0']") private By errormessageofthisfieledisrequired;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid pin code' and @index='0']") private By errormessageofpincode;


	public String getEditPersionalDetailsTitleText() {
		String title = getText(editpersionaldetailstitletext, "Edit Persional Details Page Title is:- ");
		return title;
	}
	public String getFullNameErrorText(){
		return getText(errormessageofname,"full name error text is:-"+errormessageofname);
	}
	public String getFathersNameErrorText(){
		return getText(errormessageofname,"fathers name error text is:-"+errormessageofname);
	}
	public String getMothersNameErrorText(){
		return getText(errormessageofname,"mothers name error text is:-"+errormessageofname);
	}
	public String getMobileNumberErrorText(){
		return getText(errormessageofmobilenumber,"mobile number error text is:-"+errormessageofmobilenumber);
	}
	public String getCurrentAddressErrorText(){
		return getText(errormessageofthisfieledisrequired,"current address error text is:-"+errormessageofthisfieledisrequired);
	}
	public String getPinCodeErrorText(){
		return getText(errormessageofpincode,"pin code error text is:-"+errormessageofpincode);
	}

	public SelectDOBPage pressDOBSpinner() {
		click(dobspinner,"Press On DOB Spinner Button");
		return new SelectDOBPage();
	}

	public EditPersionalDetailsPage pressMariedYesRadioBtn() {
		click(yesbtn,"Press On Married Yes Button");
		return this;
	}
	public EditPersionalDetailsPage pressMariedNoRadioBtn() {
		click(nobtn,"Press On Married No Button");
		return this;
	}
	public MyProfilePage pressReverseBtn() {
		click(reversebtn,"Press On Reverse Button");
		return new MyProfilePage();
	}
	public MyProfilePage pressContinueBtn() {
		click(continuebtn,"Press On Continue Button");
		return new MyProfilePage();
	}

	public EditPersionalDetailsPage pressMailRadioBtn() {
		click(male,"Press On Mail Button");
		return this;
	}
	public EditPersionalDetailsPage pressFemaleRadioBtn() {
		click(famale,"Press On Famail Button");
		return this;
	}
	public EditPersionalDetailsPage pressTransgenderRadioBtn() {
		click(transgender,"Press On Transgender Button");
		return this;
	}
	public EditPersionalDetailsPage enterFullName(String fullname) {
		click(enternametext,"Press On Enter Name Edit Text ");
		clear(enternametext);
		//		utils.log().info("Full Name is:-  " + fullname);
		sendKeys(enternametext, fullname,"Full Name is:-  " + fullname);
		return this;

	}
	public EditPersionalDetailsPage enterMobileNumber(String mobileNumber) {
		click(entermobilenumbertext,"Press on Enter Mobile Number Edit Text");
		clear(entermobilenumbertext);
		//		utils.log().info("Mobile Number is :-" + mobileNumber);
		sendKeys(entermobilenumbertext, mobileNumber,"Mobile Number is :-" + mobileNumber);
		return this;
	}
	public EditPersionalDetailsPage enterCurrentAddress(String address) {
		click(editaddresstext,"Press Enter Address Edit Text ");
		clear(editaddresstext);
		//		utils.log().info(" Current Address is :-" + address);
		sendKeys(editaddresstext, address," Current Address is :-" + address);
		return this;
	}
	public EditPersionalDetailsPage enterPinCode(String pincode) {
		click(pincodeedittext,"Press On Enter Pin Code Edit text");
		clear(pincodeedittext);
		//		utils.log().info(" Pin Code is :-" + pincode);
		sendKeys(pincodeedittext, pincode," Pin Code is :-" + pincode);
		return this;
	}
	public EditPersionalDetailsPage enterFathersName(String fathersname) {
		click(fathersnameedittext,"Press Enter Fathers Name Edit Text");
		clear(fathersnameedittext);
		//		utils.log().info(" Fathers Name is :-" + fathersname);
		sendKeys(fathersnameedittext, fathersname," Fathers Name is :-" + fathersname);
		return this;
	}
	public EditPersionalDetailsPage enterMothersname(String mothersname) {
		click(mothersnameedittext,"Press Enter Mothers Nmae Edit Text");
		clear(mothersnameedittext);
		//		utils.log().info(" Mothers Name is :-" + mothersname);
		sendKeys(mothersnameedittext, mothersname," Mothers Name is :-" + mothersname);
		return this;
	}

}
