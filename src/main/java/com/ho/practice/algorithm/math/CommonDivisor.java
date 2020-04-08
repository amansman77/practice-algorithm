package com.ho.practice.algorithm.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonDivisor {
	
	private List<Integer> numbers;
	
	public CommonDivisor(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	/**
	 * 시간복잡도 : O(n^2) - Quadratic time
	 * @return
	 */
	public int getGreatestCommonDivisor() {
		List<Integer> commonDivisors = getCommonDivisors();
		Collections.sort(commonDivisors);
		return commonDivisors.get(commonDivisors.size()-1);
	}
	
	/**
	 * 시간복잡도 : O(n^2) - Quadratic time
	 * @return
	 */
	public List<Integer> getCommonDivisors() {
		Set<Integer> commonDivisor = new HashSet<>();
		
		for (int i = 0; i < numbers.size(); i++) {
			Integer number = numbers.get(i);
			Set<Integer> divisors = getDivisor(number);
			if (commonDivisor.size() < 1) {
				commonDivisor.addAll(divisors);
			} else {
				commonDivisor.retainAll(divisors);
			}
		}
		return new ArrayList<>(commonDivisor);
	}

	/**
	 * 시간복잡도 : O(n) - Linear time
	 * @param number
	 * @return
	 */
	private Set<Integer> getDivisor(Integer number) {
		Set<Integer> divisor = new HashSet<>();
		divisor.add(1);
		
		for (int i = 1; i < number; i++) {
			int value = i+1;
			if ((number % value) == 0) {
				divisor.add(value);
			}
		}
		
		return divisor;
	}
	
}
