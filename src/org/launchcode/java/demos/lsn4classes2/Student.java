package org.launchcode.java.demos.lsn4classes2;

import java.sql.SQLOutput;
import java.util.Objects;

public class Student {

    public static void main(String[] args) {
//        Student myself = new Student("Kim",
//                1,
//                12,
//                4.0);
//        Student myTwin = new Student("Kim",
//                1,
//                32,
//                3.0);
//        Teacher theTeacher = new Teacher();
//
        Course myFirstCourse = new Course("my first course", 2);
        Course mySecondCourse = new Course ("my first course", 3);


//        String myGradeLevel = myself.getGradeLevel();
//        System.out.println(myGradeLevel);
//    myself.addGrade( 1, 4.0);
//        System.out.println(myself.gpa);
//    myself.addGrade( 1, 3.0);
//        System.out.println(myself.gpa);
//        myself.addGrade( 1, 3.5);
//        System.out.println(myself.gpa);
//        myself.addGrade( 1, 2.3);
//        System.out.println(myself.gpa);
//        System.out.println(myself.toString());
//        System.out.println(myself.equals(theTeacher));
        System.out.println(myFirstCourse.equals(mySecondCourse));
        System.out.println((myFirstCourse.toString()));
    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        //current total quality score = gpa * numberOfCredits
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        // The quality score for a class is found by multiplying the letter grade score (0.0-4.0) by the number of credits.
        // letter grade (0.0-4.0) * number of credits
        double newQualityScore = grade * courseCredits;

        // The total quality score is the sum of the quality scores for all classes.
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        // Update the student’s total numberOfCredits.
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        // gpa = (total quality score) / (total number of credits)
        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Student) == false) return false;
        Student myStudentObj = (Student) o;
        if (myStudentObj.name.equals(this.name)) return true;
        else return false;

//        return studentId == myStudentObj.studentId && numberOfCredits == myStudentObj.numberOfCredits && Double.compare(myStudentObj.gpa, gpa) == 0 && Objects.equals(name, myStudentObj.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId, numberOfCredits, gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        // Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits).
        if (this.numberOfCredits >= 0 && this.numberOfCredits <= 29) {
            return "freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            return "sophmore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            return "junior";
        } else if (this.numberOfCredits >= 90) {
            return "senior";
        } else {
            return null;
        }


        // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
        //  than just the class fields.

        // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
        //  Student objects equal.
//
//    public String getName() {
//        return name;
//    }
//
//    public int getStudentId() {
//        return studentId;
//    }
//
//    public int getNumberOfCredits() {
//        return numberOfCredits;
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStudentId(int studentId) {
//        this.studentId = studentId;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//
//    private void setNumberOfCredits(int numberOfCredits) {
//        this.numberOfCredits = numberOfCredits;
//    }
//
//    public static void main(String[] args) {
//        Student sally = new Student("Sally",1,1,4.0);
//        System.out.println("The Student class works! " + sally.getName() + " is a student!");
//        System.out.println(sally);
//        sally.addGrade(12, 3.5);
//        System.out.println(sally);
//        sally.addGrade(25, 3.8);
//        System.out.println(sally);
    }
}
