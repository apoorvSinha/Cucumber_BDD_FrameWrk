package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        features = ".//Features/product_add.feature",
        glue = "StepDefs",
        dryRun = true,
        monochrome = true,
        plugin = {"pretty",
                "html:test-output"
        }
)

public class TestRunner {
        //something
}
