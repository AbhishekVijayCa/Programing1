import java.util.ArrayList;
/**
 * ACS-1903-003
 * Demo March 25
 */
public class Subject{
    // fields
    private String id;
    private String name;
    ArrayList<Student> majors;

    // constructor
    public Subject(String id, String name){
        this.id = id;
        this.name = name;
        majors = new ArrayList<>();
    }

    // getters and setters
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public ArrayList<Student> getMajors(){
        return majors;
    }
    
    public void setMajors(ArrayList<Student> majors){
        this.majors = majors;
    }
    
    // other methods
    public void addMajor(Student major){
        majors.add(major);
    }
    
    public String toString(){
        return id + " " + name;
    }
}
