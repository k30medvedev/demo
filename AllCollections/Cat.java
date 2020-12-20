package AllCollections;

public class Cat implements Comparable<Cat>{

    private String name;
    private Integer age;

    public Cat(String n, Integer a){
        this.name = n;
        this.age = a;
    };


    public boolean equals(Object aCat){
        Cat c = (Cat) aCat;
        return getName().equals(c.name);
    }

    public int hashCode(){
      return name.hashCode();
    }

    @Override
    public String toString() {
        return String.format( "name:" + name + " age:" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat cat) {
        if(this.age<cat.age)
            return -1;
        if(this.age>cat.age)
            return 1;
        return 0;
    }
}
