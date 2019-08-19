package com.kangda;

import java.util.regex.Pattern;

public class CheckPhoneNumber {
    public static boolean isPhoneNumber(String phoneNumber) {
        boolean flag = false;
        if (phoneNumber.length() == 0) {
            return false;
        }
        //length==1
        String[] mobiles = phoneNumber.split(",");
        int len = mobiles.length;
        if (len == 1) {
            return Pattern.matches("^1\\d{10}$", phoneNumber);
        }
        return flag;
    }

    public static void main(String[] args) {
        String number ="15279612663";
        Boolean result =  CheckPhoneNumber.isPhoneNumber(number);
        System.out.println(result);
    }
}
