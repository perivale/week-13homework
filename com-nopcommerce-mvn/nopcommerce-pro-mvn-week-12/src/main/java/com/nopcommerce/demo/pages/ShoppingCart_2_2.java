package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCart_2_2 extends Utility {
    By shopingcart=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By termservice =By.id("termsofservice");
   By checkout= By.xpath("//div[@class=\"checkout-buttons\"]/child::button");
    public String clickOnshopingcart() {
        clickOnElement(shopingcart);
        return null;
    }
    public String clickontermAndSrvice(){
     return    getTextFromElement(termservice);
    }
    public void clickoncheckout(){
        clickOnElement(checkout);
    }



}
