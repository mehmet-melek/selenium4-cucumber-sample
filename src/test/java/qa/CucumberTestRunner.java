package qa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(publish = false,
        features = "src/test/resources/features",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CucumberTestRunner {

    @AfterClass
    public static void afterAllTest() {
        System.out.println("Execution Report: " + System.getProperty("report.url"));
    }
    
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/melek/Workspace/Utils/chromedriver/chromedriver");
    }


}
