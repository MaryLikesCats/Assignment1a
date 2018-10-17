import org.joda.time.LocalDate;
import java.util.ArrayList;

public class Student {

    private String fullName;
    private int age;
    private LocalDate dob = new LocalDate();
    private int id;
    private String username;
    ArrayList<CourseProgramme> courses=new ArrayList<CourseProgramme>();
    ArrayList<Module> modules=new ArrayList<Module>();

    public Student(String name, int age, LocalDate dob, int id) {
        this.fullName = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
    }


    //Accessors and Mutators
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        username = fullName+age;
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
