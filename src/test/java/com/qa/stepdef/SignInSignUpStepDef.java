package com.qa.stepdef;
import com.qa.pages.*;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.af.En;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.jv.Lan;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;

public class SignInSignUpStepDef {

    @Given("^Open SmartCoin App and clicked on sign up button then got language page select english language and clicked on continue button then get Registration page$")
    public void OpenSmartCoinAppandclickedOnSignupButtonThenGotLanguagePageSelectEnglishLanguageAndClickedOnContinueButtonThenGetRegistrationPage() {
        new SignUpSignInPage().pressSignUpBtn();
        new LanguagePage().pressEnglishLangBtn();
        new LanguagePage().pressContinueBtnSignup();
    }

    @When("^i enter invalid name as\"([^\"]*)\"$")
    public void iEnterInvalidNameAs(String fullname) {
        new RegisterNameMobileNumberPage().enterFullName(fullname);

    }
    @When("^i enter mobile number as\"([^\"]*)\"$")
    public void iEnterMobileNumberAs(String mobilenumber) {
        new RegisterNameMobileNumberPage().enterMobileNumber(mobilenumber);

    }

    @When("^i clicked on continue button$")
    public void iClickedOnContinueButton() {
        new RegisterNameMobileNumberPage().pressRegContinueBtn();

    }
    @Then("^registration should failed with Name Error message\"([^\"]*)\"$")
    public void registrationShouldFailedWithNameErrorMessageInvalidName(String err) {
        Assert.assertTrue(new RegisterNameMobileNumberPage().getErrTxtName().equalsIgnoreCase(err));

    }
    @When("^i enter name as\"([^\"]*)\"$")
    public void iEnterNameAs(String fullname) {
        new RegisterNameMobileNumberPage().enterFullName(fullname);

    }
    @When("^i enter invalid mobile number as\"([^\"]*)\"$")
    public void iEnterinvalidMobileNumberAs(String mobilenumber) {
        new RegisterNameMobileNumberPage().enterMobileNumber(mobilenumber);

    }
    @Then("^registration should failed with Mobile Number Error message\"([^\"]*)\"$")
    public void registrationShouldFailedWithMobileNumberErrorMessageInvalidName(String err) {
        Assert.assertTrue(new RegisterNameMobileNumberPage().getErrTxtMobileNumber().equalsIgnoreCase(err));

    }
    @Then("^registration should failed with Mobile Number Error message\"([^\"]*)\" and Name Error message\"([^\"]*)\"$")
    public void registrationShouldFailedWithMobileNumberErrorMessageAndNameErrorMessage(String err1,String err2) {
        Boolean mobileNumberErrorCheck = new RegisterNameMobileNumberPage().getErrTxtMobileNumber().equalsIgnoreCase(err1);
        Boolean NameErrorCheck = new RegisterNameMobileNumberPage().getErrTxtName().equalsIgnoreCase(err2);
        Assert.assertTrue("mobileNumberErrorCheck = " + mobileNumberErrorCheck + ", NameErrorCheck = " + NameErrorCheck,
                mobileNumberErrorCheck & NameErrorCheck);

    }

        @When("^i open SmartCoin App$")
        public void iOpenSmartCoinApp() {
           new BasePage().launchApp();
            new SignUpSignInPage().pressOnTitleText();
        }

        @Then("^i should get title as\"([^\"]*)\" and carousel text as \"([^\"]*)\" and the SignIn text as\"([^\"]*)\"$")
        public void iShouldGetTitleAsAndCarouselTextAsAndTheSignInTextAs(String title1,String carousel, String text) {
            Boolean titlecheck = new SignUpSignInPage().getTitle().equalsIgnoreCase(title1);
            Boolean carouselcheck = new SignUpSignInPage().getCarouselText().equalsIgnoreCase(carousel);
           Boolean signintextcheck = new SignUpSignInPage().getSignInText().equalsIgnoreCase(text);
            Assert.assertTrue("titlecheck = " + titlecheck + ", carouselcheck = " + carouselcheck ,
                    titlecheck & carouselcheck);

        }

          @When("^i clicked on sign in button$")
           public void iClickedOnSignInButton() {
              new SignUpSignInPage().pressSignInBtn();
           }

    @Then("^i should get Language Page title as\"([^\"]*)\"$")
    public void iShouldGetLanguagePageTitleAs(String title) {
        Assert.assertEquals(new LanguagePage().getTitle(), title);
    }

    @And("^i should get first instruction as\"([^\"]*)\"$")
    public void iShouldGetFirstInstructionAs(String ins1) {
        Assert.assertEquals(new LanguagePage().getInstruction1(), ins1);
    }

    @And("^i should get second instruction as\"([^\"]*)\"$")
    public void iShouldGetSecondInstructionAs(String ins2) {
        Assert.assertEquals(new LanguagePage().getInstruction2(), ins2);
    }

    @When("^i select english language$")
    public void iSelectEnglishLanguage() {
        new LanguagePage().pressEnglishLangBtn();
    }
    @When("^i clicked on sign in continue button$")
    public void iClickedOnSignInContinueButton() {
        new LanguagePage().pressContinueBtnSignin();

    }

    @Then("^i should get Permission page title as\"([^\"]*)\"$")
    public void iShouldGetPermissionPageTitleAs(String title) {
        Assert.assertEquals(new PermissionPage().getTitlepermission(), title);
    }

    @And("^i should get privacy policy key as\"([^\"]*)\"$")
    public void iShouldGetPrivacyPolicyKeyAs(String key) {
        Assert.assertEquals(new PermissionPage().getGiveUsTheOkayKeyText(),key);
    }

    @And("^i should get the privacy policy value as\"([^\"]*)\"$")
    public void iShouldGetThePrivacyPolicyValueAs(String value) {
        Assert.assertEquals(new PermissionPage().getGiveUsTheOkayValueText(),value);
    }

    @And("^i should get Financial SMS key as\"([^\"]*)\"$")
    public void iShouldGetFinancialSMSKeyAs(String key) throws Exception {

        Assert.assertEquals(new PermissionPage().getFinancialSmsKeyText(),key);
    }

    @And("^i should get Financial SMS Value as\"([^\"]*)\"$")
    public void iShouldGetFinancialSMSValueAs(String value) throws Exception {

        Assert.assertEquals(new PermissionPage().getFinancialSmsValueText(),value);
    }

    @And("^i should get Contacts Key as\"([^\"]*)\"$")
    public void iShouldGetContactsKeyAs(String key) throws Exception {

   Assert.assertEquals(new PermissionPage().getContactsKeyText(),key);
    }

    @And("^i should get Contacts Value as\"([^\"]*)\"$")
    public void iShouldGetContactsValueAs(String value) throws Exception {
     Assert.assertEquals(new PermissionPage().getContactsValueText(),value);
    }

    @And("^i should get Phone Key as\"([^\"]*)\"$")
    public void iShouldGetPhoneKeyAs(String key) throws Exception {

        Assert.assertEquals(new PermissionPage().getPhoneKeyText(),key);
    }

    @And("^i should get Phone Value as\"([^\"]*)\"$")
    public void iShouldGetPhoneValueAs(String value) throws Exception {
     Assert.assertEquals(new PermissionPage().getPhoneValueText(),value);
    }

    @And("^i should get Location Key as\"([^\"]*)\"$")
    public void iShouldGetLocationKeyAs(String key) throws Exception {
     Assert.assertEquals(new PermissionPage().getLocationKeyText(),key);
    }

    @And("^i should get Location Value as\"([^\"]*)\"$")
    public void iShouldGetLocationValueAs(String value) throws Exception {
     Assert.assertEquals(new PermissionPage().getLocationValueText(),value);
    }

    @And("^i should get Installed Apps Key as\"([^\"]*)\"$")
    public void iShouldGetInstalledAppsKeyAs(String key) throws Exception {
     Assert.assertEquals(new PermissionPage().getInstalledAppsKeyText(),key);
    }

    @And("^i should get Installed Apps Value as\"([^\"]*)\"$")
    public void iShouldGetInstalledAppsValueAs(String value) throws Exception {
    Assert.assertEquals(new PermissionPage().getInstalledAppsValueText(),value);
    }

    @And("^i should get Experian Report Key as\"([^\"]*)\"$")
    public void iShouldGetExperianReportKeyAs(String key) throws Exception {
     Assert.assertEquals(new PermissionPage().getExperianReportKeyText(),key);
    }

    @And("^i should get Experian Report Value as\"([^\"]*)\"$")
    public void iShouldGetExperianReportValueAs(String value) throws Exception {
     Assert.assertEquals(new PermissionPage().getExperianReportValueText(),value);
    }


    @When("^i clicked on Agree And Continue Button$")
    public void iClickedOnAgreeAndContinueButton() {
        new PermissionPage().pressagreeAndContinuebtn();
    }

    @Then("^i should Get Message\"([^\"]*)\"$")
    public void iShouldGetMessage(String msg) {
        Assert.assertTrue(new PermissionPage().getPermissionMessage().equalsIgnoreCase(msg));
    }

    @Then("^i should Get Sms Permission Message as\"([^\"]*)\"$")
    public void iShouldGetSmsPermissionMessageAs(String msg) {
        Assert.assertTrue(new PermissionPage().getPermissionMessage().equalsIgnoreCase(msg));
    }

    @And("^i clicked on Allow Button$")
    public void iClickedOnAllowButton() {
        new PermissionPage().pressallowButton();
    }

    @Then("^i should get Access of Contacts Message As\"([^\"]*)\"$")
    public void iShouldGetAccessOfContactsMessageAs(String msg) {
        Assert.assertTrue(new PermissionPage().getPermissionMessage().equalsIgnoreCase(msg));

    }

    @Then("^i should get Manage Phone Calls Message As\"([^\"]*)\"$")
    public void iShouldGetManagePhoneCallsMessageAs(String msg) {
        Assert.assertTrue(new PermissionPage().getPermissionMessage().equalsIgnoreCase(msg));
    }

    @Then("^i should get Access of Location Message as\"([^\"]*)\"$")
    public void iShouldGetAccessOfLocationMessageAs(String msg) {
        Assert.assertTrue(new PermissionPage().getPermissionMessage().equalsIgnoreCase(msg));
    }

    @Then("^i should get Login With Gmail and FaceBook Page Title as\"([^\"]*)\"$")
    public void iShouldGetLoginWithGmailAndFaceBookPageTitleAs(String msg) {
        Assert.assertTrue(new SignINWithGmailAndFacebookPage().getTitleSignInWithGmailFB().equalsIgnoreCase(msg));
    }

    @When("^i clicked on Log In With FaceBook$")
    public void iClickedOnLogInWithFaceBook() {
        new SignINWithGmailAndFacebookPage().pressfacebookbtn();
    }

    @Then("^i Should Get FaceBook Page With Title\"([^\"]*)\"$")
    public void iShouldGetFaceBookPageWithTitle(String title) {
        Assert.assertTrue(new FacebookPage().getTitleFacebookPage().equalsIgnoreCase(title));
    }

    @And("^i enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String username) {
        new FacebookPage().enterUserName(username);
    }

    @And("^i enter password as\"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {
        new FacebookPage().enterPassword(password);
    }

    @And("^i clicked on Log in button$")
    public void iClickedOnLogInButton() {
        new FacebookPage().pressLoginbtn();
    }

    @Then("^i Should Get Continue With FaceBook Page with Title \"([^\"]*)\"$")
    public void iShouldGetContinueWithFaceBookPageWithTitle(String title) {
        Assert.assertTrue(new ContinueLoginWithFbPage().getTitleContinueloginWithFB().equalsIgnoreCase(title));
    }

    @And("^i clicked on continue with fb button$")
    public void iClickedOnContinueWithFbButton() {
        new ContinueLoginWithFbPage().presscontinuebtn();
    }

    @Then("^i should get Create Password Page with title\"([^\"]*)\"$")
    public void iShouldGetCreatePasswordPageWithTitle(String title) {
        Assert.assertTrue(new CreatePasswordPage().getTitleCreatePassword().equalsIgnoreCase(title));
    }

    @And("^i enter one two three four as password$")
    public void iEnterOneTwoThreeFourAsPassword() {
        new CreatePasswordPage().pressOne();
        new CreatePasswordPage().pressTwo();
        new CreatePasswordPage().pressThree();
        new CreatePasswordPage().pressFour4();
    }

    @Then("^i should get confirm password pas with title\"([^\"]*)\"$")
    public void iShouldGetConfirmPasswordPasWithTitle(String title) {
        Assert.assertTrue(new ConfirmYourPasswordPage().getTitleConfirmPassword().equalsIgnoreCase(title));
    }

    @And("^i enter one two three four as confirm password$")
    public void iEnterOneTwoThreeFourAsConfirmPassword() {
        new ConfirmYourPasswordPage().pressOne();
        new ConfirmYourPasswordPage().pressTwo();
        new ConfirmYourPasswordPage().pressThree();
        new ConfirmYourPasswordPage().pressFour4();
    }

    @Then("^i should get Home Page Of SmartCoin with Title\"([^\"]*)\"$")
    public void iShouldGetHomePageOfSmartCoinWithTitle(String title) {
   Assert.assertTrue(new HomePageSmartCoin().getTitleHomePage().equalsIgnoreCase(title));
    }

    @And("^i clicked on deny button$")
    public void iClickedOnDenyButton() {
        new PermissionPage().pressdenyButton();
    }

    @Then("^i should get warning message as\"([^\"]*)\"$")
    public void iShouldGetWarningMessageAs(String msg) {
        Assert.assertTrue(new PermissionPage().getGWarningText().equalsIgnoreCase(msg));
    }

    @And("^i closed the App$")
    public void iClosedTheApp() {
        new BasePage().closeApp();
    }

    @When("^i clicked on sign in with gmail$")
    public void iClickedOnSignInWithGmail() {
     new SignINWithGmailAndFacebookPage().pressGmailBtn();
    }

    @Then("^i should get gmail page with title\"([^\"]*)\"$")
    public void iShouldGetGmailPageWithTitle(String title) {
   Assert.assertTrue(new GmailPage().getTitleChooseGmailAccount().equalsIgnoreCase(title));
    }

    @And("^i clicked on gmail id$")
    public void iClickedOnGmailId() {
        new GmailPage().pressGmailId();
    }

    @Then("^registration should passed and jump to the permission Page with title\"([^\"]*)\"$")
    public void registrationShouldPassedAndJumpToThePermissionPageWithTitle(String title) {

        Assert.assertTrue(new PermissionPage().getTitlepermission().equalsIgnoreCase(title));

    }

    @Then("^i should get Sign up With Gmail Page Title as\"([^\"]*)\"$")
    public void iShouldGetSignUpWithGmailPageTitleAs(String title) {

        Assert.assertTrue(new SignUpWithGmailPage().getTitleSignUpWithGmail().equalsIgnoreCase(title));
    }


    @When("^i clicked on sign up with gmail$")
    public void iClickedOnSignUpWithGmail() {
        new SignUpWithGmailPage().pressGmailBtn();
    }

    @And("^i clicked on Don't Ask Again check box$")
    public void iClickedOnDonTAskAgainCheckBox() {
        new PermissionPage().pressCheckBoxDontAskAgain();
    }


//..............................................home page step definition.............................................//
//..............................................home page step definition.............................................//

    @When("i open the app after sign in sign up")
    public void iOpenTheAppAfterSignInSignUp() {
        new CreatePasswordPage();
    }

    @Then("i should get enter password page with title{string}")
    public void iShouldGetEnterPasswordPageWithTitle(String title) {
        Assert.assertTrue(new EnterPasswordPage().getTitleEnterPassword().equalsIgnoreCase(title));
    }

    @When("i enter one two three and four as enter password")
    public void iEnterOneTwoThreeAndFourAsEnterPassword() {
        new EnterPasswordPage().pressOne();
        new EnterPasswordPage().pressTwo();
        new EnterPasswordPage().pressThree();
        new EnterPasswordPage().pressFour4();
    }

    @Then("i should get home page with title{string}")
    public void iShouldGetHomePageWithTitle(String title) {
        Assert.assertTrue(new HomePageSmartCoin().getTitleHomePage().equalsIgnoreCase(title));
    }

    @When("i clicked on menu button")
    public void iClickedOnMenuButton() {
        new HomePageSmartCoin().pressMenuBtn();
    }

    @Then("i should get menu page with title{string}")
    public void iShouldGetMenuPageWithTitle(String title) {
        Assert.assertTrue(new MenuPage().getTitleMenuePage().equalsIgnoreCase(title));
    }

    @Given(": i clicked on home button of menu page to get back on home page")
    public void iClickedOnHomeButtonOfMenuPageToGetBackOnHomePage() {
        new MenuPage().pressHomeBtn();
    }

    @When("i clicked on chat short cut button")
    public void iClickedOnChatShortCutButton() {
        new HomePageSmartCoin().pressChatShortCutBtn();
    }

    @Then("i should get chat page with title{string}")
    public void iShouldGetChatPageWithTitle(String title) {
        Assert.assertTrue(new ChatPage().getTitlechatPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked reverse button to get back on home page")
    public void iClickedReverseButtonToGetBackOnHomePage() {
        new ChatPage().pressReverseBtn();
    }

    @When("i clicked on Earn button")
    public void iClickedOnEarnButton() {
        new HomePageSmartCoin().pressEarnBtn();
    }

    @Then("i should get smartCoin rewards Page with title{string}")
    public void iShouldGetSmartCoinRewardsPageWithTitle(String title) {
        Assert.assertTrue(new SmartCoinRewardsPage().getCoinRewardsPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my khata button")
    public void iClickedOnMyKhataButton() throws Exception {
        new HomePageSmartCoin().pressMyKhataBtn();
    }

    @Then("i should get my khata page with title{string}")
    public void iShouldGetMyKhataPageWithTitle(String title) {
        Assert.assertTrue(new MyKhataPage().getMyKhataPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my profile button")
    public void iClickedOnMyProfileButton() throws Exception {
        new HomePageSmartCoin().pressMyProfileBtn();
    }

    @Then("i should get my profile page with title{string}")
    public void iShouldGetMyProfilePageWithTitle(String title) {
        Assert.assertTrue(new MyProfilePage().getMyProfilePageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on contact us button of home page")
    public void iClickedOnContactUsButtonOfHomePage() throws Exception {
        new HomePageSmartCoin().pressContactUsBtn();
    }

    @Then("i should get help and Support Page with title{string}")
    public void iShouldGetHelpAndSupportPageWithTitle(String title) {
        Assert.assertTrue(new HelpAndSupportPage().getHelpAndSupportPageTitle().equalsIgnoreCase(title));
    }
}
