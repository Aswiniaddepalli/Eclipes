package com.advancedjava;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Impliment {

	
	public static void main(String[] args) {
//		Subtraction mul=(a,b)->{
//			System.out.println(a-b);
//		};
////		mul.Sub(10,20);
		Subtraction add=(a,b)->{
		return(a+b);
		};
		System.out.println(add.addition(10,2));
		//pridictionInterface
		Predicate<Integer> isOdd = num -> num % 2 != 0;
		boolean result = isOdd.test(8); // true
		System.out.println("It is the pridiction "+result);
		
		//Supplier Interface--used for to get random  values without accepting any input values
		Supplier<Integer> num=()->(int )(Math.random()*100);
		int count=3;
		while(count-- >0) {
		System.out.println("the random value : "+num.get());}
		
		//consumer
		
		
		}
	
	
}
