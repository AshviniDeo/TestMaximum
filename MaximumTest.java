package bridgeLabz;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaximumTest extends MaximumInt {

	@Test
	public void testCompare() {
		int max = MaximumInt.compare(100, 50, 5);
		Assert.assertEquals(100, max);
	}
	
	@Test
	public void testCompare1() {
		int max = MaximumInt.compare(50, 100, 5);
		Assert.assertEquals(100, max);
	}
	
	@Test
	public void testCompare2() {
		int max = MaximumInt.compare(50, 5, 100);
		Assert.assertEquals(100, max);
	}


}
