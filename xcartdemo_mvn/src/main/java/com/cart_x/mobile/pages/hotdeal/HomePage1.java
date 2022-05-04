package com.cart_x.mobile.pages.hotdeal;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage1 extends Utility {
    By hotdeal=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::span");
    By  salelink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::ul/descendant::a[@href='sale_products/']");
    By verifytextsale=By.xpath("//h1[contains(text(),'Sale')]");

            public void mouseHoverOnHotDeal(){
        mouseHoverToElement(hotdeal);
            }
            public void mousehoverandClickonSalelink(){
                clickOnElement(salelink);
            }
            public String veriftTextOnTextsale(){
                return getTextFromElement(verifytextsale);
            }

}
