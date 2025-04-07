package src;
import java.util.ArrayList;
public class CourseManagementSystem {
    private ArrayList<Instructor> instructors;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public CourseManagementSystem() {
        instructors = new ArrayList<>();
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public void listCourses(){
        System.out.println("Courses List");
        for(Course c : courses){
            System.out.println(c);
        }
    }

}
