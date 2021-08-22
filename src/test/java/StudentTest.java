import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student jubilee;

    @Before
    public void setUp(){
        jubilee = new Student("Jubilee", 123456);
    }

    @Test
    public void testGetName(){
        assertEquals("Jubilee", jubilee.getName());
    }

    @Test
    public void testGetId(){
        assertEquals(123456, jubilee.getId());
    }

    @Test
    public void testAddGrade(){
        jubilee.addGrade(100);
        jubilee.addGrade(95);
        assertTrue(100 == jubilee.getGrades().get(0));
        assertTrue(95 == jubilee.getGrades().get(1));
    }

    @Test
    public void testGetGradeAverage(){
        jubilee.addGrade(100);
        jubilee.addGrade(96);
        assertEquals(98, jubilee.getGradeAverage(),.1);
    }
}
