package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String name;
    private int worthNumberOfCredits;
    private ArrayList<Student> students;

    public Course(String name, int numberOfCredits) {
        this.name = name;
        this.worthNumberOfCredits = numberOfCredits;
    }
    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.

    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits.";
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    @Override
    public boolean equals(Object o) {
        if ((o instanceof Course) == false) return false;
        Course myCourseObj = (Course) o;
        if (myCourseObj.name.equals(this.name)) return true;
        else return false;

//      @Override
//        public int hashCode () {
//            return Objects.hash(name, worthNumberOfCredits, students);
//        }
    }
}

