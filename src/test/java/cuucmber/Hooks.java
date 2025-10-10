package cuucmber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import selenium.WebDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilis.PropertyReader;

import java.time.Duration;

public class Hooks extends WebDriverFactory {


    @Before
    public void setUp(){
        if (driver==null){
            getDriver();
        }
        driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
           byte[] byetarray= ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.BYTES);
        scenario.attach(byetarray, scenario.getName(), scenario.getId() );
        }

       driver.quit();
    }
}
