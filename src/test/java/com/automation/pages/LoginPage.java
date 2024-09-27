package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "Email")
    WebElement loginEmailInput;

    @FindBy(id = "Password")
    WebElement loginPasswordInput;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement loginContent;

    public boolean isLoginPageDisplayed(){
        return loginContent.getText().equals("Welcome, Please Sign In!");
    }

    public void enterMail(String email){
        loginEmailInput.sendKeys(email);
    }
    public void enterPassword(String password){
        loginPasswordInput.sendKeys(password);
    }
    public void clickLoginButton(){
        loginButton.click();
    }
}
