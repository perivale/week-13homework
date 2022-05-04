package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.pages.SecurePage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginpage=new LoginPage();
    SecurePage securePage=new SecurePage();
@Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        loginpage.enterUserName("tomsmith");
        loginpage.enterpassword("SuperSecretPassword!");
        loginpage.enterloginbutton();

        String expectedtext="Secure Area.";
        String actualtext=securePage.verifyOnText();
    Assert.assertEquals(actualtext.substring(15,27),expectedtext);

    }
    @Test
    public void verifyTheUsernameErrorMessage(){
    loginpage.enterUserName("tomsmith1");
    loginpage.enterpassword("SuperSecretPassword!");
    loginpage.enterloginbutton();

    String expectedtext="Your password is invalid!";
    String actualtext=loginpage.verifyerrormessage();
    Assert.assertEquals(actualtext,expectedtext);

    }
    @Test
    public void verifyThePasswordErrorMessage(){
        loginpage.enterUserName("tomsmith");
        loginpage.enterpassword("SuperSecretPassword");
        loginpage.enterloginbutton();

        String expectedtext="Your password is invalid!";
        String actualtext=loginpage.verifyinvalidpassword();
        Assert.assertEquals(actualtext,expectedtext);





    }

}
