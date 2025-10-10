package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePage extends BasePage {

    private final String title= "";

    private static final By name= By.id("name");
    private static final By email= By.id("email");
    private static final By phone= By.id("phone");
    private static final By address= By.id("textarea");

    public  HomePage(WebDriver driver){
        super.driver=driver;
    }



    public void fillTheForm(DataTable dataTable){
        List<Map<String, String>> formDetails=dataTable.asMaps(String.class, String.class);
        String nam=formDetails.get(0).get("name");
        String emai=formDetails.get(0).get("email");
        String phon=formDetails.get(0).get("phone");
        String addrss=formDetails.get(0).get("address");

        sendkeys(name,nam);
        sendkeys(email,emai);
        sendkeys(phone,phon);
        sendkeys(address,addrss);
    }

    public void fillTheUserDetails(String nam, String emai, String phon,String addrss){
        sendkeys(name,nam);
        sendkeys(email,emai);
        sendkeys(phone,phon);
        sendkeys(address,addrss);
    }
}
