package kodlamaioHomework;

public class User {
	private int id;
	private String email;
	private String educationName;
	
	public User() {
		
	}
	
	public User(int id, String email, String educationName) {
		this.id = id;
		this.email = email;
		this.educationName = educationName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEducationName() {
		return educationName;
	}

	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}
	

}
