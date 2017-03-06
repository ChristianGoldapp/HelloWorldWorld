package de.chrisgold.helloworldworld.factory;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class PrinterFactory extends AbstractFactory<Printer> {
    @Override
    public Printer call() throws Exception {
        return new PrinterImpl();
    }
}
