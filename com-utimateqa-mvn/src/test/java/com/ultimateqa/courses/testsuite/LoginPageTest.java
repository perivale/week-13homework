package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    //set obj for homepage class
    HomePage homepage=new HomePage();
    LoginPage loginpage=new LoginPage();


    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        homepage.clickOnSingInLink();

        String expectedtext="Welcome Back!";
        String actualtext=loginpage.verifythewelcometext();
        Assert.assertEquals(expectedtext,actualtext);
    }
    @Test
    public void verifyTheErrorMessage(){
        homepage.clickOnSingInLink();
        loginpage.enterInvildEmailId("shilpa2_2010@gmail.com");
        loginpage.enterInvaildpassword("shhh12345");
      //  loginpage.clickOnSingInLink();
        loginpage.enterOnLoginButton();


        String expectedtext="Invalid email or password.";
        String actualtext=loginpage.verifyTheErrorMessage1();
        Assert.assertEquals(expectedtext,actualtext);
    }
    }


