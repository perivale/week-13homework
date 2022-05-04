package com.cart_x.mobile.pages.shoping;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class Homwpage2 extends Utility {
     By hotdeal=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::span") ;
     By bestseller=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[2]/child::ul/descendant::a[@href='bestsellers/']");




    public void mouseHoverOnhotdeallink(){
         mouseHoverToElement(hotdeal);
     }
     public void mousehoveronbestsellerandclickon(){
        clickOnElement(bestseller);
     }



}
