package edu.monmouth.cs176.s1218375.lab01;

public class L1Test
{
public static void main (String[] args)
{
System.out.println("Lab 1");

//Instantiate Student List Class

StudentList cs176List = new StudentList(15);
//change this 15

//instantiate a student

Student s1 = new Student ("Ahmed, Saahil", "1219200", "s1219200@monmouth.edu", "CS", 2, "E.Cesario",1.0);

Student s2 = new Student ("Berardis, Anthony William", "1297598", "s1297598@monmouth.edu", "CS", 2 , "R.Scherl", 1.0);

Student s3 = new Student ("Clappsy, Thomas V", "1218375", "s1218375@monmouth.edu", "CS", 2 ,"J.Kretsch", 1.0);

Student s4 = new Student ("Coyle, Shannon Kathryn", "1226097", "s1226097@monmouth.edu", "SE", 02, "E.Cesario", 1.0);

Student s5 = new Student ("Fahad, Muhammad", "1212339","s1212339@monmouth.edu", "CS", 02, "E.Cesario", 1.0);

Student s6 = new Student ("Johnson, Spencer Christian", "1224708", "s1224708@monmouth.edu", "CS", 02, "J. Chung",1.0);

Student s7 = new Student ("Jones, Matthew Aubyn", "1095689","s1095689@monmouth.edu", "CS", 02, "R.Scherl", 1.0);

Student s8 = new Student ("Kliks, Angela K", "1137151", "s1137151@monmouth.edu", "CS", 02, "L.Zheng", 1.0);

Student s9 = new Student ("Krempa, Ian Edward", "1233625", "s1233625@monmouth.edu", "CS", 02, "C.Yu", 1.0);

Student s10 = new Student ("Marquez, Veronica", "1125739", "s1125739@monmouth.edu", "CS", 03, "J. Kretsch",1.0);

Student s11 = new Student ("McKnight, Anthony M", "1249736", "s1249736@monmouth.edu", "CS", 02, "C. Yu", 1.0);

Student s12 = new Student ("Patel, Premkumar K", "1205153", "s1205153@monmouth.edu", "CS", 02, "L.Zheng", 1.0);

Student s13 = new Student ("Patel, Sahil T", "1245759", "s1245759@monmouth.edu", "CS", 02, "J. Kretsch", 1.0);

Student s14 = new Student ("Robinson, Annabelle Indiana", "1212304", "s1212304@monmouth.edu", "CS", 02, "J. Kretsch", 1.0);

Student s15 = new Student ("Vella, Nicholas James", "0999371", "s0999371@monmouth.edu", "CS", 04, "G. Eckert", 1.0);



/*
* Instantiate more students s3 thru s15 here
*/


//add students to list


cs176List.addStudent(s1);
cs176List.addStudent(s2);
cs176List.addStudent(s3);
cs176List.addStudent(s4);
cs176List.addStudent(s5);
cs176List.addStudent(s6);
cs176List.addStudent(s7);
cs176List.addStudent(s8);
cs176List.addStudent(s9);
cs176List.addStudent(s10);
cs176List.addStudent(s11);
cs176List.addStudent(s12);
cs176List.addStudent(s13);
cs176List.addStudent(s14);
cs176List.addStudent(s15);


/* Add rest of the students s3 thru s15 to list
*
*/

//now list the students

cs176List.listStudents();

	}
}