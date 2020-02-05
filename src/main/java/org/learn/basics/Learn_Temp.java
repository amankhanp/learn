package org.learn.basics;

public class Learn_Temp {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay >= 0 && hourOfDay <= 23){
            if(barking && hourOfDay < 8) return true;
            else if (barking && hourOfDay > 22) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean output = shouldWakeUp(true, 4);
        System.out.println(output);
    }
}
