package com.kangda;

import java.util.Arrays;

public class StringStudy {
    public static void main(String[] args) {
        String s = "Kangdahh";
        String s1 = s.toUpperCase();//转为大写

        String s2 = s.toLowerCase();//转为小写

        char[] chars = s.toCharArray();
        int[]arr = {1,2,3,4,5};
        int i = Arrays.binarySearch(arr, 2);
        System.out.println(i);
        System.out.println(chars.length);
        System.out.println(s1);


    }


}
