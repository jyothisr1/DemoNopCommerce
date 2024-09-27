package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='topic-block-title']/h2")
    WebElement homePageContent;

    @FindBy(xpath = "//a[text()='Log in']")
    WebElement loginLink;

    @FindBy(xpath = "//a[text()='Books ']")
    WebElement selectBook;

    @FindBy(xpath = "//div[@class='buttons']/button[1]")
    WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='cart-qty']")
    WebElement cartCount;

    public void openWebsite(){
        driver.get("https://demo.nopcommerce.com/");
    }
    public boolean isHomePageDisplayed(){
       return homePageContent.getText().equals("Welcome to our store");
    }

    public void clickLogin(){
        loginLink.click();
    }

    public void selectBookMenu(){
        selectBook.click();
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public boolean verifyItemCount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='content']")));
        return cartCount.getText().equals("(1)");

    }
}
