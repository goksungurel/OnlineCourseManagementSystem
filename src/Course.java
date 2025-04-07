package src;

import java.util.ArrayList;
import java.util.HashMap;
public class Course {
    private String title;
    private Instructor instructor;
    private ArrayList<Student> enrolledStudents;
    private HashMap<Student,Integer> grades=new HashMap<>();

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
   public void setGrade(Student student, int grade) {
        grades.put(student,grade);
   }
   //hashmap int degil nesnesi Integer kullanılırız wrapper classlar
       public Integer getGrade(Student student) {
        return grades.get(student);
   }
   public boolean isCompleted(Student student){
        Integer grade=grades.get(student);
        return grade !=null && grade>=50;
   }
    public String toString() {
        return "Course: " + title + ", Instructor: " + instructor.getName();

    }
}

