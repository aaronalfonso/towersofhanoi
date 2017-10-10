package com.company;

/**
 * Created by aa700 on 10/10/17.
 */
public class perfectRandom {
    public int perfectRandom() {
        double random = Math.random() * (Math.random() * 100);
        int randomInt = (int)random;
        return (int)Math.pow(randomInt, 2);
    }
}
