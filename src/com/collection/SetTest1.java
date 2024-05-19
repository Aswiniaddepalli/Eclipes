package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class SetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> persons=new TreeSet<>();
		persons.add(new Person(104,"Taruni",7823));
		persons.add(new Person(100,"Uma",5820));
		persons.add(new Person(115,"Deepa",4500));
		persons.add(new Person(90,"Aman",6800));
		persons.add(new Person(101,"Bhanu",3800));
		for(Person p:persons) {
			System.out.println(p);
		}
		PersonComparator compare= new PersonComparator();
		
		System.out.println(compare.compare(new Person(115,"Deepa",4500), new Person(90,"Aman",6800)));
		ArrayList<Person> persons1=new ArrayList<>();
		persons1.add(new Person(104,"Taruni",7823));
		persons1.add(new Person(100,"Uma",5820));
		persons1.add(new Person(115,"Deepa",4500));
		persons1.add(new Person(90,"Aman",6800));
		persons1.add(new Person(101,"Bhanu",3800));
		Collections.sort(persons1,compare);
		System.out.println(persons1);
	}

}
class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		// TODO Auto-generated method stub
		return (int) (p1.getSal()-p2.getSal());
	}
	
}