package io.juja.lab44;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

public class EntityInputReader implements EntityInput
{
    private final Reader in;

    public EntityInputReader(Reader in) {

        this.in = in;
    }


    @Override
    public Person readPerson() throws IOException {

        Person person = null;
        int age = person.getAge();


        char [] chars = new char[200];   // Количество символов, которое будем считывать

        String name = person.getName();

        

        return  new Person(name,age);
    }

    @Override
    public Point readPoint() throws IOException {
        return null;
    }
}
