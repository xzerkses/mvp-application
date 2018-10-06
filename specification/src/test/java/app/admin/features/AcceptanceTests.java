package app.admin.features;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.Runwith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features")
public class AcceptanceTest{}