package com.saucedemo.testbase;


import com.saucedemo.propertyreader.PropertyReader;
import com.saucedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {
     String browser = PropertyReader.getInstance().getProperty("browser");
     @BeforeMethod
     public void setup(){
       selectBrowser(browser);
    }

    @AfterMethod
    public void teardown(){
        closeBrowser();

    }

}
