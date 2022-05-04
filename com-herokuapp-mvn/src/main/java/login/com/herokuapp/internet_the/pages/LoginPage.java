package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By username=By.name("username");
    By password=By.name("password");
    By loginbutton=By.xpath("//i[contains(text(),'Login')]");
    By errormessage=By.xpath("//div[@id='flash']");
    By invaildpassword=By.className("flash");

    public void enterUserName(String text){
        sendTextToElement(username,text);

    }
    public void enterpassword(String name1){
        sendTextToElement(password,name1);
    }
    public void enterloginbutton(){
        clickOnElement(loginbutton);
    }
    public String verifyerrormessage(){
        return getTextFromElement(errormessage);

    }
    public String verifyinvalidpassword(){
        return getTextFromElement(invaildpassword);
    }

}
