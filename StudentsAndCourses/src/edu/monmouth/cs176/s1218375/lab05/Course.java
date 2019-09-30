package edu.monmouth.cs176.s1218375.lab05;

public class Course {

	
		private String courseCode;
		private String courseNumber;
		private String courseDescription;
		
		Course(String courseCode, String courseNumber, String courseDescription)
		{
			this.courseCode = courseCode;
			this.courseNumber = courseNumber;
			this.courseDescription = courseDescription;
		}
		
		public String toString()
		{
			return 
				"Course Code: " + this.courseCode + "\n" + 
				"Course Number: " + this.courseNumber + "\n" + 
				"Course Description: " + this.courseDescription + "\n";
		}
	


}

