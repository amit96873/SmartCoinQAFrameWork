package com.qa.pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WhatsupPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='+919848370141' and @index='0']") private MobileElement contact1;
    @AndroidFindBy(id = "com.whatsapp:id/send") private MobileElement send;
    @AndroidFindBy(xpath = "//android.view.View[@content_desc='https://smartcoin.page.link/cSa16XXjjWooBTn78' and @index='0']") private MobileElement link;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@text='' and @index='0']") private MobileElement browser;

    public WhatsupPage pressOnSelectedContact(){
        click(contact1,"select contact");
        return this;
    }
    public WhatsupPage pressOnSend(){
        click(send,"press on send button");
        return this;
    }
    public WhatsupPage pressOnLink(){
        click(link,"press on app Link");
        return this;
    }
}
