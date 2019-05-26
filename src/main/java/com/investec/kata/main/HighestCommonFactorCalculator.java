package com.investec.kata.main;

public class HighestCommonFactorCalculator {
	public int validateCalculateHCF(int[] numbers) throws Exception {
		int result;
		if(null == numbers || numbers.length <=1)
			throw new Exception("Enter atleast two integers");
		
		result = numbers[0];
		for(int i=1; i<numbers.length;i++) {
			result = calculateHCF(numbers[i],result);
		}
		
		if(result == 0)
			throw new Exception("HCF is undefined");
		
		if(result < 0)
			return -result;
		
		return result;
	}

	private int calculateHCF(int arrayElement, int result) {
		if(arrayElement == 0)
			return result;
		return calculateHCF(result%arrayElement,arrayElement);
	}

}
