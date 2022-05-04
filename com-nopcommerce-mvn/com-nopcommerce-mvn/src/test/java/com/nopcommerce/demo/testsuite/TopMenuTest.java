package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homepage=new HomePage();

@Test
    public void userShouldNavigateToComputerPageSuccessfully(){
    homepage.clickOnComputerlink();
    String expectedtext="Computers";
    String actualtext=homepage.verifyTextComputerlink();
    Assert.assertEquals(expectedtext,actualtext);
}
@Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
    homepage.clickOnElectricslink();
    String expectedtext="Electronics";
    String actualtext=homepage.verifyTextElectronicslink();
    Assert.assertEquals(expectedtext,actualtext);
}
@Test
    public void userShouldNavigateToApparelPageSuccessfully(){
    homepage.clickOnApparellink();
    String expectedtext="Apparel";
    String actualtext=homepage.verifyOnAppreallinkk();
    Assert.assertEquals(expectedtext,actualtext);
}
@Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
    homepage.clickOnDigitalDownload();
    String expectedtext="Digital downloads";
    String actualtext=homepage.verifyOnDigitalDwonload();
    Assert.assertEquals(expectedtext,actualtext);
}
@Test
    public void userShouldNavigateToBooksPageSuccessfully(){
    homepage.clickOnBooks();
    String expectedtext="Books";
    String actualtext=homepage.verifyOnBooks();
    Assert.assertEquals(expectedtext,actualtext);

}
@Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
    homepage.clickOnJewelry();
    String expectedtext="Jewelry";
    String actualtext=homepage.verifyonjewelry();
    Assert.assertEquals(expectedtext,actualtext);

}
@Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
    homepage.clickOnGiftcard();
    String expectedtext="Gift Cards";
    String actualtext=homepage.verifyonGiftcard();
    Assert.assertEquals(expectedtext,actualtext);



}
}


