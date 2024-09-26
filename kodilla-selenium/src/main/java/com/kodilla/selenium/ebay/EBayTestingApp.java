package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\\\selenium-drivers\\\\Chrome\\\\chromedriver_win32\\\\chromedriver.exe");    // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement inputField = driver.findElement(By.name("_nkw")); // [4]
        inputField.sendKeys("Laptop");
        inputField.submit();

    }
}
