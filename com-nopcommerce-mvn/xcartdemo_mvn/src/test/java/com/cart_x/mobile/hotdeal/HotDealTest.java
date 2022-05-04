package com.cart_x.mobile.hotdeal;

import com.cart_x.mobile.pages.hotdeal.HomePage1;
import com.cart_x.mobile.pages.hotdeal.Sale_products_1;
import com.cart_x.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealTest extends TestBase {
    HomePage1 homePage1 = new HomePage1();
    Sale_products_1 sale_products_1 = new Sale_products_1();

    @Test
    public void verifySaleProductsArrangeAlphabetically() {
        homePage1.mouseHoverOnHotDeal();
        homePage1.mousehoverandClickonSalelink();
        String expectedtext = "Sale";
        String actualtext = homePage1.veriftTextOnTextsale();
        Assert.assertEquals(expectedtext, actualtext, "verifytexton salelink");
        sale_products_1.clickOnsortbymenu();
        sale_products_1.selectonatozsoryby();
        sale_products_1.productarrangealphabetically();
        sale_products_1.ActualProductAlphabet();
        //   sale_products_1.verifyofproductofarrage();


    }

    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() {
        homePage1.mouseHoverOnHotDeal();
        homePage1.mousehoverandClickonSalelink();
        String expectedtext = "Sale";
        String actualtext = homePage1.veriftTextOnTextsale();
        Assert.assertEquals(expectedtext, actualtext, "verifytexton salelink");
        sale_products_1.clickOnsortbymenu();
        sale_products_1.clickonlowtohigh();

    }

    @Test
    public void verifySaleProductsArrangeByRates() {
        homePage1.mouseHoverOnHotDeal();
        homePage1.mousehoverandClickonSalelink();
        String expectedtext = "Sale";
        String actualtext = homePage1.veriftTextOnTextsale();
        Assert.assertEquals(expectedtext, actualtext, "verifytexton salelink");
        sale_products_1.clickOnsortbymenu();
        sale_products_1.clickonReateproductes();


    }

    @Test
    public void verifyBestSellersProductsArrangeByZToA() {
        homePage1.mouseHoverOnHotDeal();
        homePage1.mousehoverandClickonSalelink();
        String expectedtext = "Sale";
        String actualtext = homePage1.veriftTextOnTextsale();
        Assert.assertEquals(expectedtext, actualtext, "verifytexton salelink");
        sale_products_1.clickOnsortbymenu();
        sale_products_1.clickbyprductztoa();

    }

    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        homePage1.mouseHoverOnHotDeal();
        homePage1.mousehoverandClickonSalelink();
        String expectedtext = "Sale";
        String actualtext = homePage1.veriftTextOnTextsale();
        Assert.assertEquals(expectedtext, actualtext, "verifytexton salelink");
        sale_products_1.clickOnsortbymenu();
        sale_products_1.productarrangealphabetically();


    }

}
