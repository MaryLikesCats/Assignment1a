import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student("Ray",20, 1997, 1234);
    @Test
    public void getUsername() {
        assertEquals("Ray20", student.getUsername());

    }
}