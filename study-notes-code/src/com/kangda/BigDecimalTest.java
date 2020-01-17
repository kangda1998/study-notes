package com.kangda;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("22");
        BigDecimal subtract = bigDecimal.subtract(null);
        System.out.println(subtract);
    }
}
