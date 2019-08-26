package tw;

import java.sql.Array;

public class GuessNumber{
	public static final String RightInput = "RightInput";
 	public String guess(String input,char answer[]) {
		String output="";
		int rightCount = 0;
		int positionRightCount = 0;
		
		char inputArray[] = input.toCharArray();
		for(int i=0;i<inputArray.length;i++) {
			for(int j=0;j<answer.length;j++) {
				if(inputArray[i] == answer[j]) {
					if(i == j) {
						positionRightCount++;
					}
					rightCount++;
					break;
				}
			}
		}
		output = String.valueOf(positionRightCount)+'A'+String.valueOf(rightCount-positionRightCount)+'B';
		return output;
	}
	
	public String isValid(String input) {
		String rtnString = RightInput;
		char inputArray[] = input.toCharArray();
		char temp[] = inputArray;
		boolean flag = true;
		for(int i=0;i<temp.length;i++) {
			for(int j=i+1;j<inputArray.length;j++) {
				if(temp[i] == inputArray[j]) {
					flag =false;
					break;
				}	
			}
			if(flag == false) {
				break;
			}
		}
		if(inputArray.length != 4 || flag == false) {
			rtnString = "Error Input!Please input again!!";
		}
		return rtnString;
		
	}
	

}
