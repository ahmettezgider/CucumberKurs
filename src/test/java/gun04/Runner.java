package gun04;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/gun04"},         // featureler
        glue = {"gun04", "gun03", "gun02"},         //step definitions
        dryRun = false,                               // sadece step ler düzenli tanimlanmis mi
        tags = "@LoginTestScenario"
)

public class Runner extends AbstractTestNGCucumberTests {

}
