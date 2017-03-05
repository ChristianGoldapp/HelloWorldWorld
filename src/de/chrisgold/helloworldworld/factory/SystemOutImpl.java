package de.chrisgold.helloworldworld.factory;

import java.io.PrintStream;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class SystemOutImpl implements StreamSupplier{
    @Override
    public PrintStream call() throws Exception {
        return System.out;
    }
}
