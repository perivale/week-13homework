package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopMenu3 extends Utility {
    By addtocart=By.id("products-orderby");

    public void sortByPositionAtoZ() {
        List<WebElement> originalPriceList = driver.findElements(By.xpath("//div[@class='item-box']/child::div/descendant::span"));
        //create the list object

        // ******* question why create string list   to 53 line
        List<String> shortPriceList = new ArrayList();
        //remove $ sign and add the shortpricelist
        //add all web element value to list object
        for (WebElement element : originalPriceList) {
            shortPriceList.add(String.valueOf(element.getText().replace("$", "")));
        }
        //remove , sign add the double type List
        List<Double> shortPriceList1 = new ArrayList();
        for (String element : shortPriceList) {
            shortPriceList1.add(Double.valueOf(element.replace(",", "")));
        }
        //sort the price in asecending order
        Collections.sort(shortPriceList1);
    }
    public String addtocart(String num){
        return getTextFromElement(addtocart);
    }
}
