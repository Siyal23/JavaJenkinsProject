package com.jenkins.test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.jenkin.main.Main;

public class TestMain {	
	@Test
	public void testInputIsEven(){
		assertTrue(Main.checkIfInputIsAnEvenNumber(23)); // Assertion
	}
}

