package com.kangda;

import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
        map.put(1,"2");//如果key值相同，将会被覆盖
        map.put(null,"kk");//hashMap可以为空
        System.out.println(map.get(null));
    }
}
