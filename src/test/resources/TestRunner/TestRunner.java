package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = "src/test/resources/features/Login.feature",
        glue = "StepDefs",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty"}
)

public class TestRunner {
        //something
}
