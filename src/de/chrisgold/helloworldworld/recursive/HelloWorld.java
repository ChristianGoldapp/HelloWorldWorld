package de.chrisgold.helloworldworld.recursive;

/**
 * This version of HelloWorld uses recursion to get the job done.
 *
 * @author Chris Gold
 * @version 1.0
 */
public class HelloWorld {
    /**
     * At the start, the main-Method is called with a String[] of length 0.
     * It then calls itself, with "Hello World!\n" as the only Element in the Array.
     * If the array has length 1, the String is split up into its first letter and the rest. The method is then called with both Strings in the Array.
     * If the array has length 2, the first String is printed and the method is called again with the second one.
     * Thus, two recursions are used for every single letter, first to split it off, then to print it.
     *
     * @param args
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            main(new String[]{"Hello World!\n"});
        } else if (args.length == 1 && args[0].length() > 0) {
            main(new String[]{args[0].substring(0, 1), args[0].substring(1)});
        } else if (args.length == 2) {
            System.out.print(args[0]);
            if (args[1].length() > 0) {
                main(new String[]{args[1]});
            }
        }
    }
}
