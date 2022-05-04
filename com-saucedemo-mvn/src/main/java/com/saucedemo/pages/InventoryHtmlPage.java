package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class InventoryHtmlPage extends Utility {
    By producttext = By.className("title");
    By vrifysixproduct=By.className("inventory_item_name");

    public String verifyproducttext() {
        return getTextFromElement(producttext);

    }
}