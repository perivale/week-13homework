package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.AccountServicePage;
import htm.index.parabank.com.parasoft.parabank.pages.HomePage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
        HomePage homepage=new HomePage();
        AccountServicePage accountServicePage=new AccountServicePage();

@Test
        public void userShouldLoginSuccessfullyWithValidCredentials() {
    homepage.enterusername("shilpa2_2010@gmail.com");
    homepage.enterpassword("sgggh1234");
    homepage.enterloginbutton();

    String expectedtext = "Accounts Overview";
    String actualtext = accountServicePage.verifytext();
    Assert.assertEquals(expectedtext, actualtext);
}
@Test
    public void verifyTheErrorMessage() {
    homepage.enterusername("abcd");
    homepage.enterpassword("12345");
    homepage.enterloginbutton();

    String expectedmessage = "The username and password could not be verified.";
    String acaulmessage = homepage.verifyerrormessage();
    Assert.assertEquals(expectedmessage, acaulmessage,"verifythe message");
}
@Test
    public void userShouldLogOutSuccessfully(){
    homepage.enterusername("shilpa2_2010@gmail.com");
    homepage.enterpassword("sgggh1234");
    homepage.enterloginbutton();
    homepage.clickOnLogoutButton();

    String expectedmessage = "Customer Login";
    String actulmessage = homepage.verifytext();
    Assert.assertEquals(expectedmessage, actulmessage);
}


}

















