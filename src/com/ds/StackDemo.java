package com.ds;
import java.util.Scanner;
class MyStack
{
   int[] a;
   int top;
   MyStack()
   {	
	a=new int[100];
	top=-1;
   }
  
  void push(int x)
  {	
	if(top==a.length-1)
	  System.out.println("overflow");
	else
	 a[++top]=x;
   }
   
   int pop()
   {
     if(top==-1)
		{System.out.println("underflow");
	     return -1;
		}
	 else
	   return(a[top--]);
	}
	
	void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(a[i]+" ");
		System.out.println();	
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	int peek()
	{
		if(top==-1)
			return -1;
		return (a[top]);
	}	
}
public class StackDemo
{
	public static void main(String args[])
	{		
		MyStack s=new MyStack();
		Scanner in= new Scanner(System.in);
		
		 do
			{System.out.println("\n******** MENU *******");
			 System.out.println("\n1.PUSH");
			 System.out.println("\n2.POP");
			 System.out.println("\n3.PEEK");
			 System.out.println("\n4 IS EMPTY");
			 System.out.println("\n5. Display");
			 System.out.println("\n6.EXIT");
			 System.out.println("\n enter ur choice : ");
			 switch(in.nextInt())
				{
				 case 1:
					 System.out.println("\nenter the value ");
					 s.push(in.nextInt());
					 break;
				 case 2:
					System.out.println("\n popped element : "+ s.pop());
					 break;
				
				case 3:
					System.out.println("\n top element : "+ s.peek());
					 break;
				 case 4: System.out.println("\n is empty : "+ s.isEmpty());
						 break;
				 case 5:
					     s.display();
						 break;
				 default: System.out.println("\n Wrong Choice!");
						  break;
				}
			 System.out.println("\n do u want to cont press 1, press 6 to exit... ");
			}while(in.nextInt()!=6);
	}
}