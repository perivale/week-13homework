package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Desktop2 extends Utility {
    By desktop = By.xpath("//ul[@class='top-menu notmobile']/child::li[1]/descendant::a[contains(text(),'Desktops')]");
    public void clickOndesktop() {
        clickOnElement(desktop);
    }
}
