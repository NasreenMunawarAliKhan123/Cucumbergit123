package report;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin= { 
			"json:src/test/java/report/cucumber.json"
	}
)


public class runnerfile {

}
