package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By registerlink=By.xpath("//a[@class='ico-register']");
    By radiobutton=By.name("Gender");
    By firstname=By.id("FirstName");
    By lastname=By.name("LastName");
    By dateofbirth=By.name("DateOfBirthDay");
    By deatofmonth=By.name("DateOfBirthMonth");
    By dateofyear=By.name("DateOfBirthYear");
    By enteremailid=By.id("Email");
    By enterpassword=By.id("Password");
    By enterconformpassword=By.id("ConfirmPassword");
    By registerbutton=By.id("register-button");



    public void clickOnRegisterLink(){
        clickOnElement(registerlink);
    }
    public String verifyOnregisterLink(){
        return getTextFromElement(registerlink);
    }
    public void clickOnRadiobutton() {
        clickOnElement(radiobutton);
    }
    public void enterFirstName(String name){
        sendTextToElement(firstname,name);
    }
    public void eneterlastname(String name2){
        sendTextToElement(lastname,name2);
    }
    public void enterdataeofbirth(String date){
        sendTextToElement(dateofbirth,date);
    }
    public void enterdateofMonth(String month){
        sendTextToElement(deatofmonth,month);
    }
    public void enterDateOfYear(String year){
        sendTextToElement(dateofyear,year);
    }
    public void enterEmailId(String email) {
        sendTextToElement(enteremailid, email);
    }
    public void enterPassword(String password){
        sendTextToElement(enterpassword,password);
    }
    public void enterConfromPassword(String conformpassword){
        sendTextToElement(enterconformpassword,conformpassword);
    }
    public void clickOnRegisterbutton(){
        clickOnRadiobutton();
    }
}
