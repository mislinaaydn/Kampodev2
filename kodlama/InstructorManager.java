package kodlama;

public class InstructorManager extends UserManager {

	public void addCourse (Instructor �nstructor) {
		System.out.println(�nstructor.firstName+�nstructor.lastName+" Adl� e�itmen kurs ekledi");
	}
	public void deletedCourse (Instructor �nstructor) {
		System.out.println(�nstructor.firstName+�nstructor.lastName+" Adl� e�itmen kursu sildi");
	}
	


}
