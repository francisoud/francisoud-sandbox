package com.company.project.fake;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FakeServiceTest {

	@Test
	public void testGetMessage() {
		FakeService s = new FakeService();
		assertEquals("Hello world!", s.getMessage());
	}
}
