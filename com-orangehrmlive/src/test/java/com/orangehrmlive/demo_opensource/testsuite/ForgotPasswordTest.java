package com.orangehrmlive.demo_opensource.testsuite;

import com.orangehrmlive.demo_opensource.pages.ForgotPasswordPage;
import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {
    //create obj for homepage class
    HomePage homepage=new HomePage();
    ForgotPasswordPage forgotpassword=new ForgotPasswordPage();
    @Test
    public  void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //call the method with obj
        homepage.clickonforgotpassowrd();
        //verify the text
        String expectedtext="Forgot Your Password?";
        String actualtext=forgotpassword.verifyforgotpassowrdMeesage1();
        Assert.assertEquals(expectedtext,actualtext,"verifythetext");

}}
