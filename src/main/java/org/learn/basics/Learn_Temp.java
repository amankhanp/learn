package org.learn.basics;

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

    /*public static double area(double radius){
        if (radius >= 0.0 ){
            return radius * radius * Math.PI;
        } else {
            return -1.0;
        }
    }

    public static double area(double x, double y){
        if (x >= 0.0 && y >= 0.0){
            return x * y;
        } else {
            return -1.0;
        }
    }*/

    /*public static boolean isLeapYear(int year){
        if(year >= 1 && year <= 9999){
            if((year % 4 == 0 && !(year % 100 == 0)) || (year % 4 == 0 && year % 400 == 0)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        } else {
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            } else if (month == 2) {
                if(isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }
            } else {
                return 31;
            }
        }
    }*/

    /*public static void isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }
        int reverse = 0;
        int lastDigit;
        int number1 = number;
        while(number > 0){
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number = number / 10;
        }
        if(number1 == reverse){
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }*/



    public static void main(String[] args) {
        //boolean output = false;
        //output = isLeapYear(1924);
        //output = areEqualByThreeDecimalPlaces(3.175,3.176);
        //output = isTeen(13);
        //System.out.println(output);

        /*double output = area(5.0);
        System.out.println(output);
        double output = area(0.0);
        System.out.println(output);
        double output = area(-5.0);
        System.out.println(output);*/

        /*int output = getDaysInMonth(12, 10000);
        System.out.println(output);*/

        /*isPalindrome(1221);
        isPalindrome(1321);
        isPalindrome(786687);
        isPalindrome(8956);
        isPalindrome(-88);*/



    }
}
