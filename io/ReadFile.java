package io;

import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws IOException {

    try {
        File myFile = new File("GradeBook.txt");

        FileReader fileReader = new FileReader(myFile);
        BufferedReader reader = new BufferedReader(fileReader);

        String c;
        while((c = reader.readLine()) != null)
        {
            System.out.println(c);  // show in console our data in File
        }



    }catch (Exception ex){
        ex.printStackTrace();
    }











        //        FileInputStream fin = new FileInputStream("GradeBook.txt");
//        DataInputStream din = new DataInputStream(fin);
//        double x = din.readDouble();


//DataInputStream din = new DataInputStream(
//        new BufferedInputStream(
//                new FileInputStream("GradeBook.txt")));


}

// PrintWriter out = new PrintWriter(
//         new OutputStreamWriter(
//                 new FileOutputStream(
//                         "Gradebook.txt"
//                 )
//         )
// );



}
