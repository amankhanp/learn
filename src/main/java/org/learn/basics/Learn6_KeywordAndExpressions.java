package org.learn.basics;

/**
 * In this class we learn about Java Keywords and Expressions.
 * note: Reserved keywords cannot use them as identifiers in the program.
 *
 * The keywords 'const' and 'goto' are reserved, even though they are not currently used.
 * true, false, and null might seem like keywords, but they are actually literals;
 * you cannot use them as identifiers in your programs.
 *
 * Read more: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
 */
public class Learn6_KeywordAndExpressions {

    public static void main(String[] args) {
        /**
         * Examples-1 is to describe Expressions.
         * In the below syntax, "kilometers = (100 * 1.689344)" is known
         * as expression.
         * if we include data type whole thing is called java statement.
         * An expression contains variables, values & operators, but java
         * reserved keywords and semi-column are not part of the expressions.
         */
        // Examples-1: a mile is equal to 1.689344 kilometers.
        double kilometers = (100 * 1.689344);

        /**
         * In Example-2, is also about Expressions.
         * "tempValue = 50", tempValue == 50 & "\"This is also an Expression"\"
         * is an expression.
         */
        int tempValue = 50;
        if (tempValue == 50){
            System.out.println("This is also an Expression");
        }
    }
}
