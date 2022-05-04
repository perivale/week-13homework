package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class SecurePage extends Utility {
    By securepage=By.xpath("//h4[@class='subheader']");

    public String verifyOnText(){
        return getTextFromElement(securepage);

    }
}
