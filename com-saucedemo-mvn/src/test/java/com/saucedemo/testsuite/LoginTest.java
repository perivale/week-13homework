package com.saucedemo.testsuite;

import com.saucedemo.pages.InventoryHtmlPage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginTest extends TestBase {
    LoginPage loginPage=new LoginPage();
    InventoryHtmlPage htmlPage=new InventoryHtmlPage();
@Test
    public void userSholdLoginSuccessfullyWithValid(){
        loginPage.enterusername("standard_user");
        loginPage.enterpassword("secret_sauce");
        loginPage.enterloginbutton();

        String expectedtext="PRODUCTS";
        String actualtext=htmlPage.verifyproducttext();
    Assert.assertEquals(expectedtext,actualtext);
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterusername("standard_user");
        loginPage.enterpassword("secret_sauce");
        loginPage.enterloginbutton();
        List<WebElement>value=driver.findElements(By.className("inventory_item_name"));
        int size = value.size();
        System.out.println(size);

        int expectedvalue = 6;
        int actualvalue = size;
        //validate expected and actual value
        org.junit.Assert.assertEquals(expectedvalue, actualvalue);
    }

        }




