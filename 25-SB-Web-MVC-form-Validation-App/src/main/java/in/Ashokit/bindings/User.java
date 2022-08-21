package in.Ashokit.bindings;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class User {
	@NotEmpty(message = "Please Enter username")
	private String name;
	
	@NotEmpty(message = "Please Enter Password")
	private String pwd;
	
	@NotEmpty(message = "Please Enter Email")
	@Email(message = "Please Enter valid Email")
	private String email;
	
	@NotNull(message = "Please Enter phone Number")
	private Double phone;
	
	public User() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getPhone() {
		return phone;
	}
	public void setPhone(Double phone) {
		this.phone = phone;
	}
	
	

}
