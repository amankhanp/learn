package org.learn.basics;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Learn_Temp {
    /*public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }*/

    /*public static boolean areEqualByThreeDecimalPlaces(double value1, double value2){
        if((int) (value1*1000) == (int) (value2*1000)){
            return true;
        }
        return false;
    }*/

    /*public static boolean isTeen(int val){
        if(val >= 13 && val <= 19)
            return true;
        return false;
    }*/

    public static void main(String[] args) {
        boolean output = false;
        //output = isLeapYear(1924);
        //output = areEqualByThreeDecimalPlaces(3.175,3.176);
        //output = isTeen(13);
        System.out.println(output);
    }
}
