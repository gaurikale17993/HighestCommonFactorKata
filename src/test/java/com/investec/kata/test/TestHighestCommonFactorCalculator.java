package com.investec.kata.test;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.investec.kata.main.HighestCommonFactorCalculator;

@Test
public class TestHighestCommonFactorCalculator {
	private HighestCommonFactorCalculator hcfCalculator;
	private int[] numbers;
	
	@BeforeTest
	public void init() {
		hcfCalculator = new HighestCommonFactorCalculator();
	}
	
	@Test(expectedExceptions = Exception.class,expectedExceptionsMessageRegExp = "Enter atleast two integers")
	public void emptyArrayThrowsException() throws Exception {
		numbers = new int[0];
		hcfCalculator.validateCalculateHCF(numbers);
	}
	
	@Test(expectedExceptions = Exception.class,expectedExceptionsMessageRegExp = "Enter atleast two integers")
	public void singleElementArrayThrowsException() throws Exception {
		numbers = new int[1];
		numbers[0] = 1;
		hcfCalculator.validateCalculateHCF(numbers);
	}
	
	public void hcfOfIntegerArray() throws Exception {
		numbers = new int[]{8,6,4,2};
		assertEquals(hcfCalculator.validateCalculateHCF(numbers), 2);
	}
	
	@Test(expectedExceptions = Exception.class,expectedExceptionsMessageRegExp = "HCF is undefined")
	public void allZerosInIntegerArrayThrowsException() throws Exception {
		numbers = new int[]{0,0,0};
		hcfCalculator.validateCalculateHCF(numbers);
	}
	
	public void negativeIntegerArrayHCF() throws Exception {
		numbers = new int[]{-8,-4};
		assertEquals(hcfCalculator.validateCalculateHCF(numbers), 4);
	}
}
