package entities;
//Base Class
public abstract class User {
	
	private int UserId;
	private String Username;
	private String Email;
	
	//Parametrised Constructor
	
	public User(int userId, String username, String email) {
		UserId = userId;
		Username = username;
		Email = email;
	}
	
	//Getters and Setters

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", Username=" + Username + ", Email=" + Email + "]";
	}

}