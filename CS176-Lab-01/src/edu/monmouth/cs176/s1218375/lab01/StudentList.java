package edu.monmouth.cs176.s1218375.lab01;

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

}