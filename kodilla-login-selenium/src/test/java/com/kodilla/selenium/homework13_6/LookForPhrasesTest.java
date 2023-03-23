package com.kodilla.selenium.homework13_6;

import com.kodilla.selenium.pom.KodillaLoginPom;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class LookForPhrasesTest {
    LookForPhrases lookForPhrases;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        lookForPhrases = new LookForPhrases(driver);
    }

    @Test
    public void shouldSearchForNoteBooksAndFindAllOfThem() {
        List<WebElement> elements = lookForPhrases.searchFor("NoteBook");
        assertEquals(2,elements.size());
    }

    @Test
    public void shouldSearchForAllKindaStuffAndFindAllOfThem() {
        List<WebElement> elements1 = lookForPhrases.searchFor("NoteBook");
        List<WebElement> elements2 = lookForPhrases.searchFor("School");
        List<WebElement> elements3 = lookForPhrases.searchFor("Brand");
        List<WebElement> elements4 = lookForPhrases.searchFor("Business");
        List<WebElement> elements5 = lookForPhrases.searchFor("Gaming");
        List<WebElement> elements6 = lookForPhrases.searchFor("Powerful");
        assertEquals(2,elements1.size());
        assertEquals(1,elements2.size());
        assertEquals(1,elements3.size());
        assertEquals(0,elements4.size());
        assertEquals(1,elements5.size());
        assertEquals(0,elements6.size());
    }

    @Test
    public void searchingForStuffShouldBeCaseInsensitive() {
        List<WebElement> elements1 = lookForPhrases.searchFor("notebook");
        List<WebElement> elements2 = lookForPhrases.searchFor("NOTEBOOK");
        List<WebElement> elements3 = lookForPhrases.searchFor("Notebook");
        assertEquals(elements1.size(),elements2.size());
        assertEquals(elements2.size(), elements3.size());
    }

    @AfterEach
    public void testDown() {
        driver.close();
    }
}