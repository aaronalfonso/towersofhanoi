package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        int length = input.length();
        double randomPlace = Math.random() * 5;
        double randomLoca = Math.random() * length;
        int place = (int)randomPlace;
        int count = 0;
        int randomLoc = (int)randomLoca;
        int loc = randomLoc;
        char[] finalString = input.toCharArray();

        for (count=0; count <= length; count++) {
            if (place == 0) {
                finalString[loc] = Integer.toHexString(finalString[loc]); //Trying to find this method for string/char instead of Integer
                count++;
                place = 1;
            } else if (place == 1) {
                finalString[loc] = Integer.toBinaryString(); //Trying to find this method for string/char instead of Integer
                count++;
                place = 2;
            } else if (place == 2) {
                count++;
                place = 3;
            } else if (place == 3) {
                count++;
                place = 4;
            } else if (place == 4) {
                count++;
                place = 0;
            }
            if (randomLoc > length) {

            }
        }
        System.out.println(finalString[0]);
    }
}
