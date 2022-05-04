package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By username=By.xpath("//input[@type='text' and @name='username']");
    By password=By.xpath("//input[@type='password' and @class='input']");
    By loginbutton=By.xpath("//input[@type='submit' and @class='button']");
    By logout=By.linkText("Log Out");
    By errormessage=By.xpath("//p[@class='error']");
    By customertext=By.xpath("//h2[text()='Customer Login']");
    By registerlink=By.linkText("Register");


    public void enterusername(String name){
        sendTextToElement(username,name);
    }
    public void enterpassword(String name){
        sendTextToElement(password,name);
    }
    public void enterloginbutton(){
        clickOnElement(loginbutton);
    }
    public String verifyerrormessage(){
        return getTextFromElement(errormessage);

    }
    public void clickOnLogoutButton(){
        clickOnElement(logout);
    }
    public String verifytext(){
        return getTextFromElement(customertext);

    }
    public void clickOnRegisterlink(){
        clickOnElement(registerlink);
    }
}
