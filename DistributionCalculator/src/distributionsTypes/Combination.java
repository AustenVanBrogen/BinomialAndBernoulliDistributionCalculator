package distributionsTypes;

public class Combination {
	

	public static double factorial(int input)
	{
		System.out.println(input);
		//System.out.println(input < 0);
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
}
