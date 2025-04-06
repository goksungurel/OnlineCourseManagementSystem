package src;

public class Student extends User {
    private Course[] enrolledCourse;
    public Student(String name,String email,Course[] enrolledCourse) {
        super(name,email);
        this.setEnrolledCourse(enrolledCourse);
    }
    public void login(){
        System.out.println("Student Login");

    }
    public void createCourse(Course course){

    }

    public Course[] getEnrolledCourse() {
        return enrolledCourse;
    }

    public void setEnrolledCourse(Course[] enrolledCourse) {
        this.enrolledCourse = enrolledCourse;
    }
}
