package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner userInput = new Scanner(System.in);
	    
	    System.out.println("Enter the amount of disks in the game");
	    int num = userInput.nextInt();
	    
	    solution.getAns(num, 1, 3, 2);
    }
}
