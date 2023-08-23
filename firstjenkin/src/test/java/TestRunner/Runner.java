package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/featurefile"},
        glue = {"TestRunner"},
        tags="@LMSOUT01Part1",
        plugin = {"pretty","html:target/cucumber.html",
                "json:target/json1.json",
                "junit:target/junit1.xml"}

        //        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        //}
)

public class Runner {
}


