package deiteiPJCourse.loops.lab3;

public class Person {
    private String name;
    private String secondName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0)
        this.age = age;
    } // Here getters and setters

    public Person(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;

        if(age > 0)
        this.age = age;
    }



}
