package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CallPage extends BasePage{
	
	@AndroidFindBy (id = "com.google.android.dialer:id/dialpad_floating_action_button") private MobileElement callbtn;

}
