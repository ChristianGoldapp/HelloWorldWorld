package de.chrisgold.helloworldworld.decorator;

/**
 * This version of HelloWorld uses the decorator pattern to print Hello World.
 * @author Chris Gold
 * @version 1.0
 */
public class HelloWorld {

    public static void main(String[] args) {
        Printable p = new Hello(new World(new Printer()));
        p.print();
    }

    /**
     * This is the base class that is being decorated.
     * It just prints "\n".
     */
    static class Printer implements Printable {
        @Override
        public void print() {
            System.out.println();
        }
    }

    /**
     * This is the base interface
     */
    interface Printable {
        void print();
    }

    /**
     * This is the abstract decorator for a Printer
     */
    static abstract class Decorator implements Printable {
        final Printable p;

        protected Decorator(Printable p) {
            this.p = p;
        }
    }

    /**
     * This decorator attaches "Hello " in front of the Printable it decorates.
     */
    static class Hello extends Decorator {

        Hello(Printable p) {
            super(p);
        }

        @Override
        public void print() {
            System.out.print("Hello ");
            p.print();
        }
    }

    /**
     * This decorator attaches "World!" in front of the Printable it decorates.
     */
    static class World extends Decorator {

        World(Printable p) {
            super(p);
        }

        @Override
        public void print() {
            System.out.print("World!");
            p.print();
        }
    }
}
