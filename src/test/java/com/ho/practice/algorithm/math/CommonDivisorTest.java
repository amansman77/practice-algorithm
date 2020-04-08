package com.ho.practice.algorithm.math;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class CommonDivisorTest {

	@Test
	void testGetCommonDivisors() {
		CommonDivisor commonDivisor = new CommonDivisor(
				Arrays.asList(2, 4)
				);
		List<Integer> commonDivisors = commonDivisor.getCommonDivisors();
		// Common divisors : 1, 2
		assertEquals(2, commonDivisors.size());
		
		commonDivisor = new CommonDivisor(
				Arrays.asList(4, 2)
				);
		commonDivisors = commonDivisor.getCommonDivisors();
		// Common divisors : 1, 2
		assertEquals(2, commonDivisors.size());
		
		commonDivisor = new CommonDivisor(
				Arrays.asList(16, 32, 96)
				);
		commonDivisors = commonDivisor.getCommonDivisors();
		// Common divisors : 1, 2, 4, 8, 16
		assertEquals(5, commonDivisors.size());
		
		commonDivisor = new CommonDivisor(
				Arrays.asList(32, 96, 16)
				);
		commonDivisors = commonDivisor.getCommonDivisors();
		// Common divisors : 1, 2, 4, 8, 16
		assertEquals(5, commonDivisors.size());
	}

	@Test
	void testGetGreatestCommonDivisors() {
		CommonDivisor commonDivisor = new CommonDivisor(
				Arrays.asList(2, 4)
				);
		int greatestCommonDivisor = commonDivisor.getGreatestCommonDivisor();
		assertEquals(2, greatestCommonDivisor);
		
		commonDivisor = new CommonDivisor(
				Arrays.asList(4, 2)
				);
		greatestCommonDivisor = commonDivisor.getGreatestCommonDivisor();
		assertEquals(2, greatestCommonDivisor);
		
		commonDivisor = new CommonDivisor(
				Arrays.asList(16, 32, 96)
				);
		greatestCommonDivisor = commonDivisor.getGreatestCommonDivisor();
		assertEquals(16, greatestCommonDivisor);
		
		commonDivisor = new CommonDivisor(
				Arrays.asList(32, 96, 16)
				);
		greatestCommonDivisor = commonDivisor.getGreatestCommonDivisor();
		assertEquals(16, greatestCommonDivisor);
	}
	
}
