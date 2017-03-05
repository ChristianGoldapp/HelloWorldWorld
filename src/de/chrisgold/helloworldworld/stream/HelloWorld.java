package de.chrisgold.helloworldworld.stream;

import java.util.stream.IntStream;

/**
 * This version uses a Stream to print the Hello World.
 * @author Chris Gold
 * @version 1.0
 */
public class HelloWorld {

    public static final String helloworld = "Hello World!\n";

    public static void main(String[] args) {
        IntStream.range(0, helloworld.length()).mapToObj(helloworld::charAt).map(x -> (Runnable) () -> System.out.print(x)).forEach(Runnable::run);
    }
}
