package com.collection;

public class Person implements Comparable<Person>{
	private int id;
	private String pname;
	private double sal;
	public Person() {
		
	}
	public Person(int id, String pname, double sal) {
		super();
		this.id = id;
		this.pname = pname;
		this.sal = sal;
	}
	public int getId() {      //10,20,15,14,60,25
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return id +" "+pname +" "+ sal;
	}
	@Override
	public int compareTo(Person person) {
		//return this.getPname().compareTo(person.getPname());
		
		if(this.getSal()==person.getSal())
		return 0;
		else if(this.getId()>person.getId())
			return 1;
		else
			return -1;
	}

}
