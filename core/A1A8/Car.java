package core.juja.A1A8;

public abstract class Car {

    private String model;
    private String color;
    private int maxSpeed;

    public void gas() {
        System.out.println("Газуем!");
    }

    public abstract void brake();

    //геттеры и сеттеры
}

