package org.learn.basics;

/**
 * String: The String is a data-type in a java, which is not a primitive-type.
 * it's actually a Class, but it enjoys a bit of favoritism in java to make
 * it easier to use than a regular class.
 *
 * A String is a sequence of a characters. A large no.of characters. Technically
 * it's limited by memory.
 *
 * ### String in java are immutable ###
 * When i said you can delete characters out of String, that's not strictly true.
 * Because Strings in java are immutable. That means you can't change a String
 * after it's created. Instead, what happens is a new String is created.
 * read: https://mkyong.com/java/java-mutable-and-immutable-objects/
 */
public class Learn4_String {

    public static void main(String[] args) {
        String myStringValue = "This is a String";
        System.out.println("myStringValue is: " + myStringValue);

        myStringValue = myStringValue + "and this is more.";
        System.out.println("myStringValue is: " + myStringValue);

        myStringValue = myStringValue + "\u00A9 2020";
        System.out.println("myStringValue is: " + myStringValue);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("numberString is: " + numberString);

        /**
         * Here, In the below code I'm creating string variable and then int variable.
         * Adding both the values and storing it in string variable then what could be
         * the output.
         *
         * simple, Java is smart enough to convert int value as string will whole statement
         * is assigned to string.
         *
         * note: as we read in class description, Java Strings are immutable.
         * In this case of this code, lastStringValue doesn't get appended the value "50"
         * instead a new String is created which consists of the previous value lastStringValue
         * plus a text representation of the int value myIntValue 10.
         *
         * In net result is the same, lastStringValue has the right values, however, a new
         * String got created and old one got discarded from memory automatically by java.
         */
        String lastStringValue = "50";
        int myIntValue = 10;
        lastStringValue = lastStringValue + myIntValue;
        System.out.println("lastStringValue is: " + lastStringValue);
    }
}
