package firstProject;

import java.util.Scanner;
public class First 
{		
	String s;
	public static void main(String[] args)
	{
		First f = new First();
		f.display();
		f.logic();
				
	}
	public  void display()
	{
		System.out.println("Enter your employee id");
		Scanner sc =new Scanner(System.in);
		s = sc.next();
		sc.close();
	}
	public void logic()
	{	
			if(s.equals("4"))
			{
				System.out.println("welcome to capgemini");
				
			}
			else{

				System.out.println( "Invalid cg user");
			}
	
		
	}
	
}
	

