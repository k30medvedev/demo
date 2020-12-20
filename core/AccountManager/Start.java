package core.juja.AccountManager;

public class Start {
    public static void main(String[] args) throws TryAgainException, BlockAccountException {

        AccountTest accountTest = new AccountTest(200);
        accountTest.change();



    }
}
