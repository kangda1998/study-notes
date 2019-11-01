package com.kangda;

import java.util.Arrays;
import java.util.Comparator;

public class LamdaStudy {


    public static void main(String[] args) {
        Integer[] a = {0,1,4,8,5,9};
        Comparator<Integer> comparator = (b,c)->c.compareTo(b);
        Arrays.sort(a,comparator);


    }
}
