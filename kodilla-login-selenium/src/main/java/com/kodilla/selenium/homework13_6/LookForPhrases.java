package com.kodilla.selenium.homework13_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LookForPhrases extends AbstractPom {

    public LookForPhrases(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> lookForNotebooks() {
        List<WebElement> list = driver.findElements(By.xpath("//html/body//text()[contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'test')]"));
        return list;
    }

    public List<WebElement> lookForSchools() {
        List<WebElement> list = driver.findElements(By.xpath("//div/*[contains(text(), 'School')]"));
        return list;
    }

    public List<WebElement> lookForBrands() {
        List<WebElement> list = driver.findElements(By.xpath("//div/*[contains(text(), 'Brand')]"));
        return list;
    }

    public List<WebElement> lookForBusiness() {
        List<WebElement> list = driver.findElements(By.xpath("//div/*[contains(text(), 'Business')]"));
        return list;
    }

    public List<WebElement> lookForGaming() {
        List<WebElement> list = driver.findElements(By.xpath("//div/*[contains(text(), 'Gaming')]"));
        return list;
    }

    public List<WebElement> lookForPowerful() {
        List<WebElement> list = driver.findElements(By.xpath("//div/*[contains(text(), 'Powerful')]"));
        return list;
    }
}
