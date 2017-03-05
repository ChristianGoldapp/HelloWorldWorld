package de.chrisgold.helloworldworld.factory;

import java.util.concurrent.Callable;

/**
 * @author Chris Gold
 * @version 1.0
 */
public interface StringSupplier extends Callable<String>{
    public default String getString() throws Exception {
        return call();
    }
}
