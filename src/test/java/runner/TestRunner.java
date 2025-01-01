package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterMethod;

import com.fasterxml.jackson.databind.JsonSerializable.Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\resources",
    glue = "steps",
    plugin = {"pretty", "html:target/cucumber-reports"},
    tags = "@InicioSesion"
)
public class TestRunner {
    
    @AfterMethod
    public static void closeDriver(){
        BasePage.CerrarNavegador();
    }
    
}