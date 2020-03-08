package com.efftive;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        //date 是可变的，很容易违反约束条件
        Date start = new Date();
        Date end = new Date();
        Period period = new Period(start,end);
        end.setYear(100);
        System.out.println(period);
    }
}
