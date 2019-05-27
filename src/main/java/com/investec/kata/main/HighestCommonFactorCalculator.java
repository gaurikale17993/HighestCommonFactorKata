package com.investec.kata.main;

public class HighestCommonFactorCalculator {
	public int calculate(int[] inputArray) throws Exception {
		ValidateInput validateInput = new ValidateInput();
		validateInput.validateInputProvided(inputArray);
		
		int result = inputArray[0];
		for(int i=1; i<inputArray.length;i++) {
			result = highestCommonFactorAmongstTwoElements(inputArray[i],result);
		}
		if(result == 0)
			throw new Exception("Highest Common Factor is undefined for given input array");
		
		if(result < 0)
			return -result;
		
		return result;
	}

	private int highestCommonFactorAmongstTwoElements(int inputArrayElement, int result) {
		if(inputArrayElement == 0)
			return result;
		return highestCommonFactorAmongstTwoElements(result%inputArrayElement,inputArrayElement);
	}
}
