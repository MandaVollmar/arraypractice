package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double[] dailyAverageTemp = new double [7];
        Scanner userInput = new Scanner (System.in);
        for(int i=0; i<dailyAverageTemp.length; i++) {
            System.out.println ("Enter a temperature for " + (i+1) + ": ");
            dailyAverageTemp[i] = userInput.nextDouble();

        }
        System.out.println("Each daily average temperature is: " + Arrays.toString(dailyAverageTemp));

         double weekly =   Arrays.stream(dailyAverageTemp).sum() / dailyAverageTemp.length;
        System.out.println("The average weekly temperature is: " + weekly);
    }
}
