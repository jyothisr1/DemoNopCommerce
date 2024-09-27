package com.automation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest{

    @Test
    public void addToCartTest() throws InterruptedException {
        homePage.openWebsite();
        homePage.isHomePageDisplayed();
        homePage.selectBookMenu();
        homePage.clickAddToCartButton();
        Assert.assertTrue(homePage.verifyItemCount());
    }
}
