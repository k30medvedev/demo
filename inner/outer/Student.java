package inner.outer;

public class Student  extends Person{
    int ID;

    public void say(){
      System.out.println(" Я класс наследник ");
    };

    public Student(int ID,String n) {
        super.name = n;
        this.ID = ID;
    }
    public int getID() {
        return ID;



    }

}


