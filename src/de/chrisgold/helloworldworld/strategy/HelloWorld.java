package de.chrisgold.helloworldworld.strategy;

/**
 * This version uses a Strategy pattern through a method reference to print Hello World
 *
 * @author Chris Gold
 * @version 1.0
 */
public class HelloWorld {
    public interface Strategy {
        void main(String[] args);

        default void use() {
            main(new String[0]);
        }
    }

    public static void main(String[] args) {
        Strategy s = de.chrisgold.helloworldworld.reference.HelloWorld::main;
        s.use();
    }
}
