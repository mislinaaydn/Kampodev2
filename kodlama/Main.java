package kodlama;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Mislina", "Aydın", 1234, 134344324);

		StudentManager studentManager = new StudentManager();
		studentManager.completedCourse(student1);

		System.out.println("---------------------------------------");
		
		User user1 = new User(1, "Meryem", "Aydın", "meryem@meryem.com");
		User user2 = new User(1, "Ayhan", "Aydın", "meryem@ayhan.com");

		UserManager userManager = new UserManager();
		userManager.login(user1);
		userManager.register(user2);
		userManager.printUserInfo(user1);

		System.out.println("---------------------------------------");
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ");

		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.addCourse(instructor);
		ınstructorManager.deletedCourse(instructor);

	}

}
