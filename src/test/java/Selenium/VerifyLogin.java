package Selenium;

import data.TestData;
import objects.Account;
import pages.BasePage;
import pages.LoginPage;
import utilities.Constant;

public class VerifyLogin {
    public static void main(String[] args) {
        BasePage basePage = new BasePage();
        basePage.setupDriver();
        LoginPage loginPage = new LoginPage();
        for (Account account : TestData.readAccount()){
            System.out.println(account.toString());
            basePage.navigate(Constant.BASE_URL);
            loginPage.login(account);
            loginPage.verifyMessage(account.getMessage());
        }
        /*LoginPage loginPage = new LoginPage(driver);
        loginPage.login(TestData.invalidUsername());
        loginPage.verifyLoginUnSuccess();
        loginPage.login(TestData.invalidPassword());
        loginPage.verifyLoginUnSuccess();
        loginPage.login(TestData.accountSuccess());
        loginPage.verifyLoginSuccess();*/
        basePage.closeBrowser();
    }


}

