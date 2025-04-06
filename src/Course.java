package src;

public class Course {
    private String title;
    private Instructor instructor;
    private Student[] enrolledStudents;

    public Course(String title, Instructor instructor, Student[] enrolledStudents) {
        this.setTitle(title);
        this.setInstructor(instructor);
        this.setEnrolledStudents(enrolledStudents);
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

    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(Student[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
