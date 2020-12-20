package generics;

import java.util.Objects;

public class Account {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account1 = (Account) o;
        return Double.compare(account1.account, account) == 0 &&
                Objects.equals(name, account1.name);
    }


    public Account(String name, double account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, account);
    }

    private String name;
    private double account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}
