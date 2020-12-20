package inharitahe.juja.lab.Ships;

public class Queue {
    private char q[];
    private int putloc, getloc; //индексы для вставки и извлечения элементов очереди
    private int count;

    Queue (int size){
        q = new char[size]; // выделить память для очереди
        putloc = getloc = 0;
        count=0;
    }


    //поместить символ в очередь
    void put(char ch){
        if (count==q.length) {
            System.out.println(" - очередь заполнена.");
            return;
        }

        q[putloc] = ch;
        putloc++;
        if (putloc == q.length) putloc=0;
        count++;
    }

    char get () {
        if (count==0) {
            System.out.println(" - очередь пуста.");
            return (char) 0;
        }

        char returnedChar=q[getloc];
        getloc++;
        if (getloc == q.length) getloc=0;
        count--;

        return returnedChar;

    }
}