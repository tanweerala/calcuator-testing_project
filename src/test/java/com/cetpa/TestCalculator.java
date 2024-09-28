package com.cetpa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator 
{
	Calculator cal=new Calculator();
	
	@Test
	public void testAdd()
	{
		int actualResult=cal.add(20,40);
		int expectedResult=60;
		Assertions.assertEquals(expectedResult,actualResult);
	}
}
