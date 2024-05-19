package practice;

public class Task1 {
	  public static void test(String str)    {

          if (str == null | str.length() == 0)     {

                 System.out.println("String is empty");

           }

           else     {

                  System.out.println("String is not empty");

           }

  }
	public static void main(String[] args) {
		 Task1 s=new Task1();
		test(null);
	}

}
