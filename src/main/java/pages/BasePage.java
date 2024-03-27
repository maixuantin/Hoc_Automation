package pages;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import utilities.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasePage {
    static WebDriver driver;

    public BasePage() {

    }

    public WebDriver setupDriver() {
        driver = new ChromeDriver();
        return driver;
    }

    public WebDriver setupDriver(String browserName) {
        if (browserName.toLowerCase().equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.toLowerCase().equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.toLowerCase().equals("safari")) {
            driver = new SafariDriver();
        } else if (browserName.toLowerCase().equals("ie")) {
            driver = new InternetExplorerDriver();
        }
        return driver;
    }

    public void navigate(String url) {
        System.out.println("Navigate to url: " + url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.TIMEOUT));
        driver.get(url);
    }

    public void inputValue(By by, String value) {
        driver.findElement(by).sendKeys(value);
    }

    public void click(By by) {
        driver.findElement(by).click();
    }

    String getTitle() {
        return driver.getTitle();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
