package com.kodilla.selenium.ebay.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayHomeworkApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.ebay.pl/");
        driver.findElement(By.xpath("//a[contains(@_sp, 'p2481888.m1379.l3250')]")).click();

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh-ac")));
        WebElement inputField = driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}
