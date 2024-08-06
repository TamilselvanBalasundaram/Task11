package task11;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "Tamilselvan";
		String password = "tamil@123";
		String correctpassword;
		
		Scanner obj = new Scanner(System.in);
		correctpassword = obj.nextLine();
		
		try {
			if(password.equals(correctpassword)) {
				System.out.println("Login Successful");
			}else {
				System.out.println("Error - Incorrect Password");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}

