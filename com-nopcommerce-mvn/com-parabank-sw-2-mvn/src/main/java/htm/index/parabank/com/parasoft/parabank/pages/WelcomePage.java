package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.io.Zip;

public class WelcomePage extends Utility {
    By registerlink = By.linkText("Register");
    By firstname = By.id("customer.firstName");
    By lastname = By.xpath("//input[@name='customer.lastName']");
    By addfiled = By.id("customer.address.street");
    By cityfiled = By.xpath("//input[@class='input' and @name='customer.address.city']");
    By statefiled = By.name("customer.address.state");
    By zipcode1 = By.id("customer.address.zipCode");
    By phonenum = By.name("customer.phoneNumber");
    By ssnnum = By.xpath("//input[@id='customer.ssn']");
    By username = By.xpath("//input[@id='customer.username']");
    By password = By.xpath("//input[@id='customer.password']");
    By conformpassword = By.xpath("//input[@id='repeatedPassword']");
    By registerbutton = By.tagName("input");
  //  By verifytext = By.xpath("//p[(text(),'Your account was created successfully. You are now logged in.']");
 //   By verifytext=By.xpath("//p[(text(),'Your account was created successfully. You are now logged in')]");
    By verifytext1=By.xpath("//div[@id='rightPanel']//child::p");

    public void clickonregisterlink() {
        clickOnElement(registerlink);
    }

    public void clickOnFirstname(String name) {
        sendTextToElement(firstname, name);
    }

    public void clickOnLastname(String name) {
        sendTextToElement(lastname, name);
    }

    public void clickOnAddFiled(String add) {
        sendTextToElement(addfiled, add);
    }

    public void clickOnCityFiled(String cityname) {
        sendTextToElement(cityfiled, cityname);

    }

    public void clickOnStateFiled(String statename) {
        sendTextToElement(statefiled, statename);
    }
    public void clickOnzipcode(String zipcode){
        sendTextToElement(zipcode1,zipcode);
    }

    public void clickOnphnum(String phnum) {
        sendTextToElement(phonenum, phnum);

    }

    public void clickOnSsnnum(String ssnnu) {
        sendTextToElement(ssnnum, ssnnu);

    }

    public void clickOnUserid(String userid) {
        sendTextToElement(username, userid);

    }

    public void clickOnPassword(String passwordfiled) {
        sendTextToElement(password, passwordfiled);

    }public void clickOnconformPassword(String conpassword){
        sendTextToElement(conformpassword,conpassword);
    }
    public void clickOnregiserbutton(){
        clickOnElement(registerbutton);
    }
    public String verifylogintext(){
        return getTextFromElement(verifytext1);

    }


}
