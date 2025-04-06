package src;
public class Instructor extends  User{
    private Course[] coursesTaught;
    public Instructor(String name,String email,Course[] coursesTaught){
        super(name,email);
        this.coursesTaught = coursesTaught;
    }
    public void login(){
        System.out.println("Instructor Login");

    }

    public void createCourse(Course course){
    }

    public Course[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(Course[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}


