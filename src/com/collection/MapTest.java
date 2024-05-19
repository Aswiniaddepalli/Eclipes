package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> persons1=new ArrayList<>();
		persons1.add(new Person(104,"Taruni",7823));
		persons1.add(new Person(100,"Uma",5820));
		persons1.add(new Person(115,"Deepa",4500));
		persons1.add(new Person(90,"Aman",6800));
		persons1.add(new Person(101,"Bhanu",3800));
			HashMap<Integer,Person> map=new HashMap<>();
		//LinkedHashMap<Integer,Person> map=new LinkedHashMap<>();
		for(Person p:persons1) {
			map.put(p.getId(), p);  //inserting key-value to map
		}
		Set<Integer> keys=map.keySet(); //gets all keys from Map
		System.out.println(keys);
		for(int key:keys) {
			System.out.println("Given Key : "+key);
			System.out.println("Value Extracted:\n"+map.get(key));  //will return value from given key
			
		}
		Set<Map.Entry<Integer,Person>> entries =map.entrySet();   //will select the combination of key-value
		System.out.println("Reading data from Entry interface of map \n \n");
		for(Map.Entry<Integer,Person>entry: entries) {
			System.out.println(entry.getKey()+"\n"+entry.getValue());
		}
	}
	

}
