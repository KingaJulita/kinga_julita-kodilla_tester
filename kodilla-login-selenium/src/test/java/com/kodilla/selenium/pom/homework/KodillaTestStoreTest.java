package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KodillaTestStoreTest {
    private WebDriver driver;
    private KodillaTestStorePom kodillaTestStorePom;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://kodilla.com/pl/test/store");
        kodillaTestStorePom = new KodillaTestStorePom(driver);
    }

    @Test
    public void testSearchFunctionality() {
        String[] searchTerms = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};

        for (String term : searchTerms) {
            kodillaTestStorePom.performSearch(term);
            int expectedResultsCount = getExpectedResultsCount(term);
            assertEquals(expectedResultsCount, kodillaTestStorePom.getResultsCount(),
                    "Number of results for '" + term + "' is not as expected.");
        }
    }

    private int getExpectedResultsCount(String searchTerm) {
        switch (searchTerm.toLowerCase()) {
            case "notebook":
                return 3;
            case "school":
                return 2;
            case "brand":
                return 4;
            case "business":
                return 1;
            case "gaming":
                return 5;
            case "powerful":
                return 0;
            default:
                return 0;
        }
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
