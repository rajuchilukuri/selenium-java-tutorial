package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverFactory {

//

    protected static WebDriver driver= getDriver();

    protected static WebDriver getDriver(){
       return driver = new EdgeDriver();

    }
}
