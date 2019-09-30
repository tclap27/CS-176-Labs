package edu.monmouth.cs176.s1218375;

public class Runners {

	private String ID;
	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private String email;
	private String tShirtSize;
	private String state;
	private String zipCode;
	private String uuid;
	
	/**
	 * @param ID
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param age
	 * @param email
	 * @param tShirtSize
	 * @param state
	 * @param zipCode
	 * @param uuid
	 */
	
	Runners (String ID,
	        String firstName,
			String lastName,
			String gender,
			String age,
			String email,
			String tShirtSize,
			String state,
			String zipCode,
			String uuid) {
		
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.tShirtSize = tShirtSize;
		this.state = state;
		this.zipCode = zipCode;
		this.uuid = uuid;
		
	}
	
	/*
	 * Implement required Getter methods for ID and tShirtSize
	 */
	public String getID()
	{
		return this.ID;
	}
	
	public String getTShirtSize()
	{
		return this.tShirtSize;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public String toString () {
		return "ID: " + this.ID + "\n" +
		"First Name: " + this.firstName + "\n" +
		"Last Name: " +this.lastName + "\n" +
		"Gender: " +this.gender + "\n" +
		"Age: " +this.age + "\n" +
		"Email: " +this.email + "\n" +
		"T-Shirt Size: " +this.tShirtSize + "\n" +
		"State: " +this.state + "\n" +
		"Zipcode: " +this.zipCode  + "\n" +
		"UUID: " + this.uuid;
	}
}
