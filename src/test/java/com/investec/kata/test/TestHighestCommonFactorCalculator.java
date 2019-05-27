package com.investec.kata.test;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.investec.kata.main.HighestCommonFactorCalculator;
import com.investec.kata.main.ValidateInput;

@Test
public class TestHighestCommonFactorCalculator {
	
	private ValidateInput validateInput;
	private HighestCommonFactorCalculator highestCommonFactorCalculator;
	private int[] inputArray;
	
	@BeforeTest
	public void init() {
		validateInput = new ValidateInput();
		highestCommonFactorCalculator = new HighestCommonFactorCalculator();
	}
	
	@Test(expectedExceptions = Exception.class,expectedExceptionsMessageRegExp = "Enter atleast two integers")
	public void shouldThrowExceptionIfEmptyArrayIsPassed() throws Exception {
		inputArray = new int[0];
		validateInput.validateInputProvided(inputArray);
	}
	
	@Test(expectedExceptions = Exception.class,expectedExceptionsMessageRegExp = "Enter atleast two integers")
	public void shouldThrowExceptionIfSingleElementInArray() throws Exception {
		inputArray = new int[1];
		inputArray[0] = 1;
		validateInput.validateInputProvided(inputArray);
	}
	
	public void shouldReturnHighestCommonFactorAsIntegerForArrayOfIntegers() throws Exception {
		inputArray = new int[]{8,6,4,2};
		assertEquals(highestCommonFactorCalculator.calculate(inputArray), 2);
	}
	
	@Test(expectedExceptions = Exception.class,expectedExceptionsMessageRegExp = "Highest Common Factor is undefined for given input array")
	public void shouldThrowExceptionIfAllElementsAreZeroInIntegerArray() throws Exception {
		inputArray = new int[]{0,0,0};
		highestCommonFactorCalculator.calculate(inputArray);
	}
	
	public void shouldReturnPositiveHighestCommonFactorForNegativeElementsInIntegerArray() throws Exception {
		inputArray = new int[]{-8,-4};
		assertEquals(highestCommonFactorCalculator.calculate(inputArray), 4);
	}
	
	public void shouldReturnHighestCommonFactorAsPositiveIntegerForArrayOfIntegersWithAllPossibleValues() throws Exception{
		inputArray = new int[]{-8,2,0};
		assertEquals(highestCommonFactorCalculator.calculate(inputArray), 2);
	}
}
