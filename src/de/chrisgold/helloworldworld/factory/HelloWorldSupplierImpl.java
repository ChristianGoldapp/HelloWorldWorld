package de.chrisgold.helloworldworld.factory;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class HelloWorldSupplierImpl implements StringSupplier{
    @Override
    public String call() throws Exception {
        return "Hello World!\n";
    }
}
