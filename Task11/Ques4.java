package task11;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		
		Scanner input = new Scanner(System.in);

		try {
			System.out.println("Enter the first integer - ");
			a = input.nextInt();
			
			System.out.println("Enter the second integer - ");
			b = input.nextInt();
			
			int c = a/b;
			System.out.println("Result - " + c);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
