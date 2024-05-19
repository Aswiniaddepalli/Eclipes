package com.exception;

public class ExpTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String zones[]= {"north","south","east","west","n-e","s-w"};
			for(String zone:zones) {
				if(!zone.equals(zones))
				System.out.println(zone);
				else if(zone.equals("n-e"))
					throw new RuntimeException("n-e zone is not permitted");
			}
		}
			catch(Exception e){
				System.out.println("Aborted"+e.getMessage());
			}
			
		

	}

}
