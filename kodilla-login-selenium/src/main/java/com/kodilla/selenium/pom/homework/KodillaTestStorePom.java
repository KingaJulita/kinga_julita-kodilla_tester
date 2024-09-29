package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaTestStorePom extends AbstractPom {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchInput;

    @FindBy(className = "product")
    private List<WebElement> searchResults;

    public KodillaTestStorePom(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void performSearch(String searchTerm) {
        searchInput.clear();
        searchInput.sendKeys(searchTerm);
        searchInput.submit();
    }

    public int getResultsCount() {
        return searchResults.size();
    }
}
