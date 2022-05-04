package htm.index.parabank.com.parasoft.parabank.testsuite;

import htm.index.parabank.com.parasoft.parabank.pages.WelcomePage;
import htm.index.parabank.com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelComeTest extends TestBase {
    WelcomePage welcomepage=new WelcomePage();
@Test
    public void userSholdRegisterAccountSuccessfully(){
        welcomepage.clickonregisterlink();
        welcomepage.clickOnFirstname("shilpa");
        welcomepage.clickOnLastname("patel");
        welcomepage.clickOnAddFiled("11 eden close");
        welcomepage.clickOnCityFiled("surat");
        welcomepage.clickOnStateFiled("gujarat");
        welcomepage.clickOnzipcode("ha0 1db");
        welcomepage.clickOnphnum("07887878789");
        welcomepage.clickOnSsnnum("721-878-98");
        welcomepage.clickOnUserid("shilpa2_gmail.com");
        welcomepage.clickOnPassword("sg123456");
        welcomepage.clickOnconformPassword("sg123456");
        welcomepage.clickOnregiserbutton();


    String expectedtext="Your account was created successfully. You are now logged in.";
    String actualtext=welcomepage.verifylogintext();
   Assert.assertEquals(expectedtext,actualtext);


    }
}
