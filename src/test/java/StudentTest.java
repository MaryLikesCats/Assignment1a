import org.joda.time.LocalDate;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    //Student student = new Student("Mary",21, new LocalDate(1997,3,26),1234, new ArrayList<CourseProgramme>(12),new ArrayList<Module>(4));
    Student student = new Student("Mary",21,new LocalDate(1997,3,26),1234,new ArrayList<CourseProgramme>(),new ArrayList<Module>());
    @Test
    public void getUsername() {
        assertEquals("Mary21", student.getUsername());

    }
}