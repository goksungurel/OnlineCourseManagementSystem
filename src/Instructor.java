package src;

import java.util.ArrayList;

public class Instructor extends  User{
    private ArrayList<Course>coursesTaught;
    public Instructor(String name,String email){
        super(name,email);

        coursesTaught = new ArrayList<Course>();
    }
    public void login(){
        System.out.println("Instructor Login");

    }

    public void createCourse(Course course){
        coursesTaught.add(course);
    }

    public ArrayList<Course> getCoursesTaught(){
        return coursesTaught;
    }
    public void setCoursesTaught(ArrayList<Course> coursesTaught){
        this.coursesTaught = coursesTaught;
    }

}


