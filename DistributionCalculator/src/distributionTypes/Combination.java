package distributionTypes;

public class Combination {
	
	private int totalInSet;
	private int numberChosen;
	private double numerator;
	private double denominator;
	private double result;
	
	 public Combination()
	{

	}
	
	//Make this private
	public static double factorial(int input)
	{
		if(input == 1 || input == 0)
		{
			return 1;
		}
		double product = (double) input;
		//int i = Math.max(input, -input) - 1;
		int i = input;
		for(; i > 1; i--)
		{
			product *= i;
		}
		return product;
	}
	
	
	public double getCombination(int totalInSet, int numberChosen)
	{
		if(totalInSet < 0 || numberChosen < 0)
		{ throw new IllegalArgumentException(); }
		
		if(totalInSet == numberChosen)
		{ return 1.0; }
		
		this.totalInSet = totalInSet;
		this.numberChosen = numberChosen;
		
		//Swaps values if totalISet is less than numberChosen
		if (totalInSet < numberChosen)
		{ 
			int temp = totalInSet;
			totalInSet = numberChosen;
			numberChosen = temp;
		}
		
		result =numerator = denominator = 0;
		numerator = factorial(totalInSet);
		denominator = (factorial(totalInSet - numberChosen) * factorial(numberChosen));
		result = numerator / denominator;
		return result;
	}
	
	
}
