package io;

import AllCollections.treemap.AverageStudentGrade;
import AllCollections.treemap.SubjectGrade;
import AllCollections.treemap.TreeMapRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class IOMain {

    private static final String FILE_NAME = "GradeBook.txt";
    private static final String BYNARY_FILE = "Students.bin";

    public static void main(String[] args) throws IOException {

        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrade();
        Writer writer = new Writer();
        Reader reader = new Reader();

        writer.writeFile(grades, FILE_NAME);
        reader.readFile(FILE_NAME);


       processGrades(grades,writer,BYNARY_FILE);
    }


  private  static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades,Writer writer, String filename)
  {

      List<Student> students  = new ArrayList<>();
      for(AverageStudentGrade gradeKey: grades.keySet()){
          students.add(new Student(gradeKey.getName(),gradeKey.getAverageGrade() ,grades.get(gradeKey) ));
                }

       writer.writeObject(students, filename);
  }
}


