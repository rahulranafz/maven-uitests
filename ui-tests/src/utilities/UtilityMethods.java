package utilities;

import java.util.Random;

public class UtilityMethods {
	
	/**
	 * <h1>Change anything into number</h1>
	 * <p>
	 * This methods convert into integer number
	 * @author Gaurav
	 * @param str Any string value that contains special character and numeric 
	 * @return numberOnly it return only numeric value from the str
	 */
	public int getOnlyNumber(String str) {
		int numberOnly=0;
		try {
			numberOnly= Integer.parseInt(str.replaceAll("[^0-9]", ""));
			return numberOnly;
		} catch (NumberFormatException e) {
			return numberOnly;
		}
		
	}
	/**
	 * <h1>This method split string by any character</h1>
	 * <p>
	 * This method split string by character basis and return into array format
	 * @author Gaurav
	 * @param  str this one is string variable which one pass at the time of method calling
	 * @return it return string array after split
	 */
	public String[] getArrayAfterSplit(String str,String splitChar) {
		String[] parts = str.split(splitChar);
		return parts;
	}

	public static int getRandomInteger() {

		Random rand = new Random();

		int randomNum = rand.nextInt((999 - 0) + 1) + 0;

		return randomNum;
	}
}
