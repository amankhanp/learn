package org.learn.basics;

import java.util.Scanner;

public class Learn9_ScannerClass {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);

        int readIntValue = scannerObj.nextInt();
        scannerObj.nextLine();
        String readStringValue = scannerObj.nextLine();

        System.out.println("Integer Value is: " + readIntValue);
        System.out.println("String Value is: " + readStringValue);

        /**
         * Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
         */

        /**
         * The concept of "consuming the leftover newline" is related to how different methods of the Scanner class handle input in Java.
         *
         * Understanding the Problem
         * When you use Scanner methods such as nextInt() or nextDouble(), these methods read the numerical input but leave the newline character (\n) in the input buffer. This can cause problems when you subsequently use nextLine(), which reads the entire line of input, including the newline character.
         *
         * Detailed Explanation
         * Here's a step-by-step explanation:
         *
         * Reading an Integer or Double:
         *
         * When you call nextInt() or nextDouble(), the Scanner reads the numerical value up to the point where it encounters a whitespace character (such as a space, tab, or newline). However, it does not consume the newline character that follows the number.
         * java
         * Copy code
         * int myInt = scanner.nextInt(); // Reads the integer, but newline remains in the buffer
         * Newline Character Left in the Buffer:
         *
         * After reading an integer or double, the newline character (\n) is still left in the input buffer. If you immediately call nextLine(), it will read this leftover newline character as an empty line.
         * java
         * Copy code
         * double myDouble = scanner.nextDouble(); // Reads the double, but newline remains in the buffer
         * Consuming the Newline Character:
         *
         * To avoid this issue, you need to explicitly consume the leftover newline character before calling nextLine(). You can do this by calling nextLine() once, which will read the leftover newline and discard it.
         * java
         * Copy code
         * scanner.nextLine(); // Consumes the leftover newline character
         * Reading the String:
         *
         * Now, when you call nextLine(), it will read the actual line of text as expected.
         * java
         * Copy code
         * String myString = scanner.nextLine(); // Reads the actual string input
         */
    }
}
