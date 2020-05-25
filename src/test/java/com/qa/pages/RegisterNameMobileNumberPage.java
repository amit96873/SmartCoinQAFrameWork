
package com.qa.pages;
import org.openqa.selenium.By;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterNameMobileNumberPage extends BasePage {

	TestUtils utils = new TestUtils();
	@AndroidFindBy (id = "in.rebase.app:id/primary_action_text") private MobileElement regcontinuebutton;	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Need Instant Loan? Register with us...' and @index='1']") private MobileElement registernamenumtitletxt;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Full Name' and @index='2']") private MobileElement upfullnamelayer;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Mobile Number' and @index='2']") private MobileElement upmobilenumberlayer;
	@AndroidFindBy (id = "in.rebase.app:id/name") private MobileElement fullnameTxtFld;
	@AndroidFindBy (id = "in.rebase.app:id/mobile_number") private MobileElement mobileNumberTxtFld;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Mobile No.' and @index='0']") private MobileElement errortextformobilenumber;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Invalid Name' and @index='0']") private MobileElement errortextforname;
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='My Utilities' and @index='1']") private By myutilitytext;
	public String getTitle() {
		String title = getText(registernamenumtitletxt, "Register name and Mobile number Page Title Text is:- ");
		return title;
	}
	public RegisterNameMobileNumberPage pressUpFullName() {
		click(upfullnamelayer,"press Enter name edit text");
		return this;
	}
	public RegisterNameMobileNumberPage pressOnTitle() {

		click(registernamenumtitletxt,"press on title");
		return this;
	}
	public RegisterNameMobileNumberPage enterFullName(String fullname) {
		click(upfullnamelayer,"press enter name edit text");
		clear(fullnameTxtFld);
		sendKeys(fullnameTxtFld, fullname,"Full Name is:-  " + fullname);
		click(registernamenumtitletxt);
		return this;

	}
	public RegisterNameMobileNumberPage pressUpMobileNumber() {

		click(upmobilenumberlayer,"press Enter mobile number edit text");
		return this;
	}

	public RegisterNameMobileNumberPage enterMobileNumber(String mobileNumber) {
		click(upmobilenumberlayer,"press enter mobile number edit text");
		clear(mobileNumberTxtFld);
		sendKeys(mobileNumberTxtFld, mobileNumber,"Mobile Number is :-" + mobileNumber);
		click(registernamenumtitletxt);
		return this;
	}
	public RegisterNameMobileNumberPage clearNameTextField() {
		clear(fullnameTxtFld);
		return this;
	}
	public RegisterNameMobileNumberPage clearMobileNumberTextField() {
		clear(mobileNumberTxtFld);
		return this;
	}

	public String getErrTxtMobileNumber() {

		String MobileNumberError =  getText(errortextformobilenumber,"Error Mobile Number Text is:- ");
		return MobileNumberError;
	}


	public String getErrTxtName() {

		String nameError= getText(errortextforname,"Error Full Name Text is :- ");
		return nameError;
	}

	public PermissionPage pressRegContinueBtn() {
		click(registernamenumtitletxt);
		click(regcontinuebutton,"Press Register Continue button");
		return new PermissionPage();
	}


}
