package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginLocators {
    public static By INPUT_USERNAME = By.name("username");
    public static By INPUT_PASSWORD = By.name("password");
    public static By BUTTON_LOGIN = By.xpath("//*[@id=\"login\"]/button");
    public static By LABEL_MESSAGE = By.id("flash");

}
