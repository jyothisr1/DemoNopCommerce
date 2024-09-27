package com.automation.steps;

import com.automation.pages.RegisterPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterStep {

    RegisterPage registerPage=new RegisterPage();
    @When("user click on register")
    public void user_click_on_register() {
        registerPage.clickRegister();
    }

    @Then("verify user is on register page")
    public void verify_user_is_on_register_page() {
        registerPage.registerPageIsDisplayed();
    }

    @When("user enters the personal details")
    public void user_enters_the_personal_details() {
        registerPage.addDetails();
    }

    @When("user enters the password  and confirm password {string}")
    public void user_enters_the_password_and_confirm_password(String string) {
        registerPage.addPassword(ConfigReader.getConfigValue(string));
    }

    @When("user click on register button")
    public void user_click_on_register_button() {
        registerPage.clickRegisterButton();
    }

    @Then("verify user is registered")
    public void verifyUserIsRegistered() {
        Assert.assertTrue(registerPage.checkRegistered());
    }

    @When("user click on continue button")
    public void userClickOnContinueButton() {
        registerPage.clickContinue();
    }
}
