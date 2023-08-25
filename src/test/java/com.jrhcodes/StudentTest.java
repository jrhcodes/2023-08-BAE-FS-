package com.jrhcodes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5})
    public void testUpgradeGradeWhenNotMaxGrade(int testGrade)
    {
        Student student = new Student("Johnny", new Grade(testGrade), Group.A);
        assertTrue(student.upgradeGrade());
        assertEquals(testGrade-1, student.getGrade().getValue());
    };

    @Test
    public void testUpgradeGradeWhenMaxGrade()
    {
        Student student = new Student("Johnny", new Grade(1), Group.A);
        assertFalse(student.upgradeGrade());
        assertEquals(1, student.getGrade().getValue());
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 1})
    public void testDowngradeGradeWhenNotMinGrade(int testGrade)
    {
        Student student = new Student("Johnny", new Grade(testGrade), Group.A);
        assertTrue(student.downgradeGrade());
        assertEquals(testGrade+1, student.getGrade().getValue());
    };

    @Test
    public void testDowngradeGradeWhenMinGrade()
    {
        Student student = new Student("Johnny", new Grade(5), Group.A);
        assertFalse(student.downgradeGrade());
        assertEquals(5, student.getGrade().getValue());
    }

     @Test
     public void testConstructorNullNameException() {
        assertThrowsExactly(  IllegalArgumentException.class,
                () -> new Student(null, new Grade(1), Group.A) );
     }

    @ParameterizedTest @ValueSource(strings = {"", " ", "                "})
    public void testConstructorEmptyNameException(String emptyString) {
        assertThrowsExactly(  IllegalArgumentException.class,
                () -> new Student(emptyString, new Grade(1), Group.A) );
    }

    @Test
    public void testConstructorNullGradeException() {
        assertThrowsExactly(  IllegalArgumentException.class,
                () -> new Student("Freddy", null, Group.A) );
    }


}
