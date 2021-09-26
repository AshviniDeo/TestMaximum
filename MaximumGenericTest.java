package bridgeLabz;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MaximumGenericTest  extends MaximumGeneric{

	@Test
	void testCompare() {
		String max = MaximumGeneric.compare("Apple","Banana","Peach");
		Assert.assertEquals("Banana", max);
	}

	@Test
	void testCompare1() {
		int max = (int) MaximumGeneric.compare(100,50,5);
		Assert.assertEquals(100, max);
	}
	
	@Test
	void testCompare2() {
		float max = (float)MaximumGeneric.compare(10.5F,5.5F,4.2F);
		Assert.assertEquals(10.5, max, max);
		
	}

}
