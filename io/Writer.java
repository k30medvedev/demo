package io;

import AllCollections.treemap.AverageStudentGrade;
import AllCollections.treemap.SubjectGrade;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

public class Writer {


    public void writeFile(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (AverageStudentGrade gradeKey : grades.keySet()) {
                writer.write("--------------------\n");
                writer.write("Student: " + gradeKey.getName() + "Avarage grade: " + gradeKey.getAverageGrade() + "\n");
                for (SubjectGrade grade : grades.get(gradeKey)) {
                    writer.write("Subject: " + grade.getSubject() + " Grade: " + grade.getGrade() + "\n");
                }
            }
        }
    }

public void writeObject(List<Student> students, String fileName)
{try {
    ObjectOutputStream out  = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)));
    for(Student student:students){
        out.writeObject(student);
    }
} catch (IOException e) {
    System.out.println("File can not be opened. Programm terminates");
    e.printStackTrace();
}
};
}

