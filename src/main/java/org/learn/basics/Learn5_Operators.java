package org.learn.basics;

/**
 * In this class we discuss about operators.
 *
 * Read about Summary of Operators: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
 * Read about Java Operator Precedence Table: http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
 */
public class Learn5_Operators {

    public static void main(String[] args) {
        /**
         * Here, We see =, ==. We use '=' sign to assign a value to a variable.
         * which is also know as assignment operator and '==' is known as
         * equals-to operator through which we compare two values.
         * In the below given example 'if' condition accepts boolean value, == is
         * an 'operator' myIntValue and 50 are 'operands' and myIntValue == 50
         * is an 'expression'. myIntValue == 50, it means myIntValue is equal to 50
         * or not, true or false.
         */
        int myIntValue = 50;
        if (myIntValue == 50) {
            System.out.println("myIntValue is equal to 50, Which is true");
        }

        /**
         * In the below example, We have a boolean variable myBooleanValue is false,
         * and in if condition we are changing its value with true, overall if(true)
         * which is valid condition. This is not a recommended way, example is just
         * to make clear we can use assignment operators to boolean variables in if
         * condition.
         */
        boolean myBooleanValue = false;
        if (myBooleanValue = true) {
            System.out.println("myBooleanValue is false and then assigned it to true");
        }

        /**
         * Ternary Operator: it is a shortcut to assigning one or two values to a
         * variable depending on a given condition.
         *
         * it's a shortcut of the if-then-else statement.
         */
        int ageOfClient = 20;
        boolean wasAgeOfClient = ageOfClient == 20;
        if (wasAgeOfClient) {
            System.out.println("Yes, Age of Client is 20.");
        }
        ageOfClient = 21;
        boolean wasAgeOfClientSame = ageOfClient == 20;
        if (wasAgeOfClientSame) {
            System.out.println("Yes, Still Age of Client is 20.");
        }

        /**
         * ### Challenge-3 ###
         */
        double myChallengeDoubleValue1 = 20.00d;
        double myChallengeDoubleValue2 = 80.00d;
        double myChallengeAddOfVal1Val2AndMultipliedValue = myChallengeDoubleValue1 + myChallengeDoubleValue2 * 100.00d;
        System.out.println("myChallengeAddOfVal1Val2AndMultipliedValue is : " + myChallengeAddOfVal1Val2AndMultipliedValue);
        double myChallengeReminderValue = myChallengeAddOfVal1Val2AndMultipliedValue % 40.00d;
        System.out.println("myChallengeReminderValue is : " + myChallengeReminderValue);
        boolean isMyChallengeReminderValueTrue = myChallengeReminderValue == 0 ? true : false;
        System.out.println("isMyChallengeReminderValueTrue is : "+isMyChallengeReminderValueTrue);
        if(!isMyChallengeReminderValueTrue){
            System.out.println("Got Some Reminder");
            /**
             * value is not 0.00 because of the below syntax.
             * syntax1: myChallengeDoubleValue1 + myChallengeDoubleValue2 * 100.00d;
             * '*' has high precedence than '+' so first it multiplies and then addition
             * took place. To get correct output use below syntax.
             * syntax2: (myChallengeDoubleValue1 + myChallengeDoubleValue2) * 100.00d;
             */
        }
    }
}
