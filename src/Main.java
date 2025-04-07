package src;

public class Main {
    public static void main(String[] args) {
        CourseManagementSystem system=new CourseManagementSystem();

        Instructor anita=new Instructor("Anna","anna@gmail.com");
        Instructor alan=new Instructor("Alan","alan@gmail.com");

        Student st1=new Student("John", "john@gmail.com");
        Student st2=new Student("Jane", "jane@gmail.com");


        Course course1=new Course("Math102",anita);
        Course course2=new Course("Math153",anita);
        Course course3=new Course("FENG345",alan);

        anita.createCourse(course1);
        anita.createCourse(course2);
        alan.createCourse(course3);

        system.addCourse(course1);
        system.addCourse(course2);
        system.addCourse(course3);


        system.addStudent(st1);
        system.addStudent(st2);

        st1.enrollCourse(course1);
        st2.enrollCourse(course2);

        system.listCourses();



    }
}
