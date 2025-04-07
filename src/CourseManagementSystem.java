package src;
import java.util.ArrayList;
public class CourseManagementSystem {
    private ArrayList<Instructor> instructors;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public CourseManagementSystem() {
        setInstructors(new ArrayList<>());
        setStudents(new ArrayList<>());
        setCourses(new ArrayList<>());
    }
    public void addInstructor(Instructor instructor) {
        getInstructors().add(instructor);
    }
    public void addStudent(Student student) {
        getStudents().add(student);
    }
    public void addCourse(Course course) {
        getCourses().add(course);
    }
    public void listCourses(){
        System.out.println("Courses List");
        for(Course c : getCourses()){
            System.out.println(c);
        }
    }


    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
