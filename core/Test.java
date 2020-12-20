//package com.company;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//import java.util.concurrent.Executor;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class Test {
//    private int counter;
//
//   // public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
//
//        //   ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        Car carA = new Car("Грузовик", 30);
//        Car carB = new Car("Грузовик", 30);
//        Car carC = new Car("Грузовик", 30);
//
//        //1 Рефлексивность. Обьект должен равняться самому себе.
//        //  x.equals(x)  равно true
//        // car.equals(car); // true
//        System.out.println(carA.equals(carA));
//
//
//        //2 Симметричность. Если a.equals(b) = true то и b.equals(a) = true
//        System.out.println(carA.equals(carB));
//        System.out.println(carB.equals(carA));
//
//        //3 Транзитивность
//        // если a.equals(b) возвращает true и
//        // b.equals(c) тоже возвращает true,
//        // то c.equals(a) тоже должен возвращать true.
//
//        System.out.println(carA.equals(carB));
//        System.out.println(carB.equals(carC));
//        System.out.println(carC.equals(carA));
//
//        //4 Согласованность  повторный вызов метода equals() должен возвращать
//        // одно и тоже значение до тех пор, пока какое-либо значение свойств объекта не будет изменено.
//        // То есть, если два объекта равны в Java, то они будут равны пока их свойства остаются неизменными.
//
//        //5 Сравнение null: объект должны быть проверен на null.
//        // Если объект равен null, то метод должен вернуть false,
//        // а не NullPointerException. Например, a.equals(null) должен вернуть false.
//
//        System.out.println(carA.equals(null));
//    }
//}
////        Car clone = car.clone();
////
//////        clone.setName("I'm clone");
//////        clone.setDriver(20);
////
////        System.out.println(car);
////        System.out.println(clone);
////
////        System.out.println(car.equals(clone));
////        System.out.println(car == clone);
////
////    }
//
////    public synchronized void increment() {
////        counter++;
////    }
////
////
////    public void doWork() throws InterruptedException {
////
////        Thread th1 = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                for (int i = 0; i < 10000; i++)
////                    increment();
////            }
////        });
////
////        Thread th2 = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                for (int i = 0; i < 10000; i++)
////                    increment();
////            }
////        });
////
////        th1.start();
////        th2.start();
////
////        th1.join();
////        th2.join();
////
////        System.out.println(counter);
////
////    }
//
//
//
//
//
//
//
//
