package com.orangehrmlive.demo_opensource.testsuite;


import com.orangehrmlive.demo_opensource.pages.HomePage;
import com.orangehrmlive.demo_opensource.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    //create the obj
    HomePage homePage=new HomePage();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //call the homepage method and set the data
        homePage.enterUserName("Admin");
        homePage.enterPassword("admin123");
        homePage.enterloginfiled();
        //verify the text
        String expectedresults="Welcome";
       String actualresult= homePage.getVerifyText();
       Assert.assertEquals("verify text"+expectedresults,actualresult.substring(0,7));




    }













}
