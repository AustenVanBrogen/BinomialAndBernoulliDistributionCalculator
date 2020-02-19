package distributionsTypes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComboTests {

	@Test
	void test() {
		//fail("Not yet implemented");
		Combination combo = new Combination();
		assertEquals(10.0, combo.getCombination(5, 2));
	}

}
