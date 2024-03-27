package pages;
import org.testng.Assert;
import objects.Account;
import locators.LoginLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage() {
        super();
    }

    public void login(Account account) {
        inputValue(LoginLocators.INPUT_USERNAME, account.getUsername());
        inputValue(LoginLocators.INPUT_PASSWORD, account.getPassword());
        click(LoginLocators.BUTTON_LOGIN);
        System.out.println(account.toString());
    }

    void verifyLoginSuccess() {
        System.out.println("Verify Login Success");
        WebElement labelMessage = driver.findElement(By.id("flash"));
        String message = labelMessage.getText();
        System.out.println(message);
    }

    void verifyLoginUnSuccess() {
        System.out.println("Verify Login Unsuccessful");
        WebElement labelMessage = driver.findElement(By.id("flash"));
        String message = labelMessage.getText();
        System.out.println(message);
    }

    public void verifyMessage(String expectedMessage) {
        WebElement labelMessage = driver.findElement(LoginLocators.LABEL_MESSAGE);
        String actualMessage = labelMessage.getText();
        System.out.println(expectedMessage);
        System.out.println(actualMessage);
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}
