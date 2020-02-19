package distributionTypesTests;

import distributionsTypes.Combination;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double answer = Combination.factorial(5);
		System.out.println(answer);
		
		answer = Combination.factorial(-4);
		System.out.println(answer);
	}

}
