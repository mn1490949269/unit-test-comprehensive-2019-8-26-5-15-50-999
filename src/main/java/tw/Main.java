package tw;

import tw.commands.GuessInputCommand;

/**
 * Created by jxzhong on 2017/5/16.
 */
public class Main {

    private static final int RUN_TIMES = 6;
    private static final char answer[] = {'1','2','3','4'};

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < RUN_TIMES; i++) {
            String input = new GuessInputCommand().input();
            GuessNumber  guessNumber = new GuessNumber();
            String inputMessage = guessNumber.isValid(input);
            if(inputMessage == "RightInput") {
            	String output  = guessNumber.guess(input, answer);
            	System.out.println(output);
            }else {
            	System.out.println(inputMessage);
            }
        }
    }
}
