package example;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import tw.GuessNumber;

class GameNumberTest {
	@Test
	void should_input_1234_return_4A0B(){
		char answer[] = {'1','2','3','4'};
		String input = "1567";
		GuessNumber  guessNumber = new GuessNumber();
		String output  = guessNumber.guess(input, answer);
		
		assertEquals("1A0B", output);
				
	}
	
	@Test
	void should_input_1123_return_error_message(){
		String input = "1123";
		GuessNumber  guessNumber = new GuessNumber();
		String outputMessage  = guessNumber.isValid(input);
		
		assertEquals("Error Input!Please input again!!", outputMessage);
				
	}
	

}
