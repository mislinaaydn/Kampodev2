package kodlama;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Mislina", "Ayd�n", 1234, 134344324);

		StudentManager studentManager = new StudentManager();
		studentManager.completedCourse(student1);

		System.out.println("---------------------------------------");
		
		User user1 = new User(1, "Meryem", "Ayd�n", "meryem@meryem.com");
		User user2 = new User(1, "Ayhan", "Ayd�n", "meryem@ayhan.com");

		UserManager userManager = new UserManager();
		userManager.login(user1);
		userManager.register(user2);
		userManager.printUserInfo(user1);

		System.out.println("---------------------------------------");
		
		Instructor instructor = new Instructor(1, "Engin", "Demiro�");

		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.addCourse(instructor);
		�nstructorManager.deletedCourse(instructor);

	}

}
