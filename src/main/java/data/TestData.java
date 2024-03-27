package data;

import utilities.Constant;
import utilities.ReadCSV;
import objects.Account;

import java.util.ArrayList;

public class TestData {
    static Account accountSuccess() {
        return new Account("tomsmith", "SuperSecretPassword!");
    }

    static Account invalidUsername() {
        return new Account("invalid", "SuperSecretPassword!");
    }

    static Account invalidPassword() {
        return new Account("tomsmith", "invalidddd");
    }

    public static ArrayList<Account> readAccount() {
        ArrayList<Account> accountArrayList = new ArrayList<>();
        ArrayList<String> data = ReadCSV.readCSV(Constant.ACCOUNT_FILE);
        for (String str : data) {
            String[] array = str.split(";");
            accountArrayList.add(new Account(array[0], array[1], array[2]));
            /*String username = str.split(";")[0];
            String password = str.split(";")[1];
            String message = str.split(";")[2];
            accountArrayList.add(new Account(username, password, message));*/

        }
        return accountArrayList;
    }
}
