package de.chrisgold.helloworldworld.factory;

import java.io.PrintStream;
import java.util.function.BiConsumer;

/**
 * @author Chris Gold
 * @version 1.0
 */
public interface Printer extends BiConsumer<String, PrintStream> {
    public default void print(String string, PrintStream printStream){
        accept(string, printStream);
    }
}
