package gun01;

import io.cucumber.java.en.*;
import org.testng.Assert;

public class MyStepdefs1 {

    String str = "a";

    @Then("login form should be visible")
    public void loginFormShouldBeVisible() {
        Assert.assertEquals(str, "a");
    }

    @Given("kullanici ana sayfada")
    public void kullaniciAnaSayfada() {
        System.out.println("User on homepage");
    }

    @When("user clicks to login button")
    public void userClicksToLoginButton() {
        System.out.println("user set str as \"a\"");
    }

    @Given("user on home page")
    public void userOnHomePage() {
        //Assert.fail();
    }

    @Given("user goes to login form")
    public void userGoesToLoginForm() {
    }

    @When("user input username")
    public void userInputUsername() {
    }

    @But("user input password")
    public void userInputPassword() {
    }

    @Then("page title should be My Account")
    public void pageTitleShouldBeMyAccount() {
    }

    @And("My Account page should be visible")
    public void myAccountPageShouldBeVisible() {
    }
}
