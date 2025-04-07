package src;

import java.util.ArrayList;

public class Course {
    private String title;
    private Instructor instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String title, Instructor instructor) {
        this.setTitle(title);
        this.setInstructor(instructor);
        enrolledStudents=new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
