package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {


        public void readFile (String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName)); // invoke buffer reader to translate int data to real data
        String c;
        while((c = reader.readLine()) != null)
        {
            System.out.println(c);  // show in console our data in File
        }


    }

//public List<Student> readObject(String fileName){
//           List<Student> students  = new ArrayList<>();
//            try(ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
//
//               Student student = (Student) in.readObject();
//               students.add(student);
//                      } catch (IOException e) {
//                e.printStackTrace();
//            } catch (ClassNotFoundException e) {
//
//
//            }
//}
}