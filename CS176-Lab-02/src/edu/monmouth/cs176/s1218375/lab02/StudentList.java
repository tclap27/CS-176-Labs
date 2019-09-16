package edu.monmouth.cs176.s1218375.lab02;

public class StudentList
{
Student [] cs176Students;

private int count = 0;

/**
* Constructor for StudentList Class
*/

StudentList (int totalStudents)
{
cs176Students = new Student[totalStudents];
}

/**
* @param s - new Student object
*/

public void addStudent (Student s)
{
cs176Students[count] = s;
count++;
}

/**
* List the students using for-each loop
*/

public void listStudents()
{ 
for(Student s : cs176Students)
System.out.println(s.toString());
}

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

public Student Find (String ID)
{
	for(Student s : cs176Students)
	{
		if(s.getStudentID() == ID)
			return s;
	}
	return null;
}

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
}

