package com.kodilla.selenium.homework13_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LookForPhrasesApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        LookForPhrases lookForPhrases = new LookForPhrases(driver);
        List<WebElement> elements1 =  lookForPhrases.searchFor("NoteBook");
        List<WebElement> elements2 =  lookForPhrases.searchFor("School");
        List<WebElement> elements3 =  lookForPhrases.searchFor("Brand");
        List<WebElement> elements4 =  lookForPhrases.searchFor("Business");
        List<WebElement> elements5 =  lookForPhrases.searchFor("Gaming");
        List<WebElement> elements6 =  lookForPhrases.searchFor("Powerful");

        driver.close();

    }


}
