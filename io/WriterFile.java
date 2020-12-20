package io;

import org.junit.Test;
import sun.misc.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class WriterFile {


    @Test
    public void WriterFiles() throws IOException {

    File file = createNewFile(("Test.dat"));
    FileOutputStream out = new FileOutputStream(file);

    try {out.write(new byte[]{-48, -97, -47, -128, -48, -72, -48, -78,
            -48, -75, -47, -126, 32, -48, -100, -48, -72, -47, -128, 33});

    }finally {
        out.close();
    }


        FileInputStream in = new FileInputStream(file);
       // BufferedInputStream buffer = new BufferedInputStream(in);
        byte[] bytes = new byte[in.available()];
        int read = in.read(bytes);

        assertEquals(read, bytes.length);
        assertEquals("Привет Мир!", new String(bytes));

    }



    private File createNewFile(String pathname) throws IOException {
        File file = new File(pathname);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        file.deleteOnExit();
        return file;
    }
}

