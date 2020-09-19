package com.example.miniandroidchallenges.utils;

import java.util.Random;

/*
This is a simple if check for the pin code, the code var is a spoiler and shouldnt be used to discover what the pin is

Topic:
Local pin screens are generally implemented by using the Android Keystore to store the PIN its self but I'm lazy and instead just did this check.
For example of keystore usage with a PIN see this library: https://github.com/thealeksandr/PFLockScreen-Android

Note however that ultimately a locally stored PIN is always in some way brute-forceable.
For a PIN to not be brute-forceable it generally needs to be validated server side where rate limiting can be implemented in relation to an account (or some other similar vector).
 */

public class PinUtil {
    // Yes the code its self from static analysis is a spoiler, why not try brute-force the the code instead?
    private static Random rand = new Random();
    private static int randomPIN = rand.nextInt((99999 - 1) + 1) + 1;
    private static String PIN = String.valueOf(randomPIN);

    public static boolean pincodeCheck(String pincode) {
        return pincode.equals(PIN);
    }
}

