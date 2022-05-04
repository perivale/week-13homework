package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.LogoutPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
        //create obj in loginpage class
        HomePage homePage=new HomePage();
        LoginPage loginpage=new LoginPage();
        LogoutPage logout=new LogoutPage();

@Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //call the obj and method and click on it
        homePage.clickOnLoginLink();

        //call obj and verify text
        String expectedresults="Welcome, Please Sign In!";
      String actualresutls= loginpage.verifyloginpagetext();
        Assert.assertEquals(expectedresults,actualresutls);


    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLoginLink();

        loginpage.enterEmailId("shilpa2_2010@yahoo.in");
        loginpage.enterPassword("sh1234");
        loginpage.clickOnLoginButton();
        String expectedtext="Log out";
        String actualtext=logout.verifyLogoutbutton();
        Assert.assertEquals(expectedtext,actualtext,"verify the text logout");


    }
    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnLoginLink();

        loginpage.enterEmailId("shilpa2_2010@yahoo.in");
        loginpage.enterPassword("sh1234");
        loginpage.clickOnLoginButton();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginpage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");

    }
    }
