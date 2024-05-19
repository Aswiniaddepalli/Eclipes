package com.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TaskDay1 {
	public static void main(String[] args) {
		//Task 1
		List<Integer> list=Arrays.asList(67,23,78,23,99,12,67,75,23);
		List<Integer>distinct=list.stream().distinct().collect(Collectors.toList());
		distinct.forEach(n->System.out.println(n));
		
		Integer sum = distinct.stream()
				.reduce(0, (a, b) -> a + b);
		System.out.println("Total sum of the list : "+sum);
		
		//Task2
		List<String> names=Arrays.asList("Aswini","Sravani","Pravallika","Sambhavi","Aswini");
		List<String> contains=names.stream().sorted().filter(s->s.contains("w")).collect(Collectors.toList());
		contains.forEach(n->System.out.println(n+" "));
		System.out.println();
		Set<String> sort=names.stream().sorted().collect(Collectors.toSet());
		sort.forEach(n->System.out.println( n));
	}

}
