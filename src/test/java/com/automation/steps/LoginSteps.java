package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {

    LoginPage loginPage=new LoginPage();

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
        ReportManager.log("loginllllllll");
    }

    @When("user enters the email {string}")
    public void user_enters_the_email(String string) {
        loginPage.enterMail(ConfigReader.getConfigValue(string));
    }

    @When("user enters the password {string}")
    public void user_enters_the_password(String string) {
        loginPage.enterPassword(ConfigReader.getConfigValue(string));
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
    }

    @When("user enter data")
    public void userEnterData(String s) {
        System.out.println(s);
    }
}
