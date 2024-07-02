package org.learn.basics;

/**
 * In this class, we are going to learn about 'Char' and 'Boolean' Primitive types.
 *
 * --- About char ---
 * A char occupies two bytes of memory, or 16 bits and thus has a width of 16. The
 * reason it's not just a single byte is that it allows you to store Unicode characters.
 *
 * Unicode is an international encoding standard for use with different languages and
 * scripts, by which each letter, digit, or symbol is assigned a unique numeric value
 * that applies across different platforms and programs.
 *
 * In English alphabets, we have the letters A through Z. Meaning only 26 characters
 * are needed in total to represent the entire English alphabets. But other languages
 * need more characters, and often a lot more.
 *
 * Unicode allows us to represent these languages, and the way it works is that by using
 * a combination of the two bytes that a char takes up in memory, it can represent and
 * one of 65535 different types of characters.
 *
 * --- About boolean ---
 * A boolean value allows for two choices True or False, Yes or No, 1 or 0. In Java
 * terms we have a boolean primitive type, and it can be set to two values only. True
 * or false. They are actually pretty useful, and you will use them a lot when programming.
 */
public class Learn3_CharBooleanPrimitiveTypes {

    public static void main(String[] args) {
        char myCharacterValueOfChar = 'D';
        char myCharacterValueOfUnicode = '\u0044';
        char myCharacterValueOfUnicode2 = '\u00AE';
        boolean myBooleanValueIsFalse = false;
        boolean myBooleanValueIsTrue = true;
        System.out.println("myCharacterValueOfChar is: " + myCharacterValueOfChar);
        System.out.println("myCharacterValueOfUnicode is: " + myCharacterValueOfUnicode);
        System.out.println("myCharacterValueOfUnicode2 is: " + myCharacterValueOfUnicode2);
        System.out.println("myBooleanValueIsFalse is: " + myBooleanValueIsFalse);
        System.out.println("myBooleanValueIsTrue is: " + myBooleanValueIsTrue);
    }
}
