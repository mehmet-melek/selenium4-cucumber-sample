package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String seleniumHomePageURL = "http://www.selenium.dev/";

    @FindBy(xpath = "//a[@class='nav-item' and text()='Documentation']")
    private WebElement docButton;

    public LoginPage goToHomePage() {
        driver.get(seleniumHomePageURL);
        return this;
    }

    public LoginPage goToDocPage() {
        click(docButton);
        return new LoginPage(driver);
    }

}
