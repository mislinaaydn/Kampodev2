package kodlama;

public class StudentManager extends UserManager {
	public void completedCourse (Student student) {
		System.out.println(student.firstName+student.lastName+" Adlý öðrenci kursu tamamladý");
	}

}
