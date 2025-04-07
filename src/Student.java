package src;
import java.util.ArrayList;
public class Student extends User {
    private ArrayList<Course> enrolledCourses;

    public Student(String name, String email) {
        super(name, email);
        enrolledCourses = new ArrayList<>();
    }
    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
   public void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
   }

    public void login() {
        System.out.println("Student Login");

    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        course.getEnrolledStudents().add(this);
        System.out.println(getName() + " has successfully enrolled in the course: " + course.getTitle());
    }
}


