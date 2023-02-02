package casestudy;

public class ODIMatch extends Match
{
	public ODIMatch(int currentScore, float currentOver, int targetScore) {
		super(currentScore, currentOver, targetScore);
		// TODO Auto-generated constructor stub
	}
	float ballover =50;
	int ball = 6;
	double run_required;
	float balls;
	double rate;
	int currentballs;
	
	@Override
	public
	float calculateRunrate() 
	{
		float a = getTargetScore();
		float b = getCurrentScore();
		
		return a-b;		
	}

	@Override
	public
	int calculateBalls() {
		balls= getCurrentOver();
		currentballs= (int) (ballover-balls);

		return currentballs*ball;
	}

	
	public double runrate()
	{
		double rmo =ballover-balls;
		float runrate =calculateRunrate(); 
		 
		 return runrate/rmo;
		 
	}
	@Override
	public
	void display(double reqRunRate,int balls) 
	{
		System.out.println("Need "+calculateRunrate()+" in "+balls+" balls");
		System.out.println("Required Run Rate -" +runrate());
	}
}

