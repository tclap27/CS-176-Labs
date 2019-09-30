package edu.monmouth.cs176.s1218375.lab05;

import java.util.ArrayList;

public class Student 
{
	private String name;
	private String studentID;
	private String email;
	private String major;
	private Integer classLevel;
	private String advisor;
	private Double credits;
	private Integer graduationYear;
	public ArrayList<Course> courses;
	
	
	/**
	* @param name - full name
	* @param sID - student ID
	* @param email - school email
	* @param major - student's major
	* @param classLevel - class Level 1 thru 4
	* @param advisor - student's advisor
	* @param credits - course credit
	*/


	Student(String name, String sID, String email, String major, Integer classLevel, String advisor, 
			Double credits, Integer graduationYear, ArrayList<Course> courses)
	{
	this.name = name;
	this.studentID = sID;
	this.email = email;
	this.major = major;
	this.classLevel = classLevel;
	this.advisor = advisor;
	this.credits = credits;
	this.graduationYear = graduationYear;
	this.courses = new ArrayList<Course>();
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
	
	public String getStudentID()
	{
		return studentID;
	}
	
	public void setGraduationYear(Integer gradyear)
	{
		this.graduationYear = gradyear;
		
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public String getAdvisor()
	{
		return this.advisor;
	}
	
	public void addCourse(Course c)
	{
		courses.add(c);
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
	"Credits: " + this.credits + "\n" +
	"Graduation Year: " + this.graduationYear;
	}
	
}
	

