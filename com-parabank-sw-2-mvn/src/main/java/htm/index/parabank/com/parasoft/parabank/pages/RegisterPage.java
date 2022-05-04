package htm.index.parabank.com.parasoft.parabank.pages;

import htm.index.parabank.com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
        By verifytext=By.xpath("//h1[@class='title']");

        public String verifyOntext(){
            return  getTextFromElement(verifytext);

        }
}
