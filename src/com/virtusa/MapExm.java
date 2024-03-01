package com.virtusa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="Rahesh";
		char y[]=x.toCharArray();
		int size=y.length;
		
		Map<Character, Integer> map= new HashMap<>();
		int i=0;
		while(i != size) {
			
			if(map.containsKey(y[i]) ==false) {
				map.put(y[i], 1);
			}
			else {
				int oldval=map.get(y[i]);
				int newval=oldval+1;
				map.put(y[i], newval);
			}
			i++;
		}
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		//System.out.println("Map data count by alphabetically  is  :"+hmap);
		
		for(Map.Entry<Character, Integer> data:hmap) {
			System.out.print(data.getKey());
			System.out.print("");
			System.out.println(data.getValue());
		}

	}

}
