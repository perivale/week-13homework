package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer4 extends Utility {
    By clickonele= By.xpath("//div[@data-productid=\"1\"]/descendant::div[@class=\"details\"]/descendant::button[@class=\"button-2 product-box-add-to-cart-button\"]");
    By verifytext=By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectitem=By.id("product_attribute_1");
    By selectGb=By.id("product_attribute_2");
    By selecthdd=By.id("product_attribute_3_7");
    By osradio=By.id("product_attribute_4_9");
    By checkbox=By.id("product_attribute_5_11");

    By prize=By.xpath("//span[@id=\"price-value-1\"]");

    By addtocart=By.id("add-to-cart-button-1");
    By verifytext2=By.xpath("//p[contains(text(),'The product has been added to your shopping cart')]");
    By verifycrossbutton=By.xpath("//span[@class=\"close\"]");
    By shopingcart=By.xpath("//li[@id=\"topcartlink\"]");
    By gotocartbutton=By.xpath("//button[contains(text(),'Go to cart')]");


    public void clickonelement1(){
        clickOnElement(clickonele);
    }
    public String  VerifytheText(){
        return  getTextFromElement(verifytext);
    }
    public   void SelectOnitemTOCompufiled(String item){
        getTextFromElement(selectitem);
    }
    public void selectOnselectgb(String item){
        getTextFromElement(selectGb);
    }
    public void slelectOnHdd(String hdd){
        getTextFromElement(selecthdd);
    }
    public void selectOnOsradiofiled(String oscheckbox){
        getTextFromElement(osradio);
    }
    public void selectOnCheckBOx(String checkbox1){
        getTextFromElement(checkbox);
    }
    public String verifyprice()
    {
        return getTextFromElement(prize);
    }
    public void ClickOncart(){
        clickOnElement(addtocart);
    }
    public String verifyTextOnFiled(){
        return getTextFromElement(verifytext2);

    }
    public String verifyButtonOncroos(){
        return  getTextFromElement(verifycrossbutton);
    }
    public void clickOnShopingCart(){
        clickOnElement(shopingcart);

    }
    public void clickonGotoCart(){
        clickOnElement(gotocartbutton);
    }


}
