package task11;

public class Ques7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ques7a obj = new Ques7a();
		try {
			obj.agecategory(10);
		} catch (Ques7 e) {
			System.out.println(e);
		}

	}
	
	public void agecategory (int age) throws Ques7{
		if (age > 60) {
			System.out.println("Senior Citizen");
		}else if (age > 35) {
			System.out.println("Adult");
		}else if (age > 18) {
			System.out.println("New Adult");
		}else {
			throw new Ques7("InvalidAgeException");
		}
	}

}
