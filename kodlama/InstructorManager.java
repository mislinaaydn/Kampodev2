package kodlama;

public class InstructorManager extends UserManager {

	public void addCourse (Instructor ýnstructor) {
		System.out.println(ýnstructor.firstName+ýnstructor.lastName+" Adlý eðitmen kurs ekledi");
	}
	public void deletedCourse (Instructor ýnstructor) {
		System.out.println(ýnstructor.firstName+ýnstructor.lastName+" Adlý eðitmen kursu sildi");
	}
	


}
