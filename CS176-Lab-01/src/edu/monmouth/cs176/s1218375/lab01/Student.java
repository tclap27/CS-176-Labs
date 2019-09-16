package edu.monmouth.cs176.s1218375.lab01;

public class Student 
{
	private String name;
	private String studentID;
	private String email;
	private String major;
	private Integer classLevel;
	private String advisor;
	private Double credits;
	
	/**
	* @param name - full name
	* @param sID - student ID
	* @param email - school email
	* @param major - student's major
	* @param classLevel - class Level 1 thru 4
	* @param advisor - student's advisor
	* @param credits - course credit
	*/


	Student(String name, String sID, String email, String major, Integer classLevel, String advisor, Double credits)
	{
	this.name = name;
	this.studentID = sID;
	this.email = email;
	this.major = major;
	this.classLevel = classLevel;
	this.advisor = advisor;
	this.credits = credits;
	
	}

	/**
	* Getter Method for major
	* @param major
	*/

	public void setMajor (String major)
	{
	this.major = major;

	}

	public String getMajor()
	{
	return this.major;
	}

	//over object to return string

	/*
	* (non-Javadoc)
	* @see java.lang.Objects#toString()
	*/

	public String toString()
	{
	return
	"Name: " + this.name + "\n" +
	"Student ID: " + this.studentID + "\n" +
	"Email: " + this.email + "\n" +
	"Major: " + this.major + "\n" +
	"Class: " + this.classLevel + "\n" +
	"Advisor: " + this.advisor + "\n" +
	"Credits: " + this.credits + "\n";

	}

}