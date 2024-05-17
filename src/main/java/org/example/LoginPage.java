package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(xpath = "//*[@id=\"login_popup_work\"]")
    WebElement login;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"login_popup_send\"]")
    WebElement loginBtn;

    // Functions (Actions)
    public void ClickLogin() {
        login.click();
    }

    public void SendEmail(String email_com) {
        email.sendKeys(email_com);
    }

    public void SendPassword(String passwordKeys) {
        password.sendKeys(passwordKeys);
    }

    public void ClickLoginBtn() {
        loginBtn.click();
    }
}
