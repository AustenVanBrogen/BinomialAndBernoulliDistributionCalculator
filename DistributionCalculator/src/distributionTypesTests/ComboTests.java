package distributionTypesTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import distributionsTypes.Combination;

class ComboTests {

	Combination combo = new Combination();
	@Test
	void test() {
		//fail("Not yet implemented");
		Combination combo = new Combination();
		assertEquals(10.0, combo.getCombination(5, 2));
	}
	
	@Test
	void test7and3()
	{
		Combination combo = new Combination();
		assertEquals(35.0, combo.getCombination(7, 3));
	}
	
	@Test
	void test4and2()
	{
		assertEquals(6.0, combo.getCombination(4, 2));
	}

}
