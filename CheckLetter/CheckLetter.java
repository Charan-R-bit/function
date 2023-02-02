package CheckLetter;

import java.util.Scanner;

public class CheckLetter 
{
	
	String Page;
	char s;
	
public void Disp() 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Whole data from database");
	Page = sc.next();
	System.out.println("Enter the Charecter from the database");
	s = sc.next().charAt(0);
	sc.close();
	
}
public int logic()
{
	int count=0;
	for(int i=0;i<=Page.length()-1;i++)
	{
		if(Page.charAt(i)==s)
		count++;
	}
	return count;
}
	
	public static void main(String[] args) 
	{
		CheckLetter cl = new CheckLetter();
		cl.Disp();
		cl.logic();
		System.out.println(cl.logic());
		
	
		
}
	
}
