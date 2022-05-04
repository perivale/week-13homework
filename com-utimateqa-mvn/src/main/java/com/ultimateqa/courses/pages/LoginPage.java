package com.ultimateqa.courses.pages;


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By verifytext=By.tagName("h1");
    By signlink=By.xpath("//header/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]");
    By emailid=By.id("user[email]");
    By password=By.name("user[password]");
    By loginbutton=By.xpath("//input[@value='Sign in']");
  By invalidpassowrd=By.xpath("//div[@id='notice']" );



    public String verifythewelcometext(){
        return getTextFromElement(verifytext);
    }
    public void clickOnSingInLink(){
        clickOnElement(signlink);
    }
    public void enterInvildEmailId(String text){
        sendTextToElement(emailid,text);

    }
    public void enterInvaildpassword(String text1){
        sendTextToElement(password, text1);
    }
    public void enterOnLoginButton(){
        clickOnElement(loginbutton);
    }
    public String verifyTheErrorMessage1(){

        return getTextFromElement(invalidpassowrd);
    }


    }



