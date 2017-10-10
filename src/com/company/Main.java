package com.company;

import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int exit = 2;
        while (exit == 2){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Hi, what's your name?");
            String name = userInput.nextLine();
            exit = 1;
            while (exit == 1){
                perfectRandom randomNum = new perfectRandom();
                int randomNumber = randomNum.perfectRandom();
                System.out.println("Hi " + name + ". Your lucky number for today is " + randomNumber);
                System.out.println("If you would like to exit, enter 0. To get another lucky number, enter 1. To change your name, enter 2.");
                exit = userInput.nextInt();
            }
            if (exit == 0) {
                System.out.println("Exiting program...");

            }
            if (exit != 0 && exit != 1 && exit != 2) {
                System.out.println("Incorrect integer entered, exiting program...");
            }
        }

    }
}
