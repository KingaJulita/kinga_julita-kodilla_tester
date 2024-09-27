package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://allegro.pl");

        try {
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
        }

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement categoryDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select[data-role='filters-category']")));
        categoryDropdown.click();
        WebElement electronicsOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("option[value='elektronika']")));
        electronicsOption.click();
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-role='search-input']")));
        searchBox.sendKeys("Mavic mini");
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-role='search-button']")));
        searchButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section > article")));

        List<WebElement> productCards = driver.findElements(By.cssSelector("section > article"));

        for (WebElement card : productCards) {
            System.out.println(card.getText());
        }

        driver.quit();
    }
}

