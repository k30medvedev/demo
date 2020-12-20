package io.juja.lab44;

import java.io.IOException;

public interface EntityInput {

    public Person readPerson() throws IOException;

    public Point readPoint() throws IOException;
}
