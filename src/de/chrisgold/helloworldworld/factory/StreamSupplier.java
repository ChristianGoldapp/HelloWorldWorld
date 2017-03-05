package de.chrisgold.helloworldworld.factory;

import java.io.PrintStream;
import java.util.concurrent.Callable;

/**
 * @author Chris Gold
 * @version 1.0
 */
public interface StreamSupplier extends Callable<PrintStream>{
    public default PrintStream getPrintStream() throws Exception {
        return call();
    }
}
