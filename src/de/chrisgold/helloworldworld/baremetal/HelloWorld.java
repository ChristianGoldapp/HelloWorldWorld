package de.chrisgold.helloworldworld.baremetal;

import java.io.*;
import java.lang.reflect.Field;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) throws IOException {
        char[] hello_world = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!', '\n', '\0'};
        FileOutputStream stdout = getRawStdOut();
        if (stdout == null) {
            System.exit(-1);
        }
        for (int i = 0; i < hello_world.length; i = i + 1) {
            byte b = (byte) hello_world[i];
            stdout.write(b);
        }
        stdout.flush();
    }

    public static FileOutputStream getRawStdOut() {
        //We want to access System.out.out
        PrintStream sout = System.out;
        try {
            Field rawoutField = FilterOutputStream.class.getDeclaredField("out");
            rawoutField.setAccessible(true);
            BufferedOutputStream bos = (BufferedOutputStream) rawoutField.get(sout);
            return (FileOutputStream) rawoutField.get(bos);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
