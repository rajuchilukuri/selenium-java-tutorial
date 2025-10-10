package stepDefs;

import cuucmber.Hooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.HomePage;
import selenium.WebDriverFactory;
import utilis.CommonMethods;

import java.util.List;
import java.util.Map;

public class SteDefs extends CommonMethods {

HomePage homePage=new HomePage(driver);
    @Given("user fill the form")
    public void userFillTheForm(DataTable dataTable) {
             homePage.fillTheForm(dataTable);
    }

    @Given("user fill the details")
    public void userFillTheDetails(DataTable dataTable){
        List<List<String>> details= dataTable.asLists(String.class);
        String nam=details.get(0).get(0);
         String email=details.get(0).get(1);
         String phone=details.get(0).get(2);
         String add=details.get(0).get(3);
         homePage.fillTheUserDetails(nam,email,phone,add);
    }
}
