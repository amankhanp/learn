package org.learn.basics;

/**
 * In this class we are going to understand better about type value overflow
 * and underflow.
 *
 * Simply we are create int type variables and check its max and min value.
 * then to try to add max + 1 and min -1.
 *
 * Explanation: if we try to put a value larger than the maximum value in java,
 * or a value smaller than the minimum value in java, then we will get an
 * 'Overflow' in case of maximum and 'Underflow' in case of minimum.
 * This behaviour is called integer-wraparound.
 */
public class Learn1_OverflowUnderflow {
    public static void main(String[] args) {
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("myMaxIntValue is : "+ myMaxIntValue ); // output: 2147483647
        System.out.println("myMinIntValue is : "+ myMinIntValue ); // output: -2147483648
        System.out.println("busted max value is : "+ (myMaxIntValue + 1)); // output: -2147483648
        System.out.println("busted min value is : "+ (myMinIntValue - 1)); // output: 2147483647

        int myMaxIntValue2 = 2147483647; // Here given max int value which is acceptable
        int myMinIntValue2 = -2147483648; // Here given min int value which is acceptable
        System.out.println("myMaxIntValue2 : "+ myMaxIntValue2 ); // output: 2147483647
        System.out.println("myMinIntValue2 : "+ myMinIntValue2 ); // output: -2147483648

        /*
        If you have given 'int' value more than its max or less then its min you will
        get an compile time error saying Integer value is too large.
        for checking uncomment the below 2 lines and compile the code.
         */
        //int myMaxIntValue3 = 2147483648;
        //int myMinIntValue3 = -2147483649;

        /**
         * Another great example to understand Overflow
         * Here 'value'(variable type int) is assigned with
         * 2147483647 (2147483648 - 1), after the for loop runs
         * it will print the value and then increment its value by 1
         * output will be 2147483648 again increment by 1 based on logic
         * then overflow take place and output will be -2147483648 again
         * after increment output is -2147483647.
         */
        int intValue = Integer.MAX_VALUE-1;
        for(int index = 0; index < 4; index++, intValue++) {
            System.out.println(intValue);
        }

    }
}
