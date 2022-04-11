package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BasePage;

//{"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    //monochrome = true,
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber-reports.json"},
    tags = "@Productos"//,
    //publish = true

)
public class runner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.cleanBrowser();
    }
}