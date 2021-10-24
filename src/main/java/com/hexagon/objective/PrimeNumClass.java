package com.hexagon.objective;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * Hello world!
 *
 */
public class PrimeNumClass {
	static List<Integer> listPrime = new ArrayList<Integer>();
	static List<Integer> listNonPrime = new ArrayList<Integer>();

	public PrimeNumberBean generatePrimeNum(PrimeNumberBean bean) {
		
		//check if String is int only
		if(bean.getInputPrime().matches("[0-9]+")) {
			int parseInt = Integer.parseInt(bean.getInputPrime());
			bean.setFinalOutput(printPrime(parseInt)); 
			
		} else {
			bean.setFinalOutput("Please input Integer only.");
			
		}
		
		
		// run Junit test
		Result result = JUnitCore.runClasses(PrimeNumClass.class);
		for (Failure failure : result.getFailures()) {
			System.out.println("failure is: " + failure.toString());
		}

		System.out.println("All numbers are working: " + result.wasSuccessful());
		
		
		return bean;
	}

	public String printPrime(int input) {

		String print = "";
		for (int index = 0; index <= input; index++) {

			if (isPrime(index)) {
				// insert the list of Prime
				listPrime.add(index);
				print = print + index + ", ";
				System.out.print(index + ", ");
			} else {
				// insert the list of nonPrime
				listNonPrime.add(index);
			}
		} // end of for loop
		
		return print;

	}

	static boolean isPrime(int n) {
		// Corner cases
		if (n <= 1)
			return false;
		if (n <= 3)
			return true;

		// This is checked so that we can skip
		// middle five numbers in below loop
		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6)
			if (n % i == 0 || n % (i + 2) == 0)
				return false;

		return true;
	}

	@Test
	public void testPrimeNumberChecker() {

		// test if the list are correct
		for (int a : listPrime) {
			assertTrue(isPrime(a));
		}

		for (int a : listNonPrime) {
			assertFalse(isPrime(a));
		}
	}

}
