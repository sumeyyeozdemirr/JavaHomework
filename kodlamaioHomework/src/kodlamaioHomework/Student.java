package kodlamaioHomework;

public class Student extends User{
	
	String studentName;

	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
