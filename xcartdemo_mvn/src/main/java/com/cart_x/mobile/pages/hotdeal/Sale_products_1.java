package com.cart_x.mobile.pages.hotdeal;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class Sale_products_1 extends Utility {
    By sortby = By.xpath("//div[@class='sort-box']");
    By selectatoz = By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Name A - Z')]");
    By verifyofproduct = By.xpath("//a[contains(text(),'Avengers: Fabrikations Plush [Related Products]')");
    By actualProductName = By.xpath("//a[contains(text(),'Avengers: Fabrikations Plush [Related Products]')]");
    By pricelowtohigh= By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Price Low - High')]");
    By rates=By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Rates')]");
    By ztoa=By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Name Z - A')]");
    By hightolow=By.xpath("//ul[@class='display-sort sort-crit grid-list']/child::li/child::a[contains(text(),'Price High - Low')]");





    public void clickOnsortbymenu() {
        clickOnElement(sortby);
    }

    public void selectonatozsoryby() {
        clickOnElement(selectatoz);
    }

    public String verifyofproductofarrage() {
        return getTextFromElement(verifyofproduct);
    }

    public String productarrangealphabetically() {
        return getTextFromElement(actualProductName);
    }

    public void ActualProductAlphabet() {
        String actualProductAlphabet = actualProductName.toString();
        //verify the arrage in alphabetics
        if (actualProductAlphabet.startsWith("A") || actualProductAlphabet.startsWith("a")) {
            verifyTextMessage("A", actualProductAlphabet);
        }
    }
    public void clickonlowtohigh(){
        clickOnElement(pricelowtohigh);
    }
public  void clickonReateproductes(){
        clickOnElement(rates);
}
public void clickbyprductztoa(){
        clickOnElement(ztoa);
}
public void arrangeproductonhightolow(){
        clickOnElement(hightolow);
}
}
