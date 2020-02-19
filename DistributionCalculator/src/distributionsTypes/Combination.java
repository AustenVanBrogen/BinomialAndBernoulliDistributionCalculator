package distributionsTypes;

public class Combination {
	
	int totalInSet;
	int numberChosen;
	double numerator;
	double denominator;
	double result;
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
		int i = Math.max(input, -input) - 1;
		for(; i > 1; i--)
		{
			product *= i;
		}
		return product;
	}
	
	public double getCombination(int totalInSet, int numberChosen)
	{
		this.totalInSet = totalInSet;
		this.numberChosen = numberChosen;
		result =numerator = denominator = 0;
		numerator = factorial(totalInSet);
		denominator = (factorial(totalInSet - numberChosen) * factorial(numberChosen));
		result = numerator / denominator;
		return result;
	}
	
	
}
