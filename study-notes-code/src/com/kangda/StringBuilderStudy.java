package com.kangda;

public class StringBuilderStudy {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("123456");
        stringBuilder.replace(0,2,"343400");
        stringBuilder.delete(0,1); //StringBuilder的方法都是左闭右开。
        //会将要注入的字符串完全替代掉想覆盖的区域
        String s = new String(stringBuilder);
        System.out.println(stringBuilder);
    }
}
