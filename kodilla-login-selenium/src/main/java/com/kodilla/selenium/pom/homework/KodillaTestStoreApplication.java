package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KodillaTestStoreApplication {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://kodilla.com/pl/test/store");

        KodillaTestStorePom kodillaTestStorePom = new KodillaTestStorePom(driver);

        String[] searchTerms = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};

        for (String term : searchTerms) {
            kodillaTestStorePom.performSearch(term);
            System.out.println("Wyniki dla '" + term + "': " + kodillaTestStorePom.getResultsCount());
        }

        driver.quit();
    }
}
