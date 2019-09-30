package edu.monmouth.cs176.s1218375.lab03;
import java.util.ArrayList;

public class StudentList
{
	
ArrayList<Student> cs176Students;

private int count = 0;

/**
* Constructor for StudentList Class
*/

//initializes cs176Students as a new ArrayList
StudentList ()
{
	cs176Students = new ArrayList<Student>();
}

/**
* @param s - new Student object
*/

//adds student to list
public void addStudent (Student s)
{
	cs176Students.add(s);
}

/**
* List the students using for-each loop
*/

//lists students
public void listStudents()
{ 
	for(Student s : cs176Students)
		System.out.println(s.toString());
}


//updates the students graduation year
public boolean updateStudentGraduationYear (String ID, Integer year)
{
	boolean results = false;
	Student student = Find(ID);
	if(student != null)
	{
		student.setGraduationYear(year);
		return true;
	}
	return results;
}

//finds student by ID
public Student Find (String ID)
{
	for(Student s : cs176Students)
	{
		if(s.getStudentID() == ID)
			return s;
	}
	return null;
}

//updates major list
public Integer studentCount(String major)
{
	Integer count = 0;
	for(Student s : cs176Students)
	{
		if(s.getMajor() == major)
			 count++;
	}
	return count;
}

//finds a student by their email
public Student getStudentInfo(String email)
{	
	for(Student s: cs176Students)
	{
		if(s.getEmail() == email)
		{
			return s;
		}
	}
	return null;
}

//finds student by a key and value
public Student findStudentByKey(String key, String value)
{
	Student foundStudent = null;
	String foundValue;
	
	for(Student s : cs176Students)
	{
		switch(key)
		{
		case "studentID":
			foundValue = s.getStudentID();
			break;
			
		case "email":
			foundValue = s.getEmail();
			break;
		
		case "advisor":
			foundValue = s.getAdvisor();
			break;
				
		default:
			foundValue = "";
		}
		
		if(foundValue ==value)
		{
			return s;
		}
	}
return foundStudent;
		
}
//extra credit
//Finds students based on advisor
public void listStudentForAdvisor(String advisor)
{
	for(Student s: cs176Students)
	{
		if(s.getAdvisor() == advisor)
		{
			 System.out.println("Students Listed For Advisor: ");
			 System.out.println(s.toString());		
			
		}
	}
	
}
}

