package casestudy;


public abstract class Match 
{
	private int currentScore;
	private float currentOver;
	private int targetScore;
	public  int getCurrentScore() {
		return currentScore;
	}
	public Match(int currentScore, float currentOver, int targetScore) {
		super();
		this.currentScore = currentScore;
		this.currentOver = currentOver;
		this.targetScore = targetScore;
	}
	public void setCurrentScore(int currentScore) 
	{
		this.currentScore = currentScore;
	}
	public float getCurrentOver() 
	{
		return currentOver;
	}
	public void setCurrentOver(float currentOver) 
	{
		this.currentOver = currentOver;
	}
	public int getTargetScore() 
	{
		return targetScore;
	}
	public void setTargetScore(int targetScore) 
	{
		this.targetScore = targetScore;
	}
	
	public abstract float calculateRunrate();
	public abstract int calculateBalls();
	
	abstract void display(double reqRunRate,int balls);
//	{
//		System.out.println("Need 144 Runs in "+balls+" balls");
//		System.out.println("Required Run Rate -"+reqRunRate);
//	}
}


