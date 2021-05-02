package com.hamma.app.rest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HttpClientTest {
	@AfterEach
	void tearDown() {
		// log.info
		System.out.println("@AfterEach - executed after each test method.");
	}

	@AfterAll
	static void done() {
		System.out.println("@AfterAll - executed after all test methods.");
	}

	@DisplayName("Single test successful")
	@Test
	void testSingleSuccessTest() {
		System.out.println("Success");
	}

	@Test
	@Disabled("Not implemented yet")
	void testShowSomething() {
	}

	@Test
	void lambdaExpressions() {
		assertTrue(Stream.of(1, 2, 3).distinct().mapToInt(i -> i).sum() > 5, () -> "Sum should be greater than 5");
	}

	@Test
	void groupAssertions() {
		int[] numbers = { 0, 1, 2, 3, 4 };
		assertAll("numbers", 
				() -> assertNotEquals(numbers[0], 1), 
				() -> assertEquals(numbers[3], 3),
				() -> assertEquals(numbers[4], 4));
	}

}