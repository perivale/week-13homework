package com.cart_x.mobile.pages.shoping;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class Bestsellerpage3 extends Utility {
    By verifytext=By.xpath("//h1[contains(text(),'Bestsellers')]");
  //  By selectatoz = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Name A - Z')]");
   By sortby= By.xpath("//div[@class='sort-box']");
    By selectatoz = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Name A - Z')]");
    By product=By.tagName("h5");
    By addtocart=By.xpath("//ul[@class='products-grid grid-list']/li[1]/descendant::button[@class='btn  regular-button add-to-cart product-add2cart productid-42']");
    By AddToCartText =By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By crossbotton=By.cssSelector(".close");
    By cartbutton=By.xpath("//div[@title='Your cart']");
    By viewartbutton=By.xpath("//div[@class='buttons-row']");
    By product2=By.xpath("//div[@class='product productid-16 ']");





    public String verifythetextonfiled(){
        return getTextFromElement(verifytext);
    }

    public void clickOnAddyoCart(){
        clickOnElement(sortby);
    }
    public void selectonatozsoryby() {
        clickOnElement(selectatoz);
    }
    public void clickOnProduct2(){
        clickOnElement(product2);
    }

    public void clickonaddtocartbutton(){
        clickOnElement(addtocart);
    }
    public String verifytextaddtocart(){
        return getTextFromElement(AddToCartText);

    }
    public void clickoncroosbutton(){
        clickOnElement(crossbotton);
    }
    public void clickOnCartbutton(){
        clickOnElement(cartbutton);
    }
    public void clickOnViewcartbutton(){
        clickOnElement(viewartbutton);
    }

}
