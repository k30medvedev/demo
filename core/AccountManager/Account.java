package core.juja.AccountManager;

public abstract class Account {

    protected int amount; // хранит сумму на счете пользователя.

    public Account(int amount) {
        this.amount = amount;
    }

    public abstract void change() throws TryAgainException, BlockAccountException;

    public int getAmount() {
        return amount;
    }


}

