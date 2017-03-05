package de.chrisgold.helloworldworld.factory;

import java.io.PrintStream;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class HelloWorld {
    public static void main(String[] args) throws Exception {
        PrintStream printStream = new StreamSupplierFactory().call().getPrintStream();
        String s = new StringSupplierFactory().call().getString();
        new PrinterFactory().call().print(s, printStream);
    }
}
