package com.cart_x.mobile.pages.shoping;

import com.cart_x.mobile.utility.Utility;
import org.openqa.selenium.By;

public class LoginTestPage5 extends Utility {
    By login=By.xpath("//h3[contains(text(),'Log in to your account')]");
    By email=By.id("email");
    By continuebutton=By.xpath("//td[@class='buttons-row']/child::button");
    By checkout=By.xpath("//h1[contains(text(),' Secure Checkout')]");
    By firstname=By.id("shippingaddress-firstname");
    By lastname=By.id("shippingaddress-lastname");
    By add=By.id("shippingaddress-street");
    By country=By.id("shippingaddress-country-code");
    By state=By.id("shippingaddress-custom-state");
    By checkbox=By.id("create_profile");
    By password=By.id("password");
  By paymentmethod=  By.id("pmethod6");








    public String gotoLoginPage(){
        return getTextFromElement(login);
    }
    public void enterEmailId(String eid){
        sendTextToElement(email,eid);
    }
    public void clickOnContinuebutton(){
        clickOnElement(continuebutton);
    }
    public String clickOnCheckout(){
       return getTextFromElement(continuebutton);
    }
    public void clickoncheckout(){
        clickOnElement(checkout);
    }
    public void enterfirstnametofiled(String name){
        sendTextToElement(firstname,name);
    }
    public void enterlastname(String name2){
        sendTextToElement(lastname,name2);
    }
    public void enteraddonfiled(String add1){
        sendTextToElement(add,add1);
    }
    public void entercountrynameonfiled(String countryname){
        sendTextToElement(country,countryname);
    }
    public void enterstatenameonfiled(String steat1){
        sendTextToElement(state,steat1);
    }
    public void clickonCheckbox(){
        clickOnElement(checkbox);
    }
    public void enterthepasswordoniled(String pass){
        sendTextToElement(password,pass);
    }
    public void gotopaymentmethod(){
        clickOnElement(paymentmethod);
    }


    }

