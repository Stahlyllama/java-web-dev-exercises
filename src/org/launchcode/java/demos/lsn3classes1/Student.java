package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

        private String name;
        private static int nextStudentId =1;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

    public Student(String name,int studentId,int numberOfCredits,double gpa) {
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = numberOfCredits;
            this.gpa = gpa;
        }
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
        }
    public Student (String name){
          this(name, nextStudentId);
          nextStudentId++;
    }
     public String studentInfo() {
         return (this.name + " has a GPA of: " + this.gpa);
     }
}
