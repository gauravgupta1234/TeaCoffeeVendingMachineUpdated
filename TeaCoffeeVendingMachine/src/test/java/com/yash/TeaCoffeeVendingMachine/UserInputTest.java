package com.yash.TeaCoffeeVendingMachine;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserInputTest {

	@InjectMocks
	private UserInput userInput;

	@Test
	public void shouldPassUserInput() {

		String input = "5";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		Integer actual = userInput.userInputValue();
        Integer expected=5;
		assertEquals(actual, expected);

	}

}
