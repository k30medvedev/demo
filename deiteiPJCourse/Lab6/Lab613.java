package deiteiPJCourse.Lab6;

public class Lab613 {

    public static int method1(int x){
        if(x <= 10)
        x+=10;
        else{x-=10;}
        return x;
    }
    public static void main(String[] args) {
        int a = -10;
        int b =  10;
        System.out.println(Lab613.method1(a) + Lab613.method1(b));
    }
}
