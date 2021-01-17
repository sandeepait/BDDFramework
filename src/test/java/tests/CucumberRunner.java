package tests;

import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/result.html"},
				features="src/test/features/product.feature",
				glue="stepDefs",
				tags= "@productsTest")
public class CucumberRunner {
		

}
