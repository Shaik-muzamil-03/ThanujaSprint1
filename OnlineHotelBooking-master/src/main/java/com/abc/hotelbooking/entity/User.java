package com.abc.hotelbooking.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User implements Comparable<User> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String userName;
	private String password;
	private String emailId;
	private long mobileNumber;
	private String userAddress;
	private String role;
	@OneToMany
	List<HotelAccount> allhotels;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String password, String emailId, long mobileNumber, String userAddress,
			String role, List<HotelAccount> allhotels) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.userAddress = userAddress;
		this.role = role;
		this.allhotels = allhotels;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<HotelAccount> getAllhotels() {
		return allhotels;
	}
	public void setAllhotels(List<HotelAccount> allhotels) {
		this.allhotels = allhotels;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(allhotels, emailId, mobileNumber, password, role, userAddress, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(allhotels, other.allhotels) && Objects.equals(emailId, other.emailId)
				&& mobileNumber == other.mobileNumber && Objects.equals(password, other.password)
				&& Objects.equals(role, other.role) && Objects.equals(userAddress, other.userAddress)
				&& userId == other.userId && Objects.equals(userName, other.userName);
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", emailId=" + emailId
				+ ", mobileNumber=" + mobileNumber + ", userAddress=" + userAddress + ", role=" + role + ", allhotels="
				+ allhotels + "]";
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
