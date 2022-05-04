package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class AccountServicePage extends Utility {
    By Accountstext=By.xpath("//h1[@class='title']");

    public String verifytext(){
        return getTextFromElement(Accountstext);

    }
}
