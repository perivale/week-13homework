package com.nopcommerce.demo.electronics;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage1 homePage1 = new HomePage1();
    Cell_Phones_ele2_1 cell_phones_ele2_1 = new Cell_Phones_ele2_1();
    ShoppingCart_2_2 shoppingCart_2_1=new ShoppingCart_2_2();
    LoginPage_2_3 loginPage_2_3=new LoginPage_2_3();
    RegisterPage2_4 registerPage2_4=new RegisterPage2_4();
    Shopiing_cart_2_5 shopiing_cart_2_5=new Shopiing_cart_2_5();
    ShipiingMethod_2_6 shipiingMethod_2_6=new ShipiingMethod_2_6();
    PaymentPage_2_7 paymentPage_2_7=new PaymentPage_2_7();


    @Test
    public void textverified() {
        //   1.1 Mouse Hover on “Electronics” Tab
        homePage1.mousehoverOnElectrics();
        //  1.2 Mouse Hover on “Cell phones” and click
        homePage1.clickOndesktopfiled();
        //  1.3 Verify the text “Cell phones”
        String expectedtext = "Cell phones";
        String actualtext = homePage1.verifyOnCellPhoneText();
        Assert.assertEquals(expectedtext, actualtext);

    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        //   2.1 Mouse Hover on “Electronics” Tab
        homePage1.mousehoverOnElectrics();
        //  2.2 Mouse Hover on “Cell phones” and click
        homePage1.clickOndesktopfiled();
        //  2.3 Verify the text “Cell phones”
        String expectedtext = "Cell phones";
        String actualtext = homePage1.verifyOnCellPhoneText();
        Assert.assertEquals(expectedtext, actualtext);
//2.4 Click on List View Tab
        cell_phones_ele2_1.clickOngridbutton();

//	2.5 Click on product name “Nokia Lumia 1020” link
        cell_phones_ele2_1.clickOnProductname();
//	2.6 Verify the text “Nokia Lumia 1020”
        String expectedphonetext="Nokia Lumia 1020";
        String actualphonetext=cell_phones_ele2_1.verifythetext();
        Assert.assertEquals(expectedtext,actualphonetext);
//	2.7 Verify the price “$349.00”
        String expectedprice="$349.00";
        String actualprice=cell_phones_ele2_1.verifyprice();
        Assert.assertEquals(expectedprice,actualprice);
        //	2.9 Click on “ADD TO CART” tab
        cell_phones_ele2_1.clickOnaddtocart();
//	2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expecttext1="The product has been added to your shopping cart";
        String actualtext1=cell_phones_ele2_1.verifythetext1();
        Assert.assertEquals(expecttext1,actualtext1);
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        cell_phones_ele2_1.clickoncrossbutton();
      //  2.12 Verify the message "Shopping cart"
        String expectedmessage="Shopping cart";
        String actualmessage=shoppingCart_2_1.clickOnshopingcart();
        Assert.assertEquals(expectedmessage,actualmessage);
        // 2.15 click on checkbox “I agree with the terms of service”
        shoppingCart_2_1.clickOnshopingcart();
      //  2.16 Click on checkout
        shoppingCart_2_1.clickoncheckout();
//“2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedtextwelcom="Welcome, Please Sign In!";
        String actualtextwelcome=  loginPage_2_3.verifyWelcometext();
        Assert.assertEquals(actualtextwelcome,expectedtextwelcom);
       // 2.18 Click on “REGISTER” tab
        loginPage_2_3.clickOnregister();
        registerPage2_4.verifyregistertab();
      //  Fill the mandatory fields
        registerPage2_4.clickOnShopingCart();
        registerPage2_4.clickonGotoCart();
        //  2.15 Verify the message "Shopping cart"
        String expectedshopingcarttext="Shopping cart";
        String actualshopingcarttaxt=registerPage2_4.verifyshopingcarttext();
        Assert.assertEquals(expectedshopingcarttext,actualshopingcarttaxt);
        //  2.21 Click on “REGISTER” Button
        registerPage2_4.clickontermandservice();
     //   2.22 Verify the message “Your registration completed”
        registerPage2_4.clickonfirstname("shilpa");
         registerPage2_4.clickOnLastname("patel");
        registerPage2_4.enteremailid("asd@gmail.com");
        registerPage2_4.entercountryname("india");
        registerPage2_4.clickonstateidname("guj");
        registerPage2_4.entercityname("surat");
        registerPage2_4.enterbillingadd("11 edenclose");
        registerPage2_4.enterbilladd2("ha1 5th");
        registerPage2_4.enterphonenum("06767676767");
        //  2.23 Click on “CONTINUE”
        registerPage2_4.clickoncontinuebutton();
        shopiing_cart_2_5.clickonshipingoprtion();
        shipiingMethod_2_6.clickOnshipingmethod();
        shipiingMethod_2_6.clickonradiobutton();
        shipiingMethod_2_6.Clickonpymentbuttton();
        //fill all detailes
        paymentPage_2_7.clickonpaymentmethod("creditcard");
        paymentPage_2_7.clickonmastercard("visacrad");
        paymentPage_2_7.clickoncardholder("s k patel");
        paymentPage_2_7.clickoncradnum("4676 7878 7678 7878");
        paymentPage_2_7.clickonexmonth("05");
        paymentPage_2_7.clickonyear("2023");
        paymentPage_2_7.clickoncradnum("789");

        //  2.29 Click on “CONTINUE”
        paymentPage_2_7.clickoncontinuebotton();








    }

}
