package bridgeLabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class MaximumFloatTest extends MaximumFloat{

	@Test
	void test() {
		float max = MaximumFloat.compare(10.5F, 4.2F, 5.5F);
		Assert.assertEquals(10.5F, max, max);
	}
	

	@Test
	void test1() {
		float max = MaximumFloat.compare(4.2F,10.5F, 5.5F);
		Assert.assertEquals(10.5F, max, max);
	}
	

	@Test
	void test2() {
		float max = MaximumFloat.compare(5.5F, 4.2F, 10.5F);
		Assert.assertEquals(10.5F, max, max);
	}

}
