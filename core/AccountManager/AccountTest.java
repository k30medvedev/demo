package core.juja.AccountManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest extends Account {


    public AccountTest(int amount) {
        super(amount);
    }

    @Override
    public void change() throws TryAgainException, BlockAccountException {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
       while (flag) {
           try {
               int delta;
               System.out.println("Введите на какую сумму изменить Ваш счёт");
               delta = scanner.nextInt();
               amount = amount + delta;
               System.out.println("amount:" + amount);
               flag = false;
           } catch (InputMismatchException e) {
               System.out.println("Ошибка.Небходимо ввести целое число,не символы.");
               scanner.nextLine();
           }

       }




    }
}
