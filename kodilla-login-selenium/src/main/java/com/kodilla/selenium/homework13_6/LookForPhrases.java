package com.kodilla.selenium.homework13_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LookForPhrases extends AbstractPom {

    @FindBy(xpath = "//*[@id=\"searchField\"]")
    WebElement searchField;

    public LookForPhrases(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> searchFor(String stuff) {
        searchField.sendKeys(stuff);
        List<WebElement> elements = driver.findElements(By.cssSelector("#elements-wrapper > div > div.content > div.description"));
        searchField.clear();
        return elements;
    }

}
