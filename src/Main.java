package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CourseManagementSystem system = new CourseManagementSystem();

        while (true) {
            System.out.println("\n==== COURSE MANAGEMENT SYSTEM ====");
            System.out.println("1. Add Instructor");
            System.out.println("2. Add Student");
            System.out.println("3. Create Course");
            System.out.println("4. Enroll in Course");
            System.out.println("5. List Courses");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            int choice =sc.nextInt();
            sc.nextLine();

            switch (choice) {
            case 1: {


                System.out.println("Enter Instructor name: ");
                String name = sc.nextLine();
                System.out.println("Enter Instructor email: ");
                String email = sc.nextLine();
                Instructor instructor = new Instructor(name, email);
                system.addInstructor(instructor);
                System.out.println("Instructor added");
                break;
            }

                case 2:{
                    System.out.println("Enter Student name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Student email: ");
                    String email = sc.nextLine();
                    Student student = new Student(name, email);
                    system.addStudent(student);
                    System.out.println("Student added");
                    break;
                }
                case 3: {
                    System.out.println("Enter Course title: ");
                    String title = sc.nextLine();
                    System.out.println("Select instructor (index): ");
                    for (int i = 0; i < system.getInstructors().size(); i++) {
                        System.out.println(i + ": " + system.getInstructors().get(i).getName());
                    }
                    int index = sc.nextInt();
                    sc.nextLine(); // dummy line

                    Instructor selectedInstructor = system.getInstructors().get(index);

                    Course course = new Course(title, selectedInstructor);
                    selectedInstructor.createCourse(course);
                    system.addCourse(course);

                    System.out.println("Course added.");


                }
                case 4:{
                    if (system.getStudents().isEmpty() || system.getCourses().isEmpty()) {
                        System.out.println("Please make sure there are students and courses first.");
                        break;
                    }
                    System.out.println("Select student (index): ");
                    for (int i = 0; i < system.getStudents().size(); i++) {
                        System.out.println(i + ": " + system.getStudents().get(i).getName());
                    }
                    int studentIndex = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Select course (index): ");
                    for (int i = 0; i < system.getCourses().size(); i++) {
                        System.out.println(i + ": " + system.getCourses().get(i).getTitle());
                    }
                    int courseIndex = sc.nextInt();
                    sc.nextLine();

                    Student student = system.getStudents().get(studentIndex);
                    Course course = system.getCourses().get(courseIndex);
                    student.enrollCourse(course);

                }
                case 5:
                    system.listCourses();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");

            }
        }



    }
}
