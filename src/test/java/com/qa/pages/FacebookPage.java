package com.qa.pages;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FacebookPage extends BasePage {
	TestUtils utils = new TestUtils();
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='English (UK)' and @index='0']") private MobileElement english;
	@AndroidFindBy (xpath = "//android.widget.EditText[@text='' and @index='0']") private MobileElement usernameTxtFld;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.EditText") private MobileElement passwordTxtFld;
	@AndroidFindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button") private MobileElement loginbtn;
	@AndroidFindBy (xpath = "//android.view.View[@text='facebook' and @index='0']") private MobileElement facebooktitletxt;

	public String getTitleFacebookPage() {
		String title = getText(facebooktitletxt, "FaceBook Page Title Text is:-");
		return title;
	}

	public FacebookPage enterUserName(String username) {
		clear(usernameTxtFld);
		//		utils.log().info("UserName is:-  " + username);
		sendKeys(usernameTxtFld, username,"UserName is:-  " + username);
		return this;

	}
	public FacebookPage enterPassword(String password) {
		clear(passwordTxtFld);
		//		utils.log().info("Password is:-  " + password);
		sendKeys(passwordTxtFld, password,"Password is:-  " + password);
		return this;

	}
	public ContinueLoginWithFbPage pressLoginbtn() {

		click(loginbtn,"Press On Login Button");
		return new ContinueLoginWithFbPage();
	}
	public FacebookPage pressOnEnglishButton() {

		click(english,"Press On fb English lang Button");
		return this;
	}
}
