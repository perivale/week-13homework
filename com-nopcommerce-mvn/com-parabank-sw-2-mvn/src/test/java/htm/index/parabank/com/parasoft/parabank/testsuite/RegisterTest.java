package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.pages.RegisterPage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    HomePage homepage=new HomePage();
    RegisterPage regpage=new RegisterPage();
@Test
    public void verifyThatSigningUpPageDisplay(){
        homepage.clickOnRegisterlink();

        String expectedtext = "Signing up is easy!";
        String actualtext =regpage.verifyOntext();

        Assert.assertEquals(expectedtext, actualtext);

    }
}
