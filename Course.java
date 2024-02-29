/**
 * ACS-1903 
 * Lab 11 Sample Solution
 */
public class Course{
    // fields
    private String id;
    private String name;
    private Instructor instructor;
    
    // constructor
    public Course(String id, String name){
        this.id = id;
        this.name = name;
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
    
    public Instructor getInstructor(){
        return instructor;
    }
    
    public void setInstructor(Instructor instructor){
        this.instructor = instructor;
    }
    
    // other methods
    public String toString(){
        return id + " " + name;
    }
    
}
