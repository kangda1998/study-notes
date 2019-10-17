package com.kangda;

public class StringStudy {
    public static void main(String[] args) {
        String s = "Kangdahh";
        String s1 = s.toUpperCase();//转为大写

        String s2 = s.toLowerCase();//转为小写

        char[] chars = s.toCharArray();

        System.out.println(chars.length);
        System.out.println(s1);

    }
}
