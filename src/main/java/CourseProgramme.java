import org.joda.time.LocalDate;
import java.util.ArrayList;


public class CourseProgramme {

    private String courseName;
    ArrayList<Module> courseModules=new ArrayList<Module>();
    ArrayList<Student> enrolledStudents=new ArrayList<Student>();
    LocalDate startDate = new LocalDate();
    LocalDate endDate = new LocalDate();

    public CourseProgramme(String courseName, ArrayList<Module> courseModules, ArrayList<Student> enrolledStudents, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.courseModules = courseModules;
        this.enrolledStudents = enrolledStudents;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getCourseModules() {
        return courseModules;
    }

    public void setCourseModules(ArrayList<Module> courseModules) {
        this.courseModules = courseModules;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
