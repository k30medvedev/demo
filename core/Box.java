//package com.company;
//
//import java.util.Objects;
//
//public class Box extends Triangle{
//    String name;
//
//    public Box(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Box{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        if (this == null)|| getClass() != o.getClass()) return false;
//        Box box = (Box) o;
//        return Objects.equals(name, box.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
//}
