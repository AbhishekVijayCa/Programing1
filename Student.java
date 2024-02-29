/**
 * ACS-1903-003
 * Demo March 25
 */
public class Student{
    // fields
    private static int lastId;
    
    private String firstName;
    private String lastName;
    private char gender;
    private boolean active;
    private int id;
    private Subject major;
    
    // constructors
    public Student(){
        firstName = "unknown";
        lastName = "unknown";
        gender = '-';
        active = false;
        id = nextId();
    }

    public Student(String firstName, String lastName, char gender, boolean active){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.active = active;
        id = nextId();
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
    
    public char getGender(){
        return gender;
    }
    
    public void setGender(char gender){
        this.gender = gender;
    }
    
    public Subject getMajor(){
        return major;
    }
    
    public void setMajor(Subject major){
        this.major = major;
    }
    
    public boolean isActive(){
        return active;
    }
    
    public void setActive(boolean active){
        this.active = active;
    }
    
    // other methods
    private int nextId(){
        return ++lastId;
    }
    
    // (how to change equals to check student id?)
    public boolean equals(Student s){
        return lastName.equals(s.lastName);
    }
    
    public String toString(){
        return id + " " + firstName + " " + lastName;
    }
}
