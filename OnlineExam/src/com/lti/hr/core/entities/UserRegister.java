package com.lti.hr.core.entities;
	

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	
	import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

	@Entity(name="ureg")
	@Table(name = "user_register")
	//@SequenceGenerator(name = "seq", sequenceName = "register_seq_new", allocationSize = 1, initialValue = 1)
	public class UserRegister {
		/**
		 * 
		 */
		//private static final long serialVersionUID = 1L;

		//Variables and Column names
		//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
		@Id
		@Column(name = "USER_ID")
		private int userId;

		@Column(name = "FULL_NAME")
		private String firstName;

		@Column(name = "EMAIL_ID")
		private String email;
		
		@Column(name = "PASSWORD")
		private String password;

		@Column(name = "MOBILE_NUMBER")
		private String mobileNumber;
		
		@Column(name = "DATE_OF_BIRTH")
		@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
		private Date dateOfBirth;
		
		@Column(name = "QUALIFICATION")
		private String qualification;
		
		@Column(name = "YEAR_OF_COMPLETION")
		private int yearOfCompletion;

		@Column(name = "CITY")
		private String city;

		@Column(name = "STATE")
		private String state;

		public UserRegister() {
			super();
		}

		public UserRegister(int userId, String firstName, String email, String password, String mobileNumber,
				Date dateOfBirth, String qualification, int yearOfCompletion, String city, String state) {
			super();
			this.userId = userId;
			this.firstName = firstName;
			this.email = email;
			this.password = password;
			this.mobileNumber = mobileNumber;
			this.dateOfBirth = dateOfBirth;
			this.qualification = qualification;
			this.yearOfCompletion = yearOfCompletion;
			this.city = city;
			this.state = state;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getMobileNumber() {
			return mobileNumber;
		}

		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public int getYearOfCompletion() {
			return yearOfCompletion;
		}

		public void setYearOfCompletion(int yearOfCompletion) {
			this.yearOfCompletion = yearOfCompletion;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		@Override
		public String toString() {
			return "UserRegister [userId=" + userId + ", firstName=" + firstName + ", email=" + email + ", password="
					+ password + ", mobileNumber=" + mobileNumber + ", dateOfBirth=" + dateOfBirth + ", qualification="
					+ qualification + ", yearOfCompletion=" + yearOfCompletion + ", city=" + city + ", state=" + state
					+ "]";
		}
}
