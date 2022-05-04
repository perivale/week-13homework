package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Cart5 extends Utility {
    By verifyshopingcart=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changequt=By.xpath("//td[@class=\"quantity\"]/child::input");
    By updatecheckbox=By.id("updatecart");



    public String verifyshopingcarttext(){
        return getTextFromElement(verifyshopingcart);

    }

    public void ClickOnQutity(){
        clickOnElement(changequt);

    }
    public void clickonupdatecheckbox(){
        clickOnElement(updatecheckbox);
    }


}
