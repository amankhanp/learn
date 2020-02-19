package org.learn.basics;

/**
 * Concept: Method Overloading
 * Method Overloading is a feature that allows us to have more than one method with the same name,
 * so as long as we use different parameters.
 *
 * It is ability to create multiple methods of the same name with different implementations.
 *
 * Calls to an overloaded method will run a specific implementation of that method.
 *
 * Advantages:
 * > It Improves the code readability and re-usability.
 * > It is easier to remember one method name instead of remembering multiple names.
 * > Achieves consistency in naming. One name for methods that are commonly used for example println.
 * > Overloaded methods give programmers the flexibility to call a similar method with different types
 * of data.
 */
public class Learn8_MethodOverloading {

    /**
     * ### Challenge-5 ###
     * To calculate Feet and Inches to Centimeters
     * and calculate Inches to Centimeters using method overloading concept.
     * @param feet 1 feet = 12 Inches
     * @param inches 1Inch = 2.54cm
     * @return in centimeters.
     */
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            return ((feet * 12) + inches) * 2.54;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }

    /**
     * ### Challenge-7 ###
     * Create a method called getDurationString with two params, 1st is minutes and 2nd is seconds.
     * You should validate that the 1st param minutes is >=0.
     * also validate that the 2nd param seconds is >=0 & <=59.
     * then return "Invalid Value" in the method if either of the above are not true.
     *
     * If the parameters are valid then calculate how many hours minutes and seconds equal the minutes
     * and seconds passed to this method and return that value as string in format "XXh YYm ZZs" where
     * XX represents a number of hours, YY the minutes and ZZ the seconds.
     *
     * Create a 2nd method of the same name but with only one parameter seconds.
     * Validate that it is >=0, and return "Invalid value" if it is not true.
     * If it is valid, then calculate how many minutes are in the seconds value and then call
     * the overloaded method passing the correct minutes and seconds calculated so that it can
     * calculate correctly.
     *
     * call both methods to print values to the console.
     *
     * Tips:
     * >Use int or long for your number data types is probably a good idea.
     * >1 minute = 60seconds and 1 hour = 60minutes or 3600seconds.
     *
     * Bonus:
     * >For the input 61minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 1s
     * (Tip: use if-else)
     * Create a new console project and call it secondsAndMinutesChallenge.
     */
    public static String getDurationString(int minutes, int seconds){
        if(minutes >=0 && (seconds >= 0 && seconds <= 59)){
            int hours = minutes / 60;
            minutes = minutes % 60;
            return hours+"h "+minutes+"m "+seconds+"s";
        } else {
            return "Invalid value";
        }
    }

    public static String getDurationString(int seconds){
        if(seconds >= 0){
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        } else {
            return "Invalid value";
        }
    }

    public static void main(String[] args) {

        /*
        Output for ### Challenge-5 ###
         */
        double feetAndInchesToCentimeters = calcFeetAndInchesToCentimeters(7, 5);
        System.out.println("Feet and Inches to Centimeters : " + feetAndInchesToCentimeters);

        double inchesToCentimeters = calcFeetAndInchesToCentimeters(157);
        System.out.println("Inches to Centimeters" + inchesToCentimeters);

        /*
        Output for ### Challenge-6 ###
         */
        String timeByMinutesSeconds = getDurationString(198, 26);
        System.out.println("calculate time with input params minutes and seconds : " + timeByMinutesSeconds);

        String timeBySeconds = getDurationString(11907);
        System.out.println("calculate time with input param seconds : " + timeBySeconds);
    }
}
