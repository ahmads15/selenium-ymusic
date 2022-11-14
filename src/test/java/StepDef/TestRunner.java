package StepDef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/test/resources/Features/explore.feature",
            glue = {"StepDef"},
            tags = "@Test_4",
            plugin = {"pretty", "junit:target/JUnitReports/report.xml",
                        "json:target/cucumber.json",
                        "html:target/HtmlReports"}
    )

public class TestRunner {

}
