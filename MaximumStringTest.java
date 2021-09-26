package bridgeLabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MaximumStringTest extends MaximumString  {

	@Test
	void testCompare() {
		String max = MaximumString.compare("Apple", "Peach", "Banana");
		Assert.assertEquals("Banana", max);
	}
	
	@Test
	void testCompare1() {
		String max = MaximumString.compare("Apple", "Banana","Peach");
		Assert.assertEquals("Banana", max);
	}
	
	@Test
	void testCompare2() {
		String max = MaximumString.compare("Banana","Apple","Peach");
		Assert.assertEquals("Banana", max);
	}


}
