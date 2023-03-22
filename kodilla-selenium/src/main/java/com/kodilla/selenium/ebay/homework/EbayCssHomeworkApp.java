package com.kodilla.selenium.ebay.homework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.*;
import java.util.Collections;
import java.util.List;



public class EbayCssHomeworkApp {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get("https://www.ebay.pl/");
        driver.findElement(By.linkText("Elektronika")).click();

        WebElement wait1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#srp-river-results > ul > li:nth-child(1)")));
        List<WebElement> elements = driver.findElements(By.cssSelector("#srp-river-results > ul > li"));
        for(WebElement e : elements) {
            System.out.println(e.getText());
        }
    }


}
