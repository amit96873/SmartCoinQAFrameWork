package com.qa.pages;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MobileGalryImageSelectPage extends BasePage {
	
	
	@AndroidFindBy (xpath = "//android.widget.TextView[@text='Select a photo' and @index='1']") private MobileElement galarypagetitletext;
	

}
