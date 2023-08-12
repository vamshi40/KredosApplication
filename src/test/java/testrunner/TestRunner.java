package testrunner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/RegressionFlowFeatures/01_KredosLogin.feature"},
        glue = {"stepdefinitions", "apphooks"},
       // tags =  "@tag1 or @tag2 or @tag3 or @tag4 or @tag5 or @tag6 or @tag7 or @tag8 or @tag9",
      //  tags =  "@tag1",
        plugin = {"pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "html:target/cucumber-report.html", "timeline:test-output/", "json:target/cucumber-report.json",
                "summary"

        },
        monochrome = true

)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
