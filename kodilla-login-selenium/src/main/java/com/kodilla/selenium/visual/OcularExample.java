package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("C:\\Users\\User\\Pictures\\results"))
                .snapshotPath(Paths.get("C:\\Users\\User\\Pictures\\snapshots"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(driver);
        page.open();
        page.compare();
        page.close();
    }
}
