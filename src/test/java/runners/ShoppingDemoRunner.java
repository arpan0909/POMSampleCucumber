package runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src//test//resources//features//" },
        //plugin = { "pretty" },
        glue = {"stepDefs"},
        monochrome = true,
        dryRun = false,
        plugin = { "pretty",
        "html:target/reports/HtmlReport.html"}
       )

public class ShoppingDemoRunner extends AbstractTestNGCucumberTests {

}
