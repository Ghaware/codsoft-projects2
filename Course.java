import java.util.*;

class Course {
    private String courseId;
    private String courseName;
    private int maxCapacity;
    private int currentCapacity;
    
    public Course(String courseId, String courseName, int maxCapacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
    }
    
    public String getCourseId() {
        return courseId;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public int getMaxCapacity() {
        return maxCapacity;
    }
    
    public int getCurrentCapacity() {
        return currentCapacity;
    }
    
    public boolean addStudent() {
        if (currentCapacity < maxCapacity) {
            currentCapacity++;
            return true;
        }
        return false;
    }
}

class Student {
    private String studentId;
    private String name;
    private List<Course> courses;
    
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.courses = new ArrayList<>();
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Course> getCourses() {
        return courses;
    }
    
    public void registerCourse(Course course) {
        courses.add(course);
        course.addStudent();
    }
}

public class RegistrationSystem {
    public static void main(String[] args) {
        // Create courses
        Course course1 = new Course("CSCI101", "Introduction to Computer Science", 50);
        Course course2 = new Course("MATH101", "Calculus I", 40);
        
        // Create students
        Student student1 = new Student("1001", "Alice");
        Student student2 = new Student("1002", "Bob");
        
        // Register students for courses
        student1.registerCourse(course1);
        student1.registerCourse(course2);
        student2.registerCourse(course1);
        
        // Print student-course registrations
        System.out.println(student1.getName() + " is registered in the following courses:");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getCourseName());
        }
        
        System.out.println(student2.getName() + " is registered in the following courses:");
        for (Course course : student2.getCourses()) {
            System.out.println(course.getCourseName());
        }
        
        // Print course capacities
        System.out.println("Current capacity of " + course1.getCourseName() + ": " + course1.getCurrentCapacity());
        System.out.println("Current capacity of " + course2.getCourseName() + ": " + course2.getCurrentCapacity());
    }
}
