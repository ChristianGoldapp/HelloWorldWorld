package de.chrisgold.helloworldworld.factory;

import java.util.concurrent.Callable;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class StreamSupplierFactory implements Callable<StreamSupplier>{
    @Override
    public StreamSupplier call() throws Exception {
        return new SystemOutImpl();
    }
}
