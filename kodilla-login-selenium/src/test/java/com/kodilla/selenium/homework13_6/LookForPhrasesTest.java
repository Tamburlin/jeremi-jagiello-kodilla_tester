package com.kodilla.selenium.homework13_6;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LookForPhrasesTest {

    LookForPhrases lookForPhrases;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        lookForPhrases = new LookForPhrases(driver);
    }

    @Test
    public void shouldFindCorrectNumberOfElements() {
        assertEquals(2, lookForPhrases.lookForNotebooks().size());
        assertEquals(1, lookForPhrases.lookForSchools().size());
        assertEquals(1, lookForPhrases.lookForBrands().size());
        assertEquals(0, lookForPhrases.lookForBusiness().size());
        assertEquals(1, lookForPhrases.lookForGaming().size());
        assertEquals(0, lookForPhrases.lookForPowerful().size());
    }

    @Test
    public void shouldNotBeCaseSizeSensitive() {
        class lookForPhrases2 extends LookForPhrases {
            public lookForPhrases2(WebDriver driver) {
                super(driver);
                PageFactory.initElements(driver, this);
            }
            @Override
            public List<WebElement> lookForNotebooks() {
                List<WebElement> list = driver.findElements(By.xpath("//div/*[contains(text(), 'NOTEBOOK')]"));
                return list;
            }
        }
        lookForPhrases2 look = new lookForPhrases2(driver);
        assertEquals(2,look.lookForNotebooks().size());
    }
}