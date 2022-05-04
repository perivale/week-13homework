package com.cart_x.mobile.shopping;

import com.cart_x.mobile.pages.hotdeal.HomePage1;
import com.cart_x.mobile.pages.shoping.*;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    Homwpage2 homwpage2 = new Homwpage2();
    Bestsellerpage3 bestsellerpage3=new Bestsellerpage3();
    Target_Cart4 target_cart4=new Target_Cart4();
    LoginTestPage5 loginTestPage5=new LoginTestPage5();
    PlaceTheOderPage6 placeTheOderPage6=new PlaceTheOderPage6();


    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() {
        homwpage2.mouseHoverOnhotdeallink();
        homwpage2.mousehoveronbestsellerandclickon();
        String expectedtext = "Bestsellers";
        String actualtext = bestsellerpage3.verifythetextonfiled();
        Assert.assertEquals(expectedtext, actualtext,"verify the bestseller text");
        bestsellerpage3.clickOnAddyoCart();
        bestsellerpage3.selectonatozsoryby();
     //   bestsellerpage3.clickOnProduct();
        bestsellerpage3.clickonaddtocartbutton();
        String expectedresults="Product has been added to your cart";
        String actualresults=bestsellerpage3.verifytextaddtocart();
        Assert.assertEquals(expectedresults,actualresults);
        bestsellerpage3.clickoncroosbutton();
        bestsellerpage3.clickOnCartbutton();
        bestsellerpage3.clickOnViewcartbutton();
        String expectedtext1="Your shopping cart - 1 item";
       String actualtext1= target_cart4.verifytheTextonFiled();
       Assert.assertEquals(expectedtext1,actualtext1);
       target_cart4.clickoncheckout();
       target_cart4.getProductPriceinFiled();
       target_cart4.clickoncheckout();
       String expectedlogintext="Log in to your account";
      String actuallogintext= loginTestPage5.gotoLoginPage();
      Assert.assertEquals(expectedlogintext,actuallogintext);
      loginTestPage5.enterEmailId("shilpa@gmail.com");
      loginTestPage5.clickOnContinuebutton();
      String expectedtext2="Secure Checkout";
      String actualtext2=loginTestPage5.clickOnCheckout();
      Assert.assertEquals(expectedtext2,actualtext2);
      loginTestPage5.clickoncheckout();
      loginTestPage5.enterfirstnametofiled("shila");
      loginTestPage5.enterlastname("patel");
      loginTestPage5.enteraddonfiled("11 eden close");
      loginTestPage5.entercountrynameonfiled("india");
      loginTestPage5.enterstatenameonfiled("guj");
      loginTestPage5.clickonCheckbox();
      loginTestPage5.enterthepasswordoniled("123456");
      loginTestPage5.gotopaymentmethod();
      placeTheOderPage6.clickOnplacetheoderonplc();
      String extectedtext="Thank you for your order";
    String actualedtext=  placeTheOderPage6.verifythetextonfiled();
    Assert.assertEquals(extectedtext,actualedtext);


    }
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully(){
        homwpage2.mouseHoverOnhotdeallink();
        homwpage2.mousehoveronbestsellerandclickon();
        String expectedtext = "Bestsellers";
        String actualtext = bestsellerpage3.verifythetextonfiled();
        Assert.assertEquals(expectedtext, actualtext,"verify the bestseller text");
        bestsellerpage3.clickOnAddyoCart();
       bestsellerpage3.selectonatozsoryby();
        //   bestsellerpage3.clickOnProduct();
        bestsellerpage3.clickOnProduct2();
        String expectedresults="Product has been added to your cart";
        String actualresults=bestsellerpage3.verifytextaddtocart();
        Assert.assertEquals(expectedresults,actualresults);
        bestsellerpage3.clickoncroosbutton();
        bestsellerpage3.clickOnCartbutton();
        bestsellerpage3.clickOnViewcartbutton();
        String expectedtext1="Your shopping cart - 1 item";
        String actualtext1= target_cart4.verifytheTextonFiled();
        Assert.assertEquals(expectedtext1,actualtext1);
        target_cart4.enterinemptyyourcart();
        target_cart4.verifymessage();
        String expectedcrat="Item(s) deleted from your cart";
        String actualcart=  target_cart4.selectinyourcartproduct();
        Assert.assertEquals(expectedcrat,actualcart);
        target_cart4.clickonclosebutton();
        String verifytextcart="Your cart is empty";
        String actualtextcart=target_cart4.verifythetextonfiled();
        Assert.assertEquals(verifytextcart,actualtextcart);





    }

}
