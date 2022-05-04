package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage1 extends Utility {
    By computerlink = By.linkText("Computers");
    By navigatename=By.linkText("Electronics");
    By electrics= By.xpath("//ul[@class='top-menu notmobile']/child::li[2]/child::a");
    By desktop=By.xpath("//ul[@class='top-menu notmobile']/child::li[2]/descendant::a[contains(text(),'Cell phones')]");
    By verifycellphonetext=By.xpath("//h1[contains(text(),'Cell phones')]");




    public void mousehoverOnComputerlink() {

        mouseHoverToElement(computerlink);
    }
    public void mousehoverOnElectrics() {
        mouseHoverToElement(electrics);
    }
        public void clickOndesktopfiled(){
            clickOnElement(desktop);

        }
        public String verifyOnCellPhoneText(){
        return getTextFromElement(verifycellphonetext);

        }
    }










