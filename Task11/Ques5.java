package task11;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    System.out.println("*****ArrayIndexOutOfBoundsException*****");
		int num[]  = new int[5];
        try {
            System.out.println(num[6]);
        } catch (Exception e) {
            System.out.println(e);
        }
		
		System.out.println();
		System.out.println("*****StringIndexOutOfBoundsException*****");
        
        String s = "Selenium";
        
        try {
			System.out.println(s.charAt(8));
		} catch (Exception e) {
			System.out.println(e);
		}
        
        
	}

}
