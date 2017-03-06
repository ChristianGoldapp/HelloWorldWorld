package de.chrisgold.helloworldworld.factory;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class StreamSupplierFactory extends AbstractFactory<StreamSupplier> {
    @Override
    public StreamSupplier call() throws Exception {
        return new SystemOutImpl();
    }
}
