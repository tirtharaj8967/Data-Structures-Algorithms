package com.learn.Basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Basics {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(101, "Tirtha");
		map.put(25, "Raj");
		map.put(37, "Das");
		map.put(0, null);
		System.out.println(map.get(37));
		System.out.println(map.containsKey(25));
		System.out.println(map.containsValue("Das"));
		
		Set<Integer> keys = map.keySet();
		for(int key: keys) {
			System.out.println(map.get(key));
		}
		
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		

	}

}
