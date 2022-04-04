package gun01;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs2 {
    int val;

    @Given("the initial value is {int}")
    public void theInitialValueIs(int arg0) {
        val = arg0;
    }

    @When("user add {int} the value")
    public void userAddTheValue(int arg0) {
        val+=arg0;
    }

    @Then("the result should be {int}")
    public void theResultShouldBe(int arg0) {
        Assert.assertEquals(val, arg0);
    }

    String name;
    double version;
    String combined;

    @Given("the string is {string}")
    public void theStringIs(String text) {
        name = text;
    }

    @And("the number is {double}")
    public void theNumberIs(double version) {
        this.version = version;
    }

    @When("the version is combined")
    public void theVersionIsCombined() {
        combined = name.concat(" ").concat(version+"");
    }

    @Then("the version is {string}")
    public void theVersionIs(String text) {
        Assert.assertEquals(combined, text);
    }

    @And("the number is a {int}, {int}")
    public void theNumberIsA(int arg0, int arg1) {
        System.out.println(arg0 + ", " + arg1);
    }
}
