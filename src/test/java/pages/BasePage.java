package pages;

import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;

public abstract class BasePage {
    protected static WebDriver driver;
protected String PageTitle;
protected HashMap<String,String> pageElements;



public void performNavigationChecks(){
    Assert.assertEquals(driver.getTitle(),PageTitle);
}
public WebElement getElement(By locator){
    return driver.findElement(locator);
}



public void click(By locator){
    getElement(locator).click();
}
public void sendkeys(By locator, String text){
    getElement(locator).sendKeys(text);
}

public void selectByValue(By locator, String value){
    Select select=new Select(getElement(locator));
    select.selectByValue(value);
}

protected String getElementtext(By locator){
    return getElement(locator).getText();
}
}
