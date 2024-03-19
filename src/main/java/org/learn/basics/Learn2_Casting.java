package org.learn.basics;

/**
 * Casting: It means to treat or to convert a number from one type to another type.
 * We put the type we want the number to be in parentheses;
 * note: Other languages have casting this is not just java thing.
 *
 * Syntax: (byte) (myValue);
 */
public class Learn2_Casting {

    public static void main(String[] args) {
        byte myMinByteValue = Byte.MIN_VALUE;
        short myMinShortValue = Short.MIN_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;

        /*
         * In this below-given syntax, we are just dividing our value by 2.
         * System considering those values in int, but we need byte, In this
         * case we need to cast the value in byte form.
         *
         * To check the compile time error message, uncomment below line.
         */
        // Byte myByteSumValue1 = (myMinByteValue / 2);
        byte myByteSumValue = (byte) (myMinByteValue / 2);
        System.out.println("myByteSumValue is: " + myByteSumValue);

        /*
         * In this below-given syntax, we are just dividing our value by 2.
         * System considering those values in int, but we need short, In this
         * case we need to cast the value in byte form.
         *
         * To check the compile time error message, uncomment below line.
         */
        // Short myShortSumValue1 = (myMinShortValue / 2);
        short myShortSumValue = (short) (myMinShortValue / 2);
        System.out.println("myShortSumValue is: " + myShortSumValue);

        /*
         * In this case, we need to cast the value in int, by default
         * system treats in int. So no type casting needs.
         */
        int myIntSumValue = (myMinIntValue / 2);
        System.out.println("myIntSumValue is: " + myIntSumValue);

        /*
         * ### Challenge-1 ###
         * Create byte data-type and assign its type value, follow the same thing for short and int.
         * Now create a long value and assign it to 50000 Long types and 10 times multiple of byte, short and int values.
         */

        byte myChallengeByteVariable = 10;
        short myChallengeShortVariable = 20;
        int myChallengeIntVariable = 30;
        long myChallengeLongSumValue = 50000L + (10L * (myChallengeByteVariable + myChallengeShortVariable + myChallengeIntVariable));
        System.out.println("myChallengeLongSumValue is: " + myChallengeLongSumValue);

        /*
         * In the below-given syntax, we added byte,short and int value and assigned it to short variable.
         * In this case, we need to cast the result.
         *
         * To check the condition please uncomment the below syntax
         */
        //short myChallengeShortSumValue1 = 50000 + (10 * (myChallengeByteVariable + myChallengeShortVariable + myChallengeIntVariable));
        short myChallengeShortSumValue = (short) (10000 + (10 * (myChallengeByteVariable + myChallengeShortVariable + myChallengeIntVariable)));
        System.out.println("myChallengeShortSumValue is: " + myChallengeShortSumValue);
    }
}
