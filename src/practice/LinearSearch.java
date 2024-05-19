package practice;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=sc.nextInt();
//		int arr[]=new int[n];
//		System.out.println("Enter the elements");
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println("Enter the target");
//		int Target=sc.nextInt();
		int arr[]= {12,45,73,92};
		int target=2;
		int result =LinearSearch(arr,target);
		//int result1=BinarySearch(arr,target);
		System.out.println(result);
		if(result!=0) 
		{
		System.out.println("Data is found in the index"+result);
		//System.out.println("Data is found in the index"+result1);
		}
		else 
		{
			System.out.println("Data is not found");}
		}
		
		

//	
//	public static int BinarySearch(int[] arr, int target) {
//		int left=0;
//		int right=arr.length-1;
//		
//		while(left<=right) {
//			int mid=(left+right)/2;
//			if(arr[mid]==target) 
//			{
//				return mid;
//			}
//			else if(arr[mid]<target)
//				left=mid+1;
//			else
//				left=mid-1;
//		}
//		return 0;
//	}




	public static int LinearSearch(int[] arr,int Target)
	{
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i] ==Target) 
				return i;
		}
		
		return 0;

	}
	
	}
