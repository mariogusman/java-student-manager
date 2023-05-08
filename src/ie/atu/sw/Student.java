package ie.atu.sw;

import java.time.LocalDate;

public class Student {
	private String sid;
	private String firstName; 
	private String surname;
	private LocalDate dob;
	private Address address;
	private Course course;
	
	
	public Student(String sid) {
		super();
		this.sid = sid;
	}


	public Student(String sid, String firstName, String surname, LocalDate dob) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.surname = surname;
		this.dob = dob;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	} 
	
	
	
}
