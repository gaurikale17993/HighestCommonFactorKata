package com.investec.kata.main;

public class ValidateInput {
	public boolean validateInputProvided(int[] inputArray) throws Exception {
		if(null == inputArray || inputArray.length <=1)
			throw new Exception("Enter atleast two integers");
		return true;
	}
}
