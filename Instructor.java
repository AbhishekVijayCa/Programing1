import java.util.ArrayList;
/**
 * ACS-1903 
 * Lab 11 Sample Solution
 */
public class Instructor{
    // fields
    public String firstName;
    public String lastName;
    public ArrayList<Course> courses;

    // constructor
    public Instructor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new ArrayList<>();
    }

    // getters and setters
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public ArrayList<Course> getCourses(){
        return courses;
    }

    public void setCourses (ArrayList<Course> courses){
        this.courses = courses;
    }
    
    // other methods
    public void addCourse(Course course){
        courses.add(course);
    }

    public String toString(){
        return firstName.charAt(0) + ". " + lastName;
    }
}
