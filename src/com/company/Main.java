package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        int currentNumber = 1;
        int numberOfSteps = 6;


        System.out.println("Enter how many times you want the look-and-say sequence to refresh");
        numberOfSteps = keyboard.nextInt();
        while (numberOfSteps != 0) {

            numberOfSteps = numberOfSteps - 1;
            if (currentNumber == 1) {
                System.out.println(currentNumber);
                currentNumber = 11;
                System.out.println(currentNumber);
            } else if (currentNumber == 11) {
                currentNumber = 21;
                System.out.println(currentNumber);
            } else if (currentNumber == 21) {
                currentNumber = 1211;
                System.out.println(currentNumber);
            } else if (currentNumber == 1211) {
                currentNumber = 111221;
                System.out.println(currentNumber);
            } else if (currentNumber == 111221) {
                currentNumber = 312211;
                System.out.println(currentNumber);
            } else if (currentNumber == 312211) {
                currentNumber = 13112211;
                System.out.println(currentNumber);
            } else if (currentNumber == 13112211) {
                currentNumber = 1113212221;
                System.out.println(currentNumber);
            }
        }
        System.out.println("Sequence Finished.");
        }
        }
