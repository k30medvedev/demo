package deiteiPJCourse.lab4;

public class avarageInt {

    public static void main(String[] args) {

        int a = 0;
        int average;
        int n = 1;
        int counter = 10;


        for (int i = 0; i<counter;i++){
            a = a+ n++;

        }

        average = a/counter;
        System.out.println("Сумма " + a + " Среднее значение " + average);
    }
}
