package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.lti.entity.Calculator;

class ParamTest {

	@Disabled
	@ParameterizedTest
	@ValueSource(ints= {8,10,20,50,17})
	void testArrays(int arg) {
		System.out.println("arg : "+arg);
		Assertions.assertTrue(arg%2==0);
		
		
	}

	
	@ParameterizedTest
	@ValueSource(strings= {"Hello","Shubham","World"})
	void testStrings(String arg) {
		System.out.println("arg : "+arg);
		
		Assertions.assertNotNull(arg);
		
		
	}
	
	
	@Test
	public void testLambda()
	{
		Integer[] intAry= {2,3,7,5,10};
		
		List<Integer> numbers= Arrays.asList(intAry);
		
		Assertions.assertAll(
				() -> assertEquals(2,numbers.get(0)) ,				
				() -> assertEquals(3,numbers.get(1)) ,
				() -> assertEquals(7,numbers.get(2)) ,
				() -> assertEquals(5,numbers.get(3)) ,
				() -> assertEquals(10,numbers.get(4)) 				
				);	
	}
	
	
	
	@Test
	public void testException() {
		
		Assertions.assertThrows(NumberFormatException.class, ()->{
			Integer.parseInt("one");
		});
	}
	
	
	@Test
	  void testException1() {

		  Calculator c= new Calculator();
		  
		  final Exception e = assertThrows(ArithmeticException.class, () -> {
			  c.searchEmpId(0);
	    
	    });
	    Assertions.assertEquals("u enetered zero",e.getMessage());
	  }
	
	
}
