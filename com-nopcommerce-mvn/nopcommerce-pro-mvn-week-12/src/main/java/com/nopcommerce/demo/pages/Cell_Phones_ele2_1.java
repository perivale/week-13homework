package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cell_Phones_ele2_1 extends Utility {
    By gridbutton=By.xpath("//a[contains(@class,'viewmode-icon list')]");
    By productname=By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");
  By verifyphtext = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
 By verifyprice= By.xpath("//div[@class='product-price']/child::span[@id='price-value-20']");
 By addtocart=By.id("add-to-cart-button-20");
 By verifytext1=By.xpath("//p[contains(text(),'The product has been added to your ')]");
 By closecrossbutton=By.xpath("//span[@class=\"close\"]");

    public void clickOngridbutton(){
        clickOnElement(gridbutton);
    }
    public void clickOnProductname(){
        clickOnElement(productname);
    }
    public String verifythetext(){
      return   getTextFromElement(verifyphtext);
    }
    public String verifyprice(){
        return getTextFromElement(verifyprice);
    }
    public void clickOnaddtocart(){
        clickOnElement(addtocart);
    }
    public String verifythetext1(){
        return getTextFromElement(verifytext1);
    }
    public String clickoncrossbutton(){
       return getTextFromElement(closecrossbutton);
    }

    }

