package runner;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/features.fakeretapi.servicos",
            glue = "steps",
            plugin = "pretty",
            monochrome = true,
            snippets = CucumberOptions.SnippetType.CAMELCASE
    )

    public class RunCucumberTest  {


    }

