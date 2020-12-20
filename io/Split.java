package io;

public class Split {
    public static void main(String[] args) {

        String toTest = "Проверка/Как работает /Split метод";
        String[] result = toTest.split("/");

        for(String token:result){
            System.out.println(token);
        }

    }
}
