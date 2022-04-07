package gun04;

import gun02.LoginPO;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.ParentClass;

import java.util.List;
import java.util.Map;

public class SOutlineSteps extends ParentClass {

    @Given("user write console {string}")
    public void userWriteConsole(String text) {
        System.out.println(text);
    }

    int toplam = 0;

    @When("user add the following numbers")
    public void userAddTheFollowingNumbers(DataTable table) {
        toplam = 0;
        List<Integer> list = table.asList(Integer.class);
        for (Integer num : list) {
            toplam += num;
        }
    }

    @Then("solution should be {int}")
    public void solutionShouldBe(int number) {
        Assert.assertEquals(toplam, number,"Toplam hatali");
    }


    @When("user add {int} and {int}")
    public void userAddAnd(int num1, int num2) {
        toplam = num1 + num2;
    }



    LoginPO loginPO = new LoginPO();
    @When("user fill the login form as follows")
    public void userFillTheLoginFormAsFollows(DataTable table) {
        Map<String, String> map = table.asMap();
        loginPO.usernameInput.clear();
        loginPO.usernameInput.sendKeys(map.get("username"));

        loginPO.passwordInput.clear();
        loginPO.passwordInput.sendKeys(map.get("password"));

        loginPO.loginSubmitButton.click();

    }

    @Then("login shoud be {string}")
    public void loginShoudBe(String status) {
        if (status.equalsIgnoreCase("true")){
            wait.until(ExpectedConditions.titleContains("My Account"));
            //loginPO.eLogoutSide.click();
        }else{
            wait.until(ExpectedConditions.visibilityOf(loginPO.eAlertDanger));
        }
    }
}
