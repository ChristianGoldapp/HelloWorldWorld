package de.chrisgold.helloworldworld.factory;

import java.util.concurrent.Callable;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class PrinterFactory implements Callable<Printer>{
    @Override
    public Printer call() throws Exception {
        return new PrinterImpl();
    }
}
