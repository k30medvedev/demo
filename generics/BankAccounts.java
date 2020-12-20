package generics;

import java.util.ArrayList;
import java.util.List;

public class BankAccounts {



    public static double getBankAccountSumm(List<Account> bankAccounts){

        long sum = 0;

        for (Account account : bankAccounts) {
            sum += account.getAccount();
        }

        return sum; };


}
