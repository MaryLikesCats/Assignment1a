import org.joda.time.LocalDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student("Mary",21, new LocalDate(1997,3,26),1234);
    @Test
    public void getUsername() {
        assertEquals("Mary21", student.getUsername());

    }
}