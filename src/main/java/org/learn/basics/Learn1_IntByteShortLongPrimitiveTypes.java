package org.learn.basics;

/**
 * In this class, we are going to understand better about type value overflow
 * and underflow.
 *
 * Also, few examples related to 'int,byte,short and long' they are also known
 * as 'Whole numbers'.
 * Note: Java treats 'int' as a default whole number.
 *
 * Simply we are creating int type variables and checking its max and min value.
 * Then to trying to add max + 1 and min -1.
 *
 * Explanation: if we try to put a value larger than the maximum value in java,
 * or a value smaller than the minimum value in java, then we will get an
 * 'Overflow' in case of maximum and 'Underflow' in case of a minimum.
 * This behavior is called integer-wraparound.
 */
public class Learn1_IntByteShortLongPrimitiveTypes {
    public static void main(String[] args) {
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("myMaxIntValue is : " + myMaxIntValue); // output: 2147483647
        System.out.println("myMinIntValue is : " + myMinIntValue); // output: -2147483648
        System.out.println("busted max value is : " + (myMaxIntValue + 1)); // output: -2147483648 (Overflow)
        System.out.println("busted min value is : " + (myMinIntValue - 1)); // output: 2147483647 (Underflow)

        int myMaxIntValue2 = 2147483647; // Here given max int value which is acceptable
        int myMinIntValue2 = -2147483648; // Here given min int value which is acceptable
        System.out.println("myMaxIntValue2 : " + myMaxIntValue2); // output: 2147483647
        System.out.println("myMinIntValue2 : " + myMinIntValue2); // output: -2147483648

        /*
        If you have given 'int' value more than its max or less than its min, then you will
        get a compile time error saying Integer value is too large.
        For checking uncommenting the below 2 lines and compile the code.
         */
        //Int myMaxIntValue3 = 2147483648; //Integer value is too large.
        //Int myMinIntValue3 = -2147483649; //Integer value is too large.

        /*
         * In Java SE 7 and later, any number of underscore characters (_) can appear anywhere
         * between digits in a numerical literal, which can improve the readability of your code.
         * For better understanding of underscore between the decimals follow the java.doc
         * https://docs.oracle.com/javase/8/docs/technotes/guides/language/underscores-literals.html
         */
        int myValue1 = 1_190;
        int myValue2 = 1_0;
        System.out.println("Values with underscore between digits after sum is : " + (myValue1 + myValue2));

        /*
         * Another great example to understand Overflow
         * Here 'value'(variable type int) is assigned with
         * 2147483647 (2147483647 - 1), after the for loop runs
         * it will print the value and then increment its value by 1
         * output will be 2147483647 again increment by 1 based on logic
         * then overflow take place and output will be -2147483648 again
         * after increment output is -2147483647.
         */
        int intValue = Integer.MAX_VALUE - 1;
        for (int index = 0; index < 4; index++, intValue++) {
            System.out.println(intValue);
        }

        byte myMaxByteValue = Byte.MAX_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("myMaxByteValue is : " + myMaxByteValue); // output: 127
        System.out.println("myMinByteValue is : " + myMinByteValue); // output: -128

        short myMaxShortValue = Short.MAX_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("myMaxShortValue is : " + myMaxShortValue); // output: 32767
        System.out.println("myMinShortValue is : " + myMinShortValue); // output: -32768

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("myMaxLongValue is : " + myMaxLongValue); // output: 9223372036854775807
        System.out.println("myMinLongValue is : " + myMinLongValue); // output: -9223372036854775808

        long myLongValue1 = 2147483647;
        /*
         * if you declare long value without suffix 'L', it considers under Integer value.
         * to check uncommenting the below line and compile the code.
         */
        //long myLongValue2 = 2147483648; // compile time error: Integer number too large
        long myLongValue3 = 2147483648674576L;
        System.out.println("myLongValue3 is : "+ myLongValue3);
    }
}
