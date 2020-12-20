package generics;

import java.util.ArrayList;
import java.util.List;

public class TestBank {
    public static void main(String[] args) {


        Account account = new Account("Kirill", 200);
        Account account2 = new Account("Kirill", 300);
        Account account3 = new Account("Kirill", 400);
        Account account4 = new Account("Kirill", 500);
        Account account5 = new Account("Kirill", 6500);
        Account account6 = new Account("Kirill", 20);



        List bankAccounts = new ArrayList();
        bankAccounts.add(account);
        bankAccounts.add(account2);
        bankAccounts.add(account3);
        bankAccounts.add(account4);
        bankAccounts.add(account5);
        bankAccounts.add(account6);



        System.out.println( BankAccounts.getBankAccountSumm(bankAccounts));

    }
}
