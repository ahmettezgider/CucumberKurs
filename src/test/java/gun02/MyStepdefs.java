package gun02;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Driver;
import utils.ParentClass;

public class MyStepdefs extends ParentClass {

    LoginPO loginPO = new LoginPO();

    @And("user clicks Login link")
    public void userClicksLoginLink() {
        loginPO.loginLink.click();
    }

    @Given("user goes to {string}")
    public void userGoesTo(String url) {
        System.out.println("1. senaryo");
        driver.get(url);
    }

    @And("user clicks to My Account")
    public void userClicksToMyAccount() {
        loginPO.myAccount.click();
    }


    @When("user input username as {string} AND password as {string}")
    public void userInputUsernameAsANDPasswordAs(String username, String password) {
        loginPO.usernameInput.sendKeys(username);
        loginPO.passwordInput.sendKeys(password);
    }

    @Then("login should be successfull")
    public void loginShouldBeSuccessfull() {
        Assert.assertTrue(driver.getTitle().contains("My Account"));
    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        loginPO.loginSubmitButton.click();
    }

    @Given("user click Edit Account")
    public void userClickEditAccount() {
        System.out.println("2. senaryo");
        loginPO.eEditAccount.click();
    }

    @Then("user edit telephon number {string}")
    public void userEditTelephonNumber(String telNo) {
        loginPO.eEditTelephone.clear();
        loginPO.eEditTelephone.sendKeys(telNo);
    }

    @And("user click to continue")
    public void userClickToContinue() {
        loginPO.eContinueButton.click();
    }

    @Given("user clicks Newsletter")
    public void userClicksNewsletter() {
        System.out.println("3. senaryo");
        loginPO.eNewsletterLink.click();
    }

    @Then("user choose {string}")
    public void userChoose(String yesNo) {
        if (yesNo.equalsIgnoreCase("yes"))
            loginPO.newsletterYes.click();
        else
            loginPO.newsletterNo.click();
    }

    @And("success alert should be visible")
    public void successAlertShouldBeVisible() {
        wait.until(ExpectedConditions.visibilityOf(loginPO.successAlert));
    }

    @And("closeBrowser")
    public void closebrowser() {
        Driver.quitDriver();
    }


    //@Before
    public void beforeScenario(){
        System.out.println("---------------before");
    }

    @After
    public void afterScenario(){
        System.out.println("----------------after");
        Driver.quitDriver();
    }

}
