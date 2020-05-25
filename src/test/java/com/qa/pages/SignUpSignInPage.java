package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpSignInPage extends BasePage{
    @AndroidFindBy(id = "in.rebase.app:id/sign_up_button") private MobileElement signupbutton;
    @AndroidFindBy (id = "in.rebase.app:id/sign_in_button") private MobileElement signinbutton;
    @AndroidFindBy (id = "in.rebase.app:id/carousel_heading") private MobileElement titletxt;
    @AndroidFindBy (id = "in.rebase.app:id/carousel_text") private MobileElement carouseltxt;
    @AndroidFindBy (id = "in.rebase.app:id/sign_in_text") private MobileElement signintxt;

    public String getTitle() {
        String title =  getText(titletxt, "Sign up/Sign in Page Title Text is :- ");
        return title;
    }


    public String getCarouselText() {
        String title =  getText(carouseltxt, "Sign up/Sign in Page carousel Text is :- ");
        return title;
    }


    public String getSignInText() {
        String title =  getText(signintxt, "Sign up/Sign in Page Sign In Text is :- ");
        return title;
    }

    public LanguagePage pressSignUpBtn() {

        click(signupbutton,"press on signup button");
        return new LanguagePage();
    }

    public SignUpSignInPage pressOnTitleText() {

        click(titletxt,"press on title text");
        return this;
    }

    public LanguagePage pressSignInBtn() {
        click(signinbutton,"press on signin button");
        return new LanguagePage();
    }

}
