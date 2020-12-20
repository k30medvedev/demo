package deiteiPJCourse.Lab5;
public class StarDraw {
    public static void main(String[] args) {

        for(int i =15;i>=0; i=i-1){ // i=i-2 because *s are getting incremented by 2
            for(int j =0;j<=5; j++){
                if(i>=j){ // if j >= i then print * else space(" ")
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();// a new line just after printing *s

        }
    }
}
