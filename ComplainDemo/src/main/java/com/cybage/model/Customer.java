package com.cybage.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
//	@Column(name ="First Name")
	private String firstName;
	
//	@Column(name ="Last Name")
	private String lastName;
	
//	@Column(name ="Email")
	private String email;
	
//	@Column(name ="Address")
	private String address;
	
//	@Column(name ="Mobile Number")
	private String mobileNumber ;
	
//	@Column(name ="Password")
	private String password;
	 
	private String gender;
	
	private String role;
	
	
	

	public Customer() {
	}
	


	public Customer(int userId, String firstName, String lastName, String email, String address, String mobileNumber,
			String password, String gender, String role) {
		
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.password = password;
		this.gender = gender;
		this.role = role;
	}





	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getMobileNumber() {
		return mobileNumber;
	}




	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", mobileNumber=" + mobileNumber + ", password=" + password + ", gender="
				+ gender + ", role=" + role + "]";
	}

	



}//class user 

