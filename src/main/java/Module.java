import java.util.ArrayList;

public class Module {

    //A module class, which should contain information such as module name, id (e.g.
    //CT417), list of students, courses it is associated with)

    private String moduleName;
    private int moduleID;
    ArrayList<Student> students=new ArrayList<Student>();
    ArrayList<CourseProgramme> associatedCourses=new ArrayList<CourseProgramme>();

    public Module(String moduleName, int moduleID, ArrayList<Student> students, ArrayList<CourseProgramme> associatedCourses) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        this.students = students;
        this.associatedCourses = associatedCourses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public int getModuleID() {
        return moduleID;
    }

    public void setModuleID(int moduleID) {
        this.moduleID = moduleID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<CourseProgramme> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<CourseProgramme> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }
}
