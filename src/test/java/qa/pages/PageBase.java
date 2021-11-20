package qa.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageBase {

    public WebDriver driver;
    public WebDriverWait driverWait;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitUntilVisible(WebElement webElement) {
        driverWait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilClickable(WebElement webElement) {
        driverWait.until(ExpectedConditions.elementToBeClickable(webElement));
    }


    public void click(WebElement webElement) {
        waitUntilClickable(webElement);
        waitUntilVisible(webElement);
        webElement.click();
    }

    public void sendKeys(WebElement webElement, String text) {
        waitUntilVisible(webElement);
        webElement.clear();
        webElement.sendKeys(text);
    }

    public String getElementText(WebElement webElement) {
        return webElement.getText();
    }

    public WebElement getElementFromElementList(List<WebElement> webElementList, int index) {
        return webElementList.get(index);
    }

    public int getElementListSize(List<WebElement> webElementList) {
        return webElementList.size();
    }

    public boolean validateElementInvisible(WebElement webElement) {
        try {
            return !webElement.isDisplayed();
        } catch (NoSuchElementException exception) {
            return true;
        }
    }

}
