import java.util.ArrayList;
/**
 * ACS-1903 
 * Lab 11 Sample Solution
 */
public class LastLab{
    public static void main(String[] args){
        Instructor jlb = new Instructor ("Jeanette", "Bautista");
        Course acs1903 = new Course("ACS-1903", "Programming Fundamentals I");
        Course acs1904 = new Course("ACS-1904", "Programming Fundamentals II");
        Course acs2947 = new Course("ACS-2947", "Data Structures and Algorithms");
        Course acs3916 = new Course("ACS-3916", "Human-Computer Interaction");

        acs1903.setInstructor(jlb);
        jlb.addCourse(acs1903);
        acs1904.setInstructor(jlb);
        jlb.addCourse(acs1904);
        acs2947.setInstructor(jlb);
        jlb.addCourse(acs2947);
        acs3916.setInstructor(jlb);
        jlb.addCourse(acs3916);
        
        System.out.println("Instructor: " + jlb);
        System.out.println("Courses:");
        ArrayList<Course> courses = jlb.getCourses();
        for (Course c : courses){
            System.out.println(c);
        }
    }
}
