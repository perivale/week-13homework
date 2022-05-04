package com.cart_x.mobile.pages.shoping;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class PlaceTheOderPage6 extends Utility {
    By palceoder=By.xpath("//button[contains(@class,'btn regular-button regular-main-button place-order submit')]");
    By verifytext=By.xpath("//h1[contains(text(),'Thank you for your order')]");


    public void clickOnplacetheoderonplc(){
        clickOnElement(palceoder);

    }
    public String verifythetextonfiled(){
        return getTextFromElement(verifytext);
    }
}
