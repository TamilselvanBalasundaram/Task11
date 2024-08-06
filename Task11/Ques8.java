package task11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ques8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream obj = new FileInputStream("C:\\Tamil Guvi\\Github\\Project-B\\Project-Details\\Password.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		try {
			FileInputStream obj = new FileInputStream("C:\\Tamil Guvi\\Github\\Project-B\\Project-Details\\selenium.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
