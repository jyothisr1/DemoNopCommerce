package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerLink;

    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement registerPageContent;

    @FindBy(id = "FirstName")
    WebElement firstNameInput;

    @FindBy(id = "LastName")
    WebElement lastNameInput;

    @FindBy(id = "Email")
    WebElement emailInput;

    @FindBy(id = "Password")
    WebElement passwordInput;

    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordInput;

    @FindBy(id = "register-button")
    WebElement registerButton;

    @FindBy(xpath = "//div[@class='result']")
    WebElement result;

    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueButton;



    public void clickRegister(){
        registerLink.click();
    }
    public boolean registerPageIsDisplayed(){
       return registerPageContent.getText().equals("Register");
    }

    public void addDetails(){
        firstNameInput.sendKeys("aa");
        lastNameInput.sendKeys("A");
        emailInput.sendKeys(ConfigReader.getConfigValue("userEmail.email"));
    }
    public void addPassword(String password){
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);
    }
    public void clickRegisterButton(){
        registerButton.click();
    }

    public boolean checkRegistered(){
//        return result.getText().equals("Your registration completed");
        return false;
    }

    public void clickContinue(){
        continueButton.click();
    }
}
