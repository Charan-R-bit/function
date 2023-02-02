package Exceptions;

public class exception 
{

		      int num1, num2;
		      public void trycatch()
		      {
		      try {
		         //this block will contain statements that may raise exceptions
		         System.out.println("Try Block:: Start");
		         num1 = 0;
		         num2 = 25 / num1;
		         System.out.println(num2);
		         System.out.println("Try Block:: End");
		      }
		      catch (ArithmeticException e) { 
		         //handler for ArithmeticException
		         System.out.println("ArithmeticException :: Divide by Zero!!");
		      }
		      finally {
		    	  System.out.println("Finally");
		      }
		      System.out.println("Outside try-catch:: Rest of the code.");

}
}
