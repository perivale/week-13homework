package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentPage_2_7 extends Utility {

    By paymentmethod=By.id("CreditCardType");
    By mastercard=By.id("CardholderName");
    By cardholdername=By.id("CardholderName");
    By cardnum=By.id("CardNumber");
    By month=By.id("ExpireMonth");
    By year=By.id("ExpireYear");
    By cardcode= By.id("CardCode");
    By continuebutton=By.xpath("//button[@onclick='PaymentInfo.save()']");
    By pymentcreditcard=By.xpath("//li[@class='payment-method']/child::span[@class='value']");

    public void clickonpaymentmethod(String paymethod){
        clickOnElement(paymentmethod);
    }
    public void clickonmastercard(String mastercard1){
        clickOnElement(mastercard);
    }
    public void clickoncardholder(String name){
        clickOnElement(cardholdername);
    }
    public void clickoncradnum(String num){
        clickOnElement(cardnum);
    }
    public void clickonexmonth(String month1) {
        clickOnElement(month);
    }
    public void clickonyear(String year1){
        clickOnElement(year);
    }
    public void clickoncordnum(String codrnumber){
        clickOnElement(cardcode);
    }
    public void clickoncontinuebotton(){
        clickOnElement(continuebutton);
    }
    public void clickonpaymentmethod(){

    }

}
