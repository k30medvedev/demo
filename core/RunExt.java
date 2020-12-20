package com.company;

public class RunExt extends Run {
    public RunExt(String name, int age) {
        super(name, age);
    }

  String name = "FIO";

        public String giveFio(String name){
        return this.name;
    }


    @Override
    public String toString() {
        return "RunExt{" +
                "name='" + name + '\'' +
                '}';
    }
}
