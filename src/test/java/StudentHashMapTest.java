import collections1.Student;
import collections1.StudentHashMap;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StudentHashMapTest {

    @Test
    public void testGetStudentByName() {
        StudentHashMap studentHashMap = new StudentHashMap();

        // Test retrieval of existing student
        String existingFirstName = "Alice";
        Student existingStudent = studentHashMap.getStudentByName(existingFirstName);
        assertNotNull(existingStudent);
        assertEquals(existingFirstName, existingStudent.firstName);

        // Test retrieval of non-existing student
        String nonExistingFirstName = "Unknown";
        Student nonExistingStudent = studentHashMap.getStudentByName(nonExistingFirstName);
        assertEquals(null, nonExistingStudent);
    }
}

