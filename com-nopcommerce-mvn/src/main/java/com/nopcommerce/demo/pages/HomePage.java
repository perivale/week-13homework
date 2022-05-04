package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By loginlink = By.linkText("Log in");
    By computerlink = By.linkText("Computers");
    By Electronics = By.linkText("Electronics");
    By apparel = By.linkText("Apparel");
    By Digitaldownloads = By.linkText("Digital downloads");
    By books = By.linkText("Books");
    By jewelry = By.linkText("Jewelry");
    By giftcard = By.linkText("Gift Cards");

    public void clickOnLoginLink() {
        clickOnElement(loginlink);
    }

    public void clickOnComputerlink() {

        clickOnElement(computerlink);
    }

    public String verifyTextComputerlink() {
        return getTextFromElement(computerlink);
    }

    public void clickOnElectricslink() {
        clickOnElement(Electronics);
    }

    public String verifyTextElectronicslink() {
        return getTextFromElement(Electronics);
    }

    public void clickOnApparellink() {
        clickOnElement(apparel);
    }

    public String verifyOnAppreallinkk() {
        return getTextFromElement(apparel);
    }

    public void clickOnDigitalDownload() {
        clickOnElement(Digitaldownloads);
    }

    public String verifyOnDigitalDwonload() {
        return getTextFromElement(Digitaldownloads);
    }

    public void clickOnBooks() {
        clickOnElement(books);
    }

    public String verifyOnBooks() {
        return getTextFromElement(books);
    }

    public void clickOnJewelry() {
        clickOnElement(jewelry);
    }

    public String verifyonjewelry() {
        return getTextFromElement(jewelry);
    }

    public void clickOnGiftcard() {
        clickOnElement(giftcard);
    }

    public String verifyonGiftcard() {
        return getTextFromElement(giftcard);
    }
}
