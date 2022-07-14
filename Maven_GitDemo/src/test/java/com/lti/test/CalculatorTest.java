package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculatorTest {
	
	Calculator c = new Calculator();
	
	@Disabled
	@Test
	void testAdd() {
		
		int r = c.add(20, 40);
		Assertions.assertEquals(60, r);
		//fail("Not yet implemented");
	}
	
	@Test
	void testAssertfail() {
		
		
		Assertions.assertEquals("Hello", "Hello");
		String str1 = null;
		String str2 = "abc";
		
		Assertions.assertNull(str1);
		
	}
	
	@Test
	public void testArrayList() {
		
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		Assertions.assertEquals(0, myList.size());
		
		myList.add(200);
		myList.add(400);

		
	}
	
	
	// for testing exception
	@Test
	public void testArrayList1() {
		
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		Assertions.assertEquals(0, myList.size());
		
		myList.add(200);
		myList.add(400);

		System.out.println(myList.size());
		
		Assertions.assertEquals(2, myList.size());
		
		
	}

	
	

}
