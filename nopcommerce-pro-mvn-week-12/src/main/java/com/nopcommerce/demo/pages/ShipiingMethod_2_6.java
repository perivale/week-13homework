package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShipiingMethod_2_6 extends Utility {
    By shipingmethod=By.xpath("//button[@onclick='ShippingMethod.save()']");
    By radiocart=By.id("paymentmethod_1");
    By paymentmethod=By.xpath("//button[@onclick='PaymentMethod.save()']");
    public void clickOnshipingmethod(){
        clickOnElement(shipingmethod);
    }
    public void clickonradiobutton(){
        clickOnElement(radiocart);
    }
    public void Clickonpymentbuttton(){
        clickOnElement(paymentmethod);
    }
}
