package org.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends  BasePage {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.xpath("#login_button_container h3");

    public void setUsername(String username) {
        set(usernameField, username);
    }
    public void setPassword(String password) {
        set(passwordField, password);
    }

    public ProductPage clickLoginButton() {
        click(loginButton);
        return new ProductPage();
    }

    protected ProductPage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return find(errorMessage).getText();
    }

}
