package org.melek.selenium.test.pages;

import org.melek.selenium.test.configuration.RunnerConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DownloadPage extends PageBase {

    public DownloadPage(WebDriver driver) {
        super(driver);
    }

    String seleniumHomePageURL = RunnerConfiguration.getProps().getProperty("sut.url");


    WebElement searchRoot = driver.findElement(By.cssSelector("cr-toolbar-search-field[id='search']"));
    private WebElement getSearchInputField() {
        WebElement searchDom = getShadowRootElement(searchRoot);
        return searchDom.findElement(By.cssSelector("input[id='searchInput']"));
    }

    public DownloadPage searchDownloads(String searchItem) {
        sendKeys(getSearchInputField(),searchItem);
        return this;
    }












}
