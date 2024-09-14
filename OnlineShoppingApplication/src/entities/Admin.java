package entities;

public class Admin extends User {

	////Usage of default constructor so that user can inherit the parameters here
	
	public Admin(int userId, String username, String email) {
		super(userId, username, email);
	}
	

}
