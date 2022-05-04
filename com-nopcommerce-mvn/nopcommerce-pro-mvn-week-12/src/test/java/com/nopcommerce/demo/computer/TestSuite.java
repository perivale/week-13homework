package com.nopcommerce.demo.computer;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import javafx.scene.control.Tab;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {
    HomePage1 homePage = new HomePage1();
    Desktop2 desktop2 = new Desktop2();
    DesktopMenu3 desktopMenu3 = new DesktopMenu3();
    BuildYourOwnComputer4 buildYourOwnComputer4 = new BuildYourOwnComputer4();
    Cart5 cart5=new Cart5();
    Loginpage6 loginpage6=new Loginpage6();
    Checkout7 checkout7=new Checkout7();
    Shipping_method8 shipping_method8=new Shipping_method8();
    Onepagecheckout9 onepagecheckout9=new Onepagecheckout9();
    Payment_info10 payment_info10=new Payment_info10();
    @Test
    public void Testname() {
        //  2.1 Click on Computer Menu.
        homePage.mousehoverOnComputerlink();
        //  2.2 Click on Desktop
        desktop2.clickOndesktop();
        //   2.3 Select Sort By position "Name: Z to A"
        desktopMenu3.sortByPositionAtoZ();
        //   2.4 Click on "Add To Cart"
        buildYourOwnComputer4.clickonelement1();
        //  2.5 Verify the Text "Build your own computer"

        String expectedtext = "Build your own computer";
        String actualtext = buildYourOwnComputer4.VerifytheText();
        Assert.assertEquals(expectedtext, actualtext);
        //   2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputer4.SelectOnitemTOCompufiled("\"2.2 GHz Intel Pentium Dual-Core E2200\" ");

        //  2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputer4.selectOnselectgb("8GB [+$60.00]");
        //   2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputer4.slelectOnHdd("400 GB [+$100.00]");
        //   2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputer4.selectOnOsradiofiled("Vista Premium [+$60.00]");
        //  A 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputer4.selectOnCheckBOx("Microsoft Office [+$50.00]\" and \"Total Commander [+$5.00]");
        // 2.11 Verify the price "$1,475.00"
        String expectedprice = "$1,315.00";
        String actualprice = buildYourOwnComputer4.verifyprice();
        Assert.assertEquals(expectedprice, actualprice,"This price is not found");
        //  2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputer4.ClickOncart();
        //  2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedtextverify = "The product has been added to your shopping cart";
        String actualtextverify = buildYourOwnComputer4.verifyTextOnFiled();
        Assert.assertEquals( expectedtextverify,actualtextverify,"verify the text" );

        //   After that close the bar clicking on the cross button.
        buildYourOwnComputer4.verifyButtonOncroos();
        //  2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputer4.clickOnShopingCart();
        buildYourOwnComputer4.clickonGotoCart();
        //  2.15 Verify the message "Shopping cart"
        String expectedshopingcarttext="Shopping cart";
        String actualshopingcarttaxt=cart5.verifyshopingcarttext();
        Assert.assertEquals(expectedshopingcarttext,actualshopingcarttaxt);
     //   2.16 Change the Qty to "2" and Click on "Update shopping cart"
        cart5.ClickOnQutity();
        //  2.17 Verify the Total"$2,950.00"
        //   2.19 Click on “CHECKOUT”
        cart5.clickonupdatecheckbox();
        // 2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedtextwelcom="Welcome, Please Sign In!";
        String actualtextwelcome=  loginpage6.verifyWelcometext();
      Assert.assertEquals(actualtextwelcome,expectedtextwelcom);
        //   2.21Click on “CHECKOUT AS GUEST”Ta
        loginpage6.clickOnCheckOuttab();
    //    2.22 Fill the all mandatory field
        checkout7.clickonfirstname("shilpa");
        checkout7.clickOnLastname("patel");
        checkout7.enteremailid("asd@gmail.com");
        checkout7.entercountryname("india");
        checkout7.clickonstateidname("guj");
        checkout7.entercityname("surat");
        checkout7.enterbillingadd("11 edenclose");
        checkout7.enterbilladd2("ha1 5th");
        checkout7.enterphonenum("06767676767");
        //  2.23 Click on “CONTINUE”
        checkout7.clickoncontinuebutton();
     //   2.24 Click on Radio Button “Next Day Air($0.00)”
        shipping_method8.clickonradiobutton();
        //  2.25 Click on “CONTINUE”
        shipping_method8.clickoncontibutton();
      //  2.26 Select Radio Button “Credit Card”
        onepagecheckout9.clickoncreditcard();
        onepagecheckout9.clickoncontinuebutton();
        //  2.27 Select “Master card” From Select credit card dropdown
        payment_info10.clickonpaymentmethod("mastercard");
        // 2.28 Fill all the details
        payment_info10.clickonmastercard("visacrad");
        payment_info10.clickoncardholder("s k patel");
        payment_info10.clickoncradnum("4676 7878 7678 7878");
        payment_info10.clickonexmonth("05");
        payment_info10.clickonyear("2023");
        payment_info10.clickoncradnum("789");
        //  2.29 Click on “CONTINUE”
        payment_info10.clickoncontinuebotton();
      //  2.30 Verify “Payment Method” is “Credit Card”



      //  2.32 Verify “Shipping Method” is “Next Day Air”
     //   2.33 Verify Total is “$2,950.00”
     //   2.34 Click on “CONFIRM”





    }
}