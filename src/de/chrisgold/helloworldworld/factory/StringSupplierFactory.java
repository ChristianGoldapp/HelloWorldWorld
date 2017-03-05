package de.chrisgold.helloworldworld.factory;

import java.util.concurrent.Callable;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class StringSupplierFactory implements Callable<StringSupplier> {

    @Override
    public StringSupplier call() throws Exception {
        return new HelloWorldSupplierImpl();
    }
}
