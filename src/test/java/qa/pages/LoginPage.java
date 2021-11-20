package qa.pages;

import io.cucumber.java.bs.A;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String seleniumHomePageURL = "https://www.trendyol.com/";

    @FindBy(xpath = "//*[@class = 'link-text' and text() = 'Giriş Yap']")
    private WebElement loginIcon;

    @FindBy(xpath = "//*[@title = 'Kapat']")
    private WebElement popUpCloseButton;

    @FindBy(xpath = "//*[@class='login-button']")
    private WebElement loginButton;




    public LoginPage goToHomePage() {
        driver.get(seleniumHomePageURL);
        return this;
    }

    public void closeFirstPopup() {
        popUpCloseButton.click();
    }

    public LoginPage waitOnLoginIcon() {
        Actions actions = new Actions(driver);
        actions.moveToElement(loginIcon);
        return this;
    }

    public void loginSuccessfully() {
        loginButton.click();
    }

}
