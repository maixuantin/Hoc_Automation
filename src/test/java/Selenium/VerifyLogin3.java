package Selenium;

import data.TestData;
import objects.Account;
import org.testng.annotations.*;
import pages.BasePage;
import pages.LoginPage;
import utilities.Constant;

public class VerifyLogin3 {
    BasePage basePage;
    LoginPage loginPage;

    @BeforeTest
    public void setup() {
        basePage = new BasePage();
        basePage.setupDriver();
        loginPage = new LoginPage();

    }

    @AfterTest
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
