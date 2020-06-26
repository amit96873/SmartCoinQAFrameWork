package com.qa.mainStepDef;

import com.qa.pages.*;
import io.cucumber.java.da.Men;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.codec.language.bm.Languages;
import org.junit.Assert;

import java.awt.*;

public class HomeMainStepDef {

    @When("i open the app after sign in sign up")
    public void iOpenTheAppAfterSignInSignUp() {
        new CreatePasswordPage().launchApp();
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

    @Given("i clicked reverse button of chat page to get back on home page")
    public void iClickedReverseButtonOfChatPageToGetBackOnHomePage() {
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

    @Given("i clicked reverse button of SmartCoin Rewards page to get back on home page")
    public void iClickedReverseButtonOfSmartCoinRewardsPageToGetBackOnHomePage() {
        new SmartCoinRewardsPage().pressReverseButton();
    }

    @Given("i clicked reverse button of My Khata page to get back on home page")
    public void iClickedReverseButtonOfMyKhataPageToGetBackOnHomePage() {
        new MyKhataPage().pressReverseBtn();
    }

    @Given("i clicked reverse button of my profile page to get back on home page")
    public void iClickedReverseButtonOfMyProfilePageToGetBackOnHomePage() {
        new MyProfilePage().pressReverseBtn();
    }

    @When("i clicked on home button of menu page")
    public void iClickedOnHomeButtonOfMenuPage() {
        new HomePageSmartCoin().pressMenuBtn();
    }

    @Then("i should get home page with {string}")
    public void iShouldGetHomePageWith(String title) {
        Assert.assertTrue(new HomePageSmartCoin().getTitleHomePage().equalsIgnoreCase(title));
    }

    @Given("i closed the Home App")
    public void iClosedTheHomeApp() {
        new HomePageSmartCoin().closeApp();
    }

    @When("i clicked on my loan button")
    public void iClickedOnMyLoanButton() {
        new MenuPage().pressMyLoanBtn();
    }

    @Then("i should get my loans page with title {string}")
    public void iShouldGetMyLoansPageWithTitle(String title) {
        Assert.assertTrue(new MyLoansPage().getMyloanPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked reverse button of my loans page to get back on home page")
    public void iClickedReverseButtonOfMyLoansPageToGetBackOnHomePage() {
        new MyLoansPage().pressReverseBtn();
    }

    @When("i clicked on all transaction button")
    public void iClickedOnAllTransactionButton() {
        new MenuPage().pressAllTransactionBtn();
    }

    @Then("i should get All transaction page with title {string}")
    public void iShouldGetAllTransactionPageWithTitle(String title) {
        Assert.assertTrue(new AllTransactionPage().getAllTransactionPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked reverse button of All Transaction page to get back on home page")
    public void iClickedReverseButtonOfAllTransactionPageToGetBackOnHomePage() {
        new AllTransactionPage().pressReverseBtn();
    }

    @When("i clicked on help and support button")
    public void iClickedOnHelpAndSupportButton() {
        new MenuPage().pressHelpAndSupportBtn();
    }

    @Given("i clicked reverse button of Help And Support page to get back on home page")
    public void iClickedReverseButtonOfHelpAndSupportPageToGetBackOnHomePage() {
        new HelpAndSupportPage().pressReverseBtn();
    }

    @When("i clicked on FAQ button")
    public void iClickedOnFAQButton() {
        new MenuPage().pressFAQBtn();
    }

    @Then("i should get FAQ page with title {string}")
    public void iShouldGetFAQPageWithTitle(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked reverse button of FAQ page to get back on home page")
    public void iClickedReverseButtonOfFAQPageToGetBackOnHomePage() {
        new FAQPage().pressReverseBtn();
    }

    @When("i clicked on language setting button")
    public void iClickedOnLanguageSettingButton() {
        new MenuPage().pressLanguageSettingBtn();
    }

    @Then("i should get language setting page with title {string}")
    public void iShouldGetLanguageSettingPageWithTitle(String title) {
        Assert.assertTrue(new LanguageSettingPage().getLanguagePageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked reverse button of language settings page to get back on home page")
    public void iClickedReverseButtonOfLanguageSettingsPageToGetBackOnHomePage() {
        new LanguageSettingPage().pressReverseBtn();
    }

    @When("i clicked on Troubleshoot button")
    public void iClickedOnTroubleshootButton() {
        new MenuPage().pressTroubleShootBtn();
    }

    @Then("i should get Troubleshoot page with title {string}")
    public void iShouldGetTroubleshootPageWithTitle(String title) {
        Assert.assertTrue(new TroubleShootPage().getTroubleshootPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked reverse button of troubleshoot page to get back on home page")
    public void iClickedReverseButtonOfTroubleshootPageToGetBackOnHomePage() {
        new TroubleShootPage().pressReverseBtn();
    }

    @When("i clicked on my referrals button")
    public void iClickedOnMyReferralsButton() {
        new MenuPage().pressMyReferralsBtn();
    }

    @Then("i should get my referrals page with title {string}")
    public void iShouldGetMyReferralsPageWithTitle(String title) {
        Assert.assertTrue(new MyReferralsPage().getMyReferralsPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked reverse button of my referrals page to get back on home page")
    public void iClickedReverseButtonOfMyReferralsPageToGetBackOnHomePage() {
        new MyReferralsPage().pressReverseBtn();
    }

    @When("i clicked on my bank details page")
    public void iClickedOnMyBankDetailsPage() {
        new MenuPage().pressMyBankDetailsBtnToGetBankAccountPendingPage();
    }

    @Then("i should get bank account pending page with title {string}")
    public void iShouldGetBankAccountPendingPageWithTitle(String title) {
        Assert.assertTrue(new BankAccountPendingPage().getBankAccountPendingPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my profile button of menu page")
    public void iClickedOnMyProfileButtonOfMenuPage() {
        new MenuPage().pressMyProfileBtn();
    }

//    -------------------------------------------FAQ STEP DEF -----------------------------------------------
//    -------------------------------------------FAQ STEP DEF -----------------------------------------------

    @Given("i clicked on English language")
    public void iClickedOnEnglishLanguage() {
        new FAQPage().pressOnEnglish();
    }

    @When("i clicked on about smartCoin section")
    public void iClickedOnAboutSmartCoinSection() {
        new FAQPage().pressOnAboutSmartCoin();
    }

    @Then("i should get About smartCoin Questions answers page in english that we can see in screenshot and title is {string}")
    public void iShouldGetAboutSmartCoinQuestionsAnswersPageInEnglishThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked on close button")
    public void iClickedOnCloseButton() {
        new FAQPage().pressOnClose();
    }

    @When("i clicked on my registration section")
    public void iClickedOnMyRegistrationSection() {
        new FAQPage().pressOnMyRegistration();
    }

    @Then("i should get my registration Questions answers page in english that we can see in screenshot and title is {string}")
    public void iShouldGetMyRegistrationQuestionsAnswersPageInEnglishThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my Profile section")
    public void iClickedOnMyProfileSection() {
        new FAQPage().pressOnMyProfile();
    }

    @Then("i should get my Profile Questions answers page in english that we can see in screenshot and title is {string}")
    public void iShouldGetMyProfileQuestionsAnswersPageInEnglishThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my Documents section")
    public void iClickedOnMyDocumentsSection() {
        new FAQPage().pressOnMyKYCDocuments();
        
    }

    @Then("i should get my Documents Questions answers page in english that we can see in screenshot and title is {string}")
    public void iShouldGetMyDocumentsQuestionsAnswersPageInEnglishThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my Loan Offers section")
    public void iClickedOnMyLoanOffersSection() {
        new FAQPage().pressOnMyLoanOffer();
    }

    @Then("i should get my Loan Offers Questions answers page in english that we can see in screenshot and title is {string}")
    public void iShouldGetMyLoanOffersQuestionsAnswersPageInEnglishThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my Payments section")
    public void iClickedOnMyPaymentsSection() {
        new FAQPage().pressOnMyPayments();
    }

    @Then("i should get my Payments Questions answers page in english that we can see in screenshot and title is {string}")
    public void iShouldGetMyPaymentsQuestionsAnswersPageInEnglishThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my Coins section")
    public void iClickedOnMyCoinsSection() {
        new FAQPage().pressOnMyCoins();
    }

    @Then("i should get my Coins Questions answers page in english that we can see in screenshot and title is {string}")
    public void iShouldGetMyCoinsQuestionsAnswersPageInEnglishThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on my Khata section")
    public void iClickedOnMyKhataSection() {
        new FAQPage().pressOnMyKhata();
    }

    @Then("i should get my Khata Questions answers page in english that we can see in screenshot and title is {string}")
    public void iShouldGetMyKhataQuestionsAnswersPageInEnglishThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked on reverse button")
    public void iClickedOnReverseButton() {
        new FAQPage().pressReverseBtn();
    }

    @Given("i clicked on Hindi language")
    public void iClickedOnHindiLanguage() {
        new FAQPage().pressOnHindi();
    }

    @Then("i should get About smartCoin Questions answers page in Hindi that we can see in screenshot and title is {string}")
    public void iShouldGetAboutSmartCoinQuestionsAnswersPageInHindiThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my registration Questions answers page in Hindi that we can see in screenshot and title is {string}")
    public void iShouldGetMyRegistrationQuestionsAnswersPageInHindiThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Profile Questions answers page in Hindi that we can see in screenshot and title is {string}")
    public void iShouldGetMyProfileQuestionsAnswersPageInHindiThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Documents Questions answers page in Hindi that we can see in screenshot and title is {string}")
    public void iShouldGetMyDocumentsQuestionsAnswersPageInHindiThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Loan Offers Questions answers page in Hindi that we can see in screenshot and title is {string}")
    public void iShouldGetMyLoanOffersQuestionsAnswersPageInHindiThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Payments Questions answers page in Hindi that we can see in screenshot and title is {string}")
    public void iShouldGetMyPaymentsQuestionsAnswersPageInHindiThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Coins Questions answers page in Hindi that we can see in screenshot and title is {string}")
    public void iShouldGetMyCoinsQuestionsAnswersPageInHindiThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Khata Questions answers page in Hindi that we can see in screenshot and title is {string}")
    public void iShouldGetMyKhataQuestionsAnswersPageInHindiThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Given("i clicked on kanda language")
    public void iClickedOnKandaLanguage() {
        new FAQPage().pressOnKanada();
    }

    @Then("i should get About smartCoin Questions answers page in kanda that we can see in screenshot and title is {string}")
    public void iShouldGetAboutSmartCoinQuestionsAnswersPageInKandaThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my registration Questions answers page in kanda that we can see in screenshot and title is {string}")
    public void iShouldGetMyRegistrationQuestionsAnswersPageInKandaThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Profile Questions answers page in kanda that we can see in screenshot and title is {string}")
    public void iShouldGetMyProfileQuestionsAnswersPageInKandaThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Documents Questions answers page in kanda that we can see in screenshot and title is {string}")
    public void iShouldGetMyDocumentsQuestionsAnswersPageInKandaThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Loan Offers Questions answers page in kanda that we can see in screenshot and title is {string}")
    public void iShouldGetMyLoanOffersQuestionsAnswersPageInKandaThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Payments Questions answers page in kanda that we can see in screenshot and title is {string}")
    public void iShouldGetMyPaymentsQuestionsAnswersPageInKandaThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Coins Questions answers page in kanda that we can see in screenshot and title is {string}")
    public void iShouldGetMyCoinsQuestionsAnswersPageInKandaThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @Then("i should get my Khata Questions answers page in kanda that we can see in screenshot and title is {string}")
    public void iShouldGetMyKhataQuestionsAnswersPageInKandaThatWeCanSeeInScreenshotAndTitleIs(String title) {
        Assert.assertTrue(new FAQPage().getFAQPageTitle().equalsIgnoreCase(title));
    }

    @And("i clicked on myprofile button")
    public void iClickedOnMyprofileButton() {
        new MenuPage().pressMyProfileBtn();
    }


    @Then("i should get menu main my profile page with title {string}")
    public void iShouldGetMenuMainMyProfilePageWithTitle(String title) {
        Assert.assertTrue(new MyProfilePage().getMyProfilePageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on menu button of my profile page")
    public void iClickedOnMenuButtonOfMyProfilePage() {
        new MyProfilePage().pressExpendMenueBtn();
    }

    @Then("i should get Expended menu button title as {string}")
    public void iShouldGetExpendedMenuButtonTitleAs(String title) {
        Assert.assertTrue(new ProfileExpendMenueButonPage().getMenueExpendPageTitle().equalsIgnoreCase(title));
    }

    @When("i clicked on edit personal details button")
    public void iClickedOnEditPersonalDetailsButton() {
        new ProfileExpendMenueButonPage().pressEditPersionalDetailsBtn();
    }

    @Then("i should get edit personal page title as {string}")
    public void iShouldGetEditPersonalPageTitleAs(String title) {
Assert.assertTrue(new EditPersionalDetailsPage().getEditPersionalDetailsTitleText().equalsIgnoreCase(title));
    }
}