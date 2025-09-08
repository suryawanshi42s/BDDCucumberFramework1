package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Shital\\IdeaProjects\\BDD_Cucumber_FrameworkIntegration\\src\\test\\java\\Features\\Ex1_LoginToSwagLabfeature.feature",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/SwagLabLoginReport.html"}
)


public class Ex1_SwagLabLoginRunner1  extends AbstractTestNGCucumberTests {
}
