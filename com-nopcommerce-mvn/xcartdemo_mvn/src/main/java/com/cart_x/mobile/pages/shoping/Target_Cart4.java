package com.cart_x.mobile.pages.shoping;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Target_Cart4 extends Utility {
    By verifytext=By.xpath("//h1[contains(text(),'Your shopping cart - 1 item')]");
  By checkout=  By.xpath("//li[@class=\"button main-button\"]/child::button");
 By actualprice1= By.xpath("//ul[@class='totals']/li[4]/child::span/descendant::span[@class='surcharge-cell']/child::span");
   By checkoutbutton= By.xpath("//li[@class=\"button main-button\"]/child::button");
  By emptyyoutcart= By.xpath("//a[contains(text(),'Empty your cart')]");
  By deletecart=By.xpath("//li[contains(text(),'Item(s) deleted from your cart')]");
 By closebotton= By.cssSelector(".close");
 By verifytextoncart=By.xpath("//h1[contains(text(),'Your cart is empty')");


    public String verifytheTextonFiled(){
      return   getTextFromElement(verifytext);
    }
    public void clickoncheckout(){
        clickOnElement(checkout);
    }
  public void  getProductPriceinFiled(){
        actualtotalprize(actualprice1);
  }
  public void clickOnCheckoutbutton(){
        clickOnElement(checkoutbutton);
  }
  public void enterinemptyyourcart(){
        clickOnElement(emptyyoutcart);
  }
  public void verifymessage() {
      String actualAlertMessage = getTextFromAlert();
      verifyTextMessage("Are you sure you want to clear your cart?", actualAlertMessage);


  }
  public String  selectinyourcartproduct(){
     return    getTextFromElement(deletecart);
  }
  public void clickonclosebutton(){
        clickOnElement(closebotton);
  }
  public String verifythetextonfiled(){
        return getTextFromElement(verifytextoncart);

    }
}