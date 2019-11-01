package com.kangda;


public class SplitStudy {
    public static void main(String[] args) {
        String name = "kangda-kk";
        String[] names = name.split("\\-");//names[0]=kangda,name[1]=kk
        System.out.println(names[0]+names[1]);
        int num = (4+4)>>1;
        System.out.println(num);


    }
}
