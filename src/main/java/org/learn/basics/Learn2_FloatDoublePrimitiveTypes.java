package org.learn.basics;

/**
 * In this class, we are going to learn about float and Double Primitive types.
 * Note: Java treats 'Double' as a default floating point number.
 *
 * Unlike Whole Numbers, floating point numbers have fractional parts that we express with a
 * decimal points like 3.102300 an example.
 *
 * Floating point numbers are also known as real numbers.
 * We use floating points numbers when we need more precision in calculations.
 *
 * Precision refers to the format and amount of space occupied by the type.
 * Single precision
 * occupies 32bits(so has a width of 32), and Double precision occupies 64bits(and thus has a
 * width of 64).
 *
 * In General, float and double are great for general floating points operations.
 * But both are not great to use where precise calculation is required - this is due to a limitation
 * with how floating point numbers are stored, and not a Java problem as such.
 *
 * But Java has a solution for this, Java has a class called 'BigDecimal' that overcomes this.
 * When precise calculations are necessary, such as when performing currency calculations,
 * floating-point types should not be used.
 *
 * But for general calculations float and double are fine.
 */
public class Learn2_FloatDoublePrimitiveTypes {
    public static void main(String[] args) {
        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("myMaxFloatValue is : " + myMaxFloatValue); // output: 3.4028235E38
        System.out.println("myMinFloatValue is : " + myMinFloatValue); // output: 1.4E-45

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("myMaxDoubleValue is : " + myMaxDoubleValue); // output: 1.7976931348623157E308
        System.out.println("myMinDoubleValue is : " + myMinDoubleValue); // output: 4.9E-324

        /*
         * In general, we for whole data-type value by default int are accepted,
         * in the same way for real data-types by default double is accepted.
         *
         * For float, we need to suffix with 'f' and for Double 'd' for good
         * programming practise also it makes a lot of difference.
         */
        int myIntValue = 10;
        float myFloatValue = 10f;
        double myDoubleValue = 10d;

        /*
         * If we have created a float value without its type declaration
         * and assigned it to float variable, then we get an error saying
         * required float because a system considering real numbers
         * default values in double type.
         *
         * To validate condition uncomment the below syntax and validate it.
         */
        // {float myFloatRealValue1 = 10.5;}

        float myFloatRealValue = 10.5f;
        System.out.println("myFloatRealValue is: " + myFloatRealValue);

        /*
         * even though we haven't mentioned any suffix after value it granted as double.
         */
        double myDoubleRealValue = 10.5;
        System.out.println("myFloatRealValue is: " + myFloatRealValue);

        /*
         * ### Challenge-2 ###
         * Thinking back to the first challenge regarding casting, Then how do you
         * think you would do the same for the float to remove error?
         */

        float myChallengeFloatValue = (float) 10.5;
        System.out.println("myChallengeFloatValue is: " + myChallengeFloatValue);

        /*
         * ### Challenge-3 ###
         *  Convert a given number of Pounds to Kilograms.
         *
         *  Steps:
         *  1. Create a variable with the appropriate type to store the number of pounds
         *  to be converted to kilograms.
         *  2. Calculate the result i.e., the number of kilograms based on the contents of
         *  the variable above and store the result in the two appropriate variables.
         *  3. Print the result.
         *
         *  HINT: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform
         *  the calculation.
         */

        double noOfPounds = 15d;
        double convertedKilograms = noOfPounds * 0.45359237d;
        System.out.println("convertedKilograms is: " + convertedKilograms);
    }
}
