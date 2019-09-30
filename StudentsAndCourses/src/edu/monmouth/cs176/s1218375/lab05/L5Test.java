package edu.monmouth.cs176.s1218375.lab05;

public class L5Test 
{
	public static void main (String[] args)
	{
		
		StudentList cs176List = new StudentList();
		
		//creation of students
		Student s1 = new Student ("John Smith", "123", "s123@gmail.com", "CS", 02, "R.Scherl", 32.0, 2022, null);
		Student s2 = new Student ("Tom Clappsy", "456", "s456@gmail.com", "CS", 02, "J.Kretsch", 32.0, 2022, null);
		Student s3 = new Student ("Jane Doe", "789", "s789@gmail.com", "CS", 02, "R.Scherl", 32.0, 2022, null);
		Student s4 = new Student ("Thom Yorke", "987", "s987@gmail.com", "SE", 02, "R.Scherl", 32.0, 2022, null);
		
		
		
		//ading students to list
		cs176List.addStudent(s1);
		cs176List.addStudent(s2);
		cs176List.addStudent(s3);
		cs176List.addStudent(s4);
		
		//creation of courses
		Course c1 = new Course("CS", "175", "Intro to CS175");
		Course c2 = new Course("CS", "176", "Intro to CS176");
		Course c3 = new Course ("CS", "205", "Data Structures & Algorithms");
		Course c4 = new Course ("SE", "207", "Design Patterns & Architecture");
		
		
		//assigning courses to students
		s1.addCourse(c1);
		s2.addCourse(c2);
		s3.addCourse(c3);
		s4.addCourse(c4);
	
		
		//listing students
		cs176List.listStudents();
	}
	
}
