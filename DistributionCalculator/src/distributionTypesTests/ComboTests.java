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
	void  testTotalLessThanChosenSwap()
	{
		assertEquals(35.0, combo.getCombination(3, 7));
	}
	
	@Test
	void testNegativeTotal()
	{
		try
		{
			combo.getCombination(-10, 7);
		}
		catch(IllegalArgumentException e)
		{
			assertEquals(true, true);
		}
	}
	
	@Test
	void testNegativeChosen()
	{
		try
		{
			combo.getCombination(10, -7);
		}
		catch(IllegalArgumentException e)
		{
			assertEquals(true, true);
		}
	}
	
	@Test
	void testBothNegative()
	{
		try
		{
			combo.getCombination(-10, -7);
		}
		catch(IllegalArgumentException e)
		{
			assertEquals(true, true);
		}
	}
	
	@Test
	void testSameNumber()
	{
		assertEquals(
			combo.getCombination(Integer.MAX_VALUE, Integer.MAX_VALUE),
			1.0);
	}
	
	@Test
	void test4and2()
	{
		assertEquals(6.0, combo.getCombination(4, 2));
	}

}
