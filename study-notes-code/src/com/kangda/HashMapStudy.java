package com.kangda;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapStudy {

    private static String string;

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"1");
//        map.put(1,"2");//如果key值相同，将会被覆盖
        map.put(null,"kk");//hashMap可以为空
        map.replace(1,"kangda2");//map键值都可以为空
        map.compute(1, (k, v) -> (v == null) ? "kangda" : v.concat("kangda2"));
        //当value不为空，在value后面追加
        map.computeIfPresent(1, (k, v) -> v.concat("hh"));
        //key存在则值不变，key不存在则添加value
        map.computeIfAbsent(5, v-> "k.hashCode()");
        Collection<String> values = map.values();  //将所有值变成一个集合
        for (String va: values) {
            System.out.println(va);
        }
        System.out.println(map.get(4));
        System.out.println(map.get(1));
    }
}
