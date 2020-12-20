package io;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WriteTest {

    static final String SECRET_NUMBER = "Who's your daddy?";
    public void Writer(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
          writer.write(SECRET_NUMBER);
            writer.write("-------");
          writer.write("Hello");
            writer.write(" ");
          writer.write("World");
            writer.write("--------");
          writer.append("Передаю привет Маше!", 0, 5);
            writer.write("---------");
            writer.write("12345678910",0,5);

        }
    }
}



