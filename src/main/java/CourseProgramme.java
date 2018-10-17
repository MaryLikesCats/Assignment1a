import org.joda.time.DateTime;
import java.util.ArrayList;


public class CourseProgramme {

    // A course programme class containing course name (CS & IT or ECE, etc.), list of
    //modules, list of students that are enrolled, academic start date and end date.
    //Start and end dates should use Joda Time classes (i.e. DateTime), which must be
    //added as a project dependency

    private String courseName;
    ArrayList<Module> courseModules=new ArrayList<Module>();
    ArrayList<Student> enrolledStudents=new ArrayList<Student>();
    DateTime startDate = new DateTime();
    DateTime endDate = new DateTime();

    public CourseProgramme(String courseName, ArrayList<Module> courseModules, ArrayList<Student> enrolledStudents, DateTime startDate, DateTime endDate) {
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

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
