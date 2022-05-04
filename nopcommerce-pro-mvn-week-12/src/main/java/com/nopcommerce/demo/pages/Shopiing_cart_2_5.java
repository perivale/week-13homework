package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class Shopiing_cart_2_5 extends Utility {
   By shipingoption= (By.id("shippingoption_2"));
   public void clickonshipingoprtion(){
       clickOnElement(shipingoption);
   }
}
