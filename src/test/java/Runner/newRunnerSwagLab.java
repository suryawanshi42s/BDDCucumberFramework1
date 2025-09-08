package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
      //features = "C:\\Users\\Shital\\IdeaProjects\\BDD_Cucumber_FrameworkIntegration\\src\\test\\java\\Features\\Ex1_LoginToSwagLabfeature.feature",
     // features = "C:\\Users\\Shital\\IdeaProjects\\BDD_Cucumber_FrameworkIntegration\\src\\test\\java\\Features\\Ex2_DetailProductfeature.feature",

      features = "C:\\Users\\Shital\\IdeaProjects\\BDD_Cucumber_FrameworkIntegration\\src\\test\\java\\Features\\Ex3_SwagLabplaceorderE2E.feature ",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/SwagLabLoginReport.html"}
)



public class newRunnerSwagLab extends AbstractTestNGCucumberTests {
}
