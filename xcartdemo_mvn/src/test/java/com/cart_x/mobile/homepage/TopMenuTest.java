package com.cart_x.mobile.homepage;

import com.cart_x.mobile.pages.homepage.HomePage;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully() {
        homePage.clickOnShilpingpage();
        String expectedtext = "Shipping";
        String actualtext = homePage.verifyshipingtext();
        Assert.assertEquals(expectedtext, actualtext, "verify the text");

    }

    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully() {
        homePage.clickOnNweLink();
        String expectedtext = "New arrivals";
        String actuallink = homePage.verifytextOnNewarriveltext();
        Assert.assertEquals(expectedtext, actuallink, "verify the new link text");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        homePage.clickoncooimngsoonlink();
        String expectedtext = "Coming soon";
        String actuallink = homePage.verifytextcooingsoontext();
        Assert.assertEquals(expectedtext, actuallink, "verify the new link text");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOncontactus();
        String expectedtext="Contact us";
        String actualtext=homePage.verifytextOnContactus();
        Assert.assertEquals(expectedtext,actualtext,"verify the contact text");
    }
    }

