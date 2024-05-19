package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StreamsDemo> list=new ArrayList<StreamsDemo>();
		list.add(new StreamsDemo("laptop",200,1));
		list.add(new StreamsDemo("Aswini",750,1));
		list.add(new StreamsDemo("pravali",9765,8));
		list.stream().forEach(System.out::println);
		list.forEach(n->System.out.println(n));
		 List<String> names = Arrays.asList("John", "Jane", "Alice");  
	        names.stream()  
	                .forEach(System.out::println); 
		}
}