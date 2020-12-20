package com.company;

public class  Run {
    private  String name;
    private int age;

    final public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Run(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String gaveName(String name){
        return name;
    }

}
