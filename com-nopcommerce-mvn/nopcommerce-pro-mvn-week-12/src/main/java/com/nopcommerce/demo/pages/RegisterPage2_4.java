package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage2_4 extends Utility {
By registertabverify=By.xpath("//h1[contains(text(),'Register')]");
    By firstname = By.id("BillingNewAddress_FirstName");
    By lastname=By.id("BillingNewAddress_LastName");
    By email=By.id("BillingNewAddress_Email");
    By country=By.id("BillingNewAddress_CountryId");
    By stateid=By.id("BillingNewAddress_StateProvinceId");
    By city= By.id("BillingNewAddress_City");
    By billadd1=By.id("BillingNewAddress_Address1");
    By billadd2=By.id("BillingNewAddress_ZipPostalCode");
    By phnum=By.id("BillingNewAddress_PhoneNumber");
    By continuebutton=By.xpath("//button[@onclick='Billing.save()']");
    By shopingcart=By.xpath("//li[@id=\"topcartlink\"]");
    By gotocartbutton=By.xpath("//button[contains(text(),'Go to cart')]");
    By verifyshopingcart=By.xpath("//h1[contains(text(),'Shopping cart')]");
    By changequt=By.xpath("//td[@class=\"quantity\"]/child::input");
    By updatecheckbox=By.id("updatecart");
    By termservice= By.id("termsofservice");



    public void clickonfirstname(String name){
        sendTextToElement(firstname,name);
    }public void clickOnLastname(String name){
        sendTextToElement(lastname,name);
    }
    public void enteremailid(String email1){
        sendTextToElement(email,email1);
    }
    public void entercountryname(String countryname){
        sendTextToElement(country,countryname);
    }
    public void clickonstateidname(String steatid1){
        sendTextToElement(stateid,steatid1);
    }
    public void entercityname(String cityname){
        sendTextToElement(city,cityname);
    }
    public void enterbillingadd(String add){
        sendTextToElement(billadd1,add);
    }
    public void enterbilladd2(String add2){
        sendTextToElement(billadd2,add2);
    }
    public void enterphonenum(String phonenum){
        sendTextToElement(phnum,phonenum);
    }
    public void clickoncontinuebutton(){
        clickOnElement(continuebutton);
    }


    public String verifyshopingcarttext(){
        return getTextFromElement(verifyshopingcart);

    }

public String verifyregistertab(){
    return getTextFromElement(registertabverify);
}
    public void clickOnShopingCart(){
        clickOnElement(shopingcart);

    }
    public void clickonGotoCart(){
        clickOnElement(gotocartbutton);
    }
    public void clickontermandservice(){
        clickOnElement(termservice);
    }

}
