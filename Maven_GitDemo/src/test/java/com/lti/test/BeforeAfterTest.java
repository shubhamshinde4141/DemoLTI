package com.lti.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class BeforeAfterTest {
	int sum;
	Calculator c = new Calculator();
	
	@BeforeAll
	public static void testDatabase() {
		
		System.out.println("Database Conn is up");
	}
	
	@BeforeEach
	public void testStartUp() {
		sum=0;
		System.out.println("Sum=0");
	}
	
	@Test
	void testAdd() {
		
		 sum = c.add(20, 40);
		Assertions.assertEquals(60, sum,"Checked Add Method");
		
	}
	@Test
	void testAdd1() {
		
		sum = c.add(20, 30);
		Assertions.assertEquals(50, sum,"Checked Add1 Method");
		
	}
	
	@AfterEach
	public void testShutUp() {
		sum=1;
		System.out.println("Sum=1");
	}
	
	
	@AfterAll
	public static void testShutdown() {
		
		System.out.println("Database Shutdown");
	}
	

}
