package Selenium;

import data.TestData;
import objects.Account;
import org.testng.annotations.*;
import pages.BasePage;
import pages.LoginPage;
import utilities.Constant;

public class VerifyLogin5 {
    BasePage basePage;
    LoginPage loginPage;
    @Parameters({"browserName"})
    @BeforeClass
    public void setup(@Optional("chrome") String browserName) {
        basePage = new BasePage();
        basePage.setupDriver(browserName);
        loginPage = new LoginPage();

    }

    @AfterClass
    public void tearDown() {
        basePage.closeBrowser();
    }

    @Test
    public void testLogin01() {
        for (Account account : TestData.readAccount()) {
            System.out.println(account.toString());
            basePage.navigate(Constant.BASE_URL);
            loginPage.login(account);
            loginPage.verifyMessage(account.getMessage());
        }
    }
    @Test
    public void testLogin02() {
        for (Account account : TestData.readAccount()) {
            System.out.println(account.toString());
            basePage.navigate(Constant.BASE_URL);
            loginPage.login(account);
            loginPage.verifyMessage(account.getMessage());
        }
    }
}
