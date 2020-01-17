package com.kangda.effective;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class HashMapMethodTest {
    public static void main(String[] args) {
        Object object = new Object();
        Object ob = Objects.requireNonNull(object, "ob");
        System.out.println(ob);


        HashMap<String,List<Integer>> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            list.add(i);
        }
        map.put("list",list);
        map.forEach((s, integers) -> System.out.println(integers));
        list.add(10); //map会接受到该值
        map.forEach((s, integers) -> System.out.println(integers));


    }
}
