package de.chrisgold.helloworldworld.factory;

/**
 * @author Chris Gold
 * @version 1.0
 */
public class StringSupplierFactory extends AbstractFactory<StringSupplier> {

    @Override
    public StringSupplier call() throws Exception {
        return new HelloWorldSupplierImpl();
    }
}
