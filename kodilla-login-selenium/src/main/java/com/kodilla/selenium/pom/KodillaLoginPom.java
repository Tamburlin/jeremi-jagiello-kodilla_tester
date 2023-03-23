package com.kodilla.selenium.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KodillaLoginPom extends AbstractPom {

    @FindBy(css = "input[type='email']")
    WebElement emailField;

    @FindBy(css = "input[type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//button[contains(text(), 'Log in')]")
    WebElement loginButton;

    public KodillaLoginPom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public boolean login(String mail, String password) {
        emailField.sendKeys(mail);
        passwordField.sendKeys(password);
        loginButton.click();
        Alert alert = driver.switchTo().alert();
        String message = alert.getText();
        alert.dismiss();
        return (message == "Jesteś teraz zalogowany!");
    }
}
