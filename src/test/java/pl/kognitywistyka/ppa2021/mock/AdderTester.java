package pl.kognitywistyka.ppa2021.mock;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AdderTester {
	
	@Test
	public void testAddSimple() {
		Adder adder = new Adder();
		adder.readFirst("4.24");
		adder.readSecond("5.12");
		Assert.assertEquals("Adding failed", new BigDecimal("9.36"), adder.add());
	}
	
}
