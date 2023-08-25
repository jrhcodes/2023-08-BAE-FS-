package com.jrhcodes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class StudentTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5})
    void testUpgradeGradeWhenNotMaxGrade(int testGrade)
    {
        Student student = new Student("Johnny", new Grade(testGrade), Group.A);
        assertTrue(student.upgradeGrade());
        assertEquals(testGrade-1, student.getGrade().getValue());
    };

    @Test
    void testUpgradeGradeWhenMaxGrade()
    {
        Student student = new Student("Johnny", new Grade(1), Group.A);
        assertFalse(student.upgradeGrade());
        assertEquals(1, student.getGrade().getValue());
    }


}
