package core.juja.AccountManager;

public class TryAgainException extends Exception {

    public int delta;

    TryAgainException(int delta){
        if (delta>100){
            System.out.println("Дельта не может быть более 100$");
        }
    }

    public String toString(){
        return ("Возникла ошибка при вычислении метода");
    }

    //Метод сообщает о временной неудаче, что значит:
    //
    //1. Ничего не сделано.
    //
    //2. Необходимо попробовать вызвать метод еще раз (а потом еще раз, и т.д. пока операция не пройдет).
    //Если при работе со счетом возникает TryAgainException необходимо повторять ситуацию до появления положительного результата.

}


