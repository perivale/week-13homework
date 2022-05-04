package com.cart_x.mobile.pages.homepage;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
By shipinglink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[3]/child::a");
By shipingpagetext=By.xpath("//h1[contains(text(),'Shipping')]");
 By newlink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[4]/child::a");
By newarrivales=By.xpath("//h1[contains(text(),'New arrivals')]");
    By comingsoonlink=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[5]/child::a");
    By verifycomingsoon=By.xpath("//h1[contains(text(),'Coming soon')]");
    By contactus=By.xpath("//ul[@class='nav navbar-nav top-main-menu']/li[6]/child::a");
    By verifycontectus=By.xpath("//h1[contains(text(),'Contact us')]");


public void clickOnShilpingpage(){
    clickOnElement(shipinglink);
}
public String verifyshipingtext(){
    return getTextFromElement(shipingpagetext);

    }
    public void clickOnNweLink(){
    clickOnElement(newlink);
    }

public String verifytextOnNewarriveltext(){
    return getTextFromElement(newarrivales);
}
public void clickoncooimngsoonlink(){
    clickOnElement(comingsoonlink);
}
public String verifytextcooingsoontext(){
    return getTextFromElement(verifycomingsoon);
}
public void clickOncontactus(){
    clickOnElement(contactus);
}
public String verifytextOnContactus(){
    return getTextFromElement(verifycontectus);
}
}