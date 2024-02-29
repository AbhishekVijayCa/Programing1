/**
 * ACS-1903-003
 * Demo March 25
 */
public class Driver{
    public static void main(String[] args){
        Subject acs = new Subject("ACS", "Applied Computer Science");
        Student ron = new Student("Ron", "Weasley", 'M', true);
        Student harry = new Student("Harry", "Potter", 'M', true);
        Student ginny = new Student();
        ginny.setFirstName("Ginny");
        ginny.setLastName("Weasley");

        ron.setMajor(acs);
        acs.addMajor(ron);
        harry.setMajor(acs);
        acs.addMajor(harry); 
        ginny.setMajor(acs);
        acs.addMajor(ginny);
        
        // associations
        System.out.println("Ron's major: " + ron.getMajor());
        System.out.println(acs + " majors:");
        for (Student s : acs.getMajors()){
            System.out.println(s);
        }
        
        // equals
        System.out.println();
        System.out.println(ron.equals(ron));
        System.out.println(ron.equals(harry));
        System.out.println(ron.equals(ginny));  


    }
}