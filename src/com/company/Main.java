package com.company;

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
        System.out.println("Daily average temperatures are: " + dailyAverageTemp[7]);

    }
}
