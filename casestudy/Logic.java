package casestudy;

import java.util.Scanner;

public class Logic extends Match
{
	public Logic(int currentScore, float currentOver, int targetScore) 
	{
		super(currentScore, currentOver, targetScore);
		// TODO Auto-generated constructor stub
	}
	int a;
	Scanner sc= new Scanner(System.in);
	
	public void Display()
	{
		System.out.println("Enter the Cricket Format \n 1.ODI \n 2.T20 \n 3.Test");
		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		if(a<4)
		{
			this.Input();
		}
		else if(a>=4)
		{
			System.out.println("Invalid Format Type");
		}	
	}
	
	public void Input()
	{
		System.out.println("Enter the Current Score");
		setCurrentScore(sc.nextInt());
		System.out.println("Enter the Current Over");
		setCurrentOver(sc.nextFloat());
		System.out.println("Enter the Target Score");
		setTargetScore(sc.nextInt());
	
	
	switch(a)
	{
	case 1:
		
			ODIMatch odi = new ODIMatch(getCurrentScore(), getCurrentOver(), getTargetScore());
			odi.calculateRunrate();
			odi.calculateBalls();
			odi.display(odi.runrate(), odi.calculateBalls());
		break;
	case 2:
			
				T20Match t20 = new T20Match(getCurrentScore(), getCurrentOver(), getTargetScore());
				t20.calculateRunrate();
				t20.calculateBalls();
				t20.display(t20.runrate(),t20.calculateBalls());
			break;
		
	case 3:
				
					TestMatch testmatch = new TestMatch(getCurrentScore(), getCurrentOver(), getTargetScore());
					testmatch.calculateRunrate();
					testmatch.calculateBalls();
					testmatch.display(testmatch.runrate(),testmatch.calculateBalls());
			break;	
				
		default:
					
					System.out.println("Invalid Format Type");
					
			}
	
		}
	
		
	
		
	@Override
	public float calculateRunrate() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	void display(double reqRunRate, int balls) {
		// TODO Auto-generated method stub
		
	}
}
