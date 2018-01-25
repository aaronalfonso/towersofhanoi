package com.company;

/**
 * Created by aa700 on 1/20/17.
 */
public class solution {
    
    public static int sol = 1;
    
    public static void getAns(int discs, int lTower, int mTower, int rTower){
        if(discs==1){
            System.out.println((lTower++) + ": Move a disc from the tower " + lTower + " to " + rTower);
        } else {
            getAns(discs - 1, lTower, mTower, rTower);
            getAns(1, lTower, rTower, mTower);
            getAns(discs - 1, mTower, rTower, lTower);
        }
    }
}
