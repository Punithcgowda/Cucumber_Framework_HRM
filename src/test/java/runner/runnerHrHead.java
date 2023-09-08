package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		       features= {"./src/test/java/featurefiles/featureAllScenaro.feature"},
		       glue= {"stepdefinition"},
		       dryRun=false,
		       //tags = {"@Smoke"}
		       plugin={"pretty","html:target/cucumber.html","json:target/cucumber.json"}		       
		       )
    public class runnerHrHead extends AbstractTestNGCucumberTests
    {
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
    }
///featureAllScenaro.feature