package safespace;

import java.util.Objects;

public class Course {

    private String title;
    private int credits;
    private String instructor;

    public Course (String title, int credits, String instructor) {
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//performs the reference check on the object o
        if (o == null || getClass() != o.getClass()) return false; // performs the null check & class check on o.
        Course course = (Course) o; //casts o as a Course object
        return title.equals(course.title) && instructor.equals(course.instructor); //compares the title and instructor fields of the two objects
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }
}