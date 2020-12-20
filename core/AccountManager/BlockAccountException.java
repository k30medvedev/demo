package core.juja.AccountManager;

public class BlockAccountException extends Exception {



    //Метод сообщает о полном блокировании счета, что значит:
    //1. Ничего не сделано.
    //2. Нет смысла вызывать метод еще раз.
    //При BlockAccountException необходимо сделать откат всех предыдущих изменений и завершить работу. Т.е вернуть деньги на счета, с которых уже успели снять/положить деньги.
    //
    //На выходе метод возвращает true/false.
    //true - если получилось перевести деньги на все счета.
    //
    //false - во всех остальных случаях.


}