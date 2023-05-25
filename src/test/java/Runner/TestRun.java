package Runner;
	
import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/main/resources/feature/OrderCreation/ShipperOrderCreation.feature"},glue={"stepdefs.core"},plugin ={ "pretty", "html:target/cucumber-reports" },
monochrome = true)						
public class TestRun{
	public static void main(String args[]) {

		

	}
}