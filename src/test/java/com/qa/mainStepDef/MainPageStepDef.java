package com.qa.mainStepDef;

import com.qa.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MainPageStepDef {

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
}
