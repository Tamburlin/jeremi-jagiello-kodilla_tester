package com.kodilla.selenium.homework13_6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LookForPhrasesApplication {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        LookForPhrases lookForPhrases = new LookForPhrases(driver);
        int howMany1 = lookForPhrases.lookForNotebooks().size();
        int howMany2 = lookForPhrases.lookForSchools().size();
        int howMany3 = lookForPhrases.lookForBrands().size();
        int howMany4 = lookForPhrases.lookForBusiness().size();
        int howMany5 = lookForPhrases.lookForGaming().size();
        int howMany6 = lookForPhrases.lookForPowerful().size();
        System.out.println("Notebook - " + howMany1);
        System.out.println("Schools - " + howMany2);
        System.out.println("Brands - " + howMany3);
        System.out.println("Business - " + howMany4);
        System.out.println("Gaming - " + howMany5);
        System.out.println("Powerful - " + howMany6);
        driver.close();
    }


}
