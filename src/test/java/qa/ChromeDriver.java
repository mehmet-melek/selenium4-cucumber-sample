package qa;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriver {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            options.setBinary("/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");
            driver = new org.openqa.selenium.chrome.ChromeDriver(options);
            Dimension dimension = new Dimension(1920, 1080);
            driver.manage().window().setSize(dimension);
        }
        return driver;
    }

}
