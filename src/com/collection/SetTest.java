package com.collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.LinkedHashSet;


public class SetTest {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20,30,40,20,30,15,25);
		//HashSet<Integer> set =new HashSet<>(list);
		//LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
		TreeSet<Integer> set=new TreeSet<>(list);
		set.add(35);
		set.add(14);
		set.add(60);
		//System.out.println(set);
		set.remove(40);
		System.out.println(set.contains(40)?"Data missing":"Found your request");
		for(int a:set.descendingSet()) {
			System.out.println(set);
		}
	}

}
