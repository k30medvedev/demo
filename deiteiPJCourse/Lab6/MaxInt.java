package deiteiPJCourse.Lab6;

public class MaxInt {

    public static int maxValue(int x, int y, int z){
     int max =0;
     if (x>y & x>z)
         max=x;
     if(y>x & y>z)
        max=y;
     if(z>x & z>y)
       max=z;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(MaxInt.maxValue(1,10,33));
    }
}
