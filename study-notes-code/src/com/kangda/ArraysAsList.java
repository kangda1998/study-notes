package com.kangda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        String[] a = {"1","2","h"};
       int[] i ={2,3,4};
    long b = 2L;
    long c = b-1L;
        System.out.println(c);
//        ArrayList arrayList = new ArrayList(Arrays.asList(a));
        String aa = "345";
        Integer integer = Integer.valueOf(aa);
        System.out.println(integer+4);
        List list = Arrays.asList(i); //返回的是ArrayList的一个内部类，要变成ArrayList需要像21行那样
        System.out.println(list.size()); //当为基本数据类型size=1，而传入包装类，Arrays.asList()为3

    }
}
