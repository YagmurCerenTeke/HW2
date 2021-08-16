package homework2;

public class Main {

	public static void main(String[] args) {
		
		InstructorUser instructor1 = new InstructorUser();
		instructor1.userId = 1234;
		
		StudentUser student1 = new StudentUser();
		student1.userId = 9876;
		
		
		UserManager userManager = new UserManager();
		userManager.addUser(student1);
		userManager.addUser(instructor1);
	}

}
