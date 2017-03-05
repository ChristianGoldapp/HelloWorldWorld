package de.chrisgold.helloworldworld.factory;

import java.io.PrintStream;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class PrinterImpl implements Printer{

    @Override
    public void accept(String s, PrintStream printStream) {
        printStream.print(s);
    }
}
