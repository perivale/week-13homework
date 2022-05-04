package htm.index.parabank.com.parasoft.parabank.testbase;


import htm.index.parabank.com.parasoft.parabank.propertyreader.PropertyReader;
import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setup() {
        selectBrowser(browser);
    }



    @AfterMethod
    public void teardown(){
      //  closeBrowser();

    }

}
