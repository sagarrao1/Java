package com.learning.JunitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import  static org.mockito.Mockito.*;

public class TestCalculator1 {
	
	Calculator c;
	
	@Mock
	CalculatorService service;
	
	@Rule public MockitoRule rule= MockitoJUnit.rule();
	

	@Before
	public void setUp() throws Exception {
		c=new Calculator(service);
	}

	@After
	public void tearDown() throws Exception {
		c=null;
	}

	@Test
	public void testPerform() {
		
		when(service.add(2, 3)).thenReturn(5);  //mockito
		
		assertEquals(10, c.perform(2, 3));
		verify(service).add(2, 3);
	}

}
 