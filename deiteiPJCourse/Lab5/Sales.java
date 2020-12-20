package deiteiPJCourse.Lab5;

import java.util.Scanner;

public class Sales {
    public double getProduct1() {
        return product1;
    }

    public double getProduct2() {
        return product2;
    }

    public double getProduct3() {
        return product3;
    }

    public double getProduct4() {
        return product4;
    }

    public double getProduct5() {
        return product5;
    }
    private double product1 = 6;  // стоимость продукта
    private double product2 = 5;
    private double product3 = 50;
    private double product4 = 12;
    private double product5 = 4;
    public void getalltables() {

        System.out.println("№1 Стоимость продукта Шампунь равняется: " + getProduct1());
        System.out.println("№2 Стоимость продукта Зубная паста равняется: " + getProduct2());
        System.out.println("№3 Стоимость продукта Туалетная бумага равняется: " + getProduct3());
        System.out.println("№4 Стоимость продукта Ополаскиватель равняется: " + getProduct4());
        System.out.println("№5 Стоимость продукта Гель для душа равняется: " + getProduct5());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sales sales = new Sales();
        double summ1 = 0;
        double summ2 = 0;
        double summ3 = 0;
        double summ4 = 0;
        double summ5 = 0;
        int switcher = 1;
        double result = 0;
        while (switcher != 0) {
            sales.getalltables();
            System.out.println("Введите № продукта : " + "Для выхода нажмите 0");
            int n = scanner.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("Введите количество товара");
                    int amount = scanner.nextInt();
                    summ1 = sales.getProduct1() * amount;
                    System.out.println("Сумма товара№: " + n + " В количестве: " + amount + (" равно " + summ1) + "$");
                    break;
                }
                case 2: {
                    System.out.println("Введите количество товара");
                    int amount = scanner.nextInt();
                    summ2 = sales.getProduct2() * amount;
                    System.out.println("Сумма товара№: " + n + " В количестве: " + amount + (" равно " + summ2) + "$");
                    break;
                }

                case 3: {
                    System.out.println("Введите количество товара");
                    int amount = scanner.nextInt();
                    summ3 = sales.getProduct3() * amount;
                    System.out.println("Сумма товара№: " + n + " В количестве: " + amount + (" равно " + summ3) + "$");
                    break;
                }
                case 4: {
                    System.out.println("Введите количество товара");
                    int amount = scanner.nextInt();
                    summ4 = sales.getProduct4() * amount;
                    System.out.println("Сумма товара№: " + n + " В количестве: " + amount + (" равно " + summ4) + "$");
                    break;
                }
                case 5: {
                    System.out.println("Введите количество товара");
                    int amount = scanner.nextInt();
                    summ5 = sales.getProduct5() * amount;
                    System.out.println("Сумма товара№: " + n + " В количестве: " + amount + (" равно " + summ5) + "$");
                    break;
                }
                case 0: {
                    System.out.println("Выход");
                    break;
                }

                default:
                    System.out.println("Вы ошиблись номером");
                    break;
            }
            result = summ1 + summ2 + summ3 + summ4 + summ5;
            System.out.println("Сумма всех покупок: " + result + " $ ");
            System.out.println("Продолжить покупки ? 1 - да 0 нет");
            switcher = scanner.nextInt();
        }
    }
}

