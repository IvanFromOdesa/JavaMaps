package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	MyMap map = new MyHashMap();
    map.put("1", "Map1");
    map.put("2", "Map2");
    map.put("3", "Map3");
    map.put("1", "Map4");
    System.out.println(map.containsKey("200"));
    System.out.println(map.containsKey("2"));
    System.out.println(map);
    System.out.println(map.get("1"));
    map.remove("3");
    System.out.println(map);
    }
}
