package casestudy2;

import java.util.Scanner;

public class LuckyString 
{

	String a;
	char b;
	char temp;
	int j=1;
	Scanner sc = new Scanner(System.in);
	
	public void Display()
	{
		System.out.println("Enter the string");
		a= sc.next();
	}
	public void logic()
	{
		for(int i=0;i<=a.length()/3-1;i++)
		{	
				if(a.charAt(j)==a.charAt(i)||a.charAt(j+1)==a.charAt(i+1))
				{
					
					j=i+1;
					System.out.println("True");
					break;
				}
				else
				{
					System.out.println("false");
					break;
				}
			}
		
			
		
		
		}
	}

