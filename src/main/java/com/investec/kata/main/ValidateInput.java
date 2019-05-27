package com.investec.kata.main;

import com.investec.kata.exceptions.MinimumTwoIntegersRequiredException;

public class ValidateInput {
	public boolean validateInputProvided(int[] inputArray) throws MinimumTwoIntegersRequiredException {
		if(null == inputArray || inputArray.length <=1)
			throw new MinimumTwoIntegersRequiredException("Enter atleast two integers");
		return true;
	}
}
