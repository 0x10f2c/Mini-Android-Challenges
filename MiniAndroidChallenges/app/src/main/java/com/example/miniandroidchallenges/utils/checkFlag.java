package com.example.miniandroidchallenges.utils;

import android.util.Base64;

public class checkFlag {
    //Decoding this string is cheating!
    //Hooking with frida is cheating for this challenge as well; look for the broadcast ;)
    private static String  Flag = new String(Base64.decode("VGhlV2hvbGVXb3JsZENhblNlZU1l",Base64.DEFAULT));

    public static boolean flagCheck(String flag){
        return flag.equals(Flag);
    }

}
