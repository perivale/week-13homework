package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.pages.RegisterResultesPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {
    RegisterPage registerPage=new RegisterPage();
    RegisterResultesPage regpage=new RegisterResultesPage();
@Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        registerPage.clickOnRegisterLink();
        String expectedtext="Register";
        String actualtext=registerPage.verifyOnregisterLink();
        Assert.assertEquals(expectedtext,actualtext);
    }
    @Test
    public void userSholdRegisterAccountSuccessfully(){
        registerPage.clickOnRegisterLink();
        registerPage.clickOnRadiobutton();
        registerPage.enterFirstName("shilpa");
        registerPage.eneterlastname("patel");
        registerPage.enterdataeofbirth("05");
        registerPage.enterdateofMonth("April");
        registerPage.enterDateOfYear("1998");
        registerPage.enterEmailId("silpa2_5@gmail.com");
        registerPage.enterPassword("sh12345");
        registerPage.enterConfromPassword("sh12345");
        registerPage.clickOnRegisterbutton();

        //verifythe text after registerpage
        String expectedtext="Your registration completed";
        String actualtext=regpage.verifythetext();
        Assert.assertEquals(expectedtext,actualtext);



    }

}
