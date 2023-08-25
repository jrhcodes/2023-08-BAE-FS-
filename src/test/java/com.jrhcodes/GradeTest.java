package com.jrhcodes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5})
    void testIsMaxGradeShouldReturnFalseIfNot1(int testGrade) {
        Grade grade = new Grade(testGrade);
        assertFalse(grade.isMaxGrade());
    }

    ;

    @Test
    void testIsMaxGradeShouldReturnTrueIf1() {
        Grade grade = new Grade(1);
        assertTrue(grade.isMaxGrade());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testIsMinGradeShouldReturnFalseIfNot5(int testGrade) {
        Grade grade = new Grade(testGrade);
        assertFalse(grade.isMinGrade());
    }

    ;

    @Test
    void testIsMinGradeShouldReturnTrueIf5() {
        Grade grade = new Grade(5);
        assertTrue(grade.isMinGrade());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testGetValueReturnsValueSentToConstructor(int testGrade) {
        Grade grade = new Grade(testGrade);
        assertEquals(testGrade, grade.getValue());
    }

    ;

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    void testDecreaseLowersGrade(int testGrade) {
        Grade grade = new Grade(testGrade);
        assertTrue(grade.decrease());
        assertEquals(testGrade + 1, grade.getValue());
    }

    ;

    @Test
    void testDecreaseBottomGrade() {
        Grade grade = new Grade(5);
        assertFalse(grade.decrease());
        assertEquals(5, grade.getValue());
    }

    ;

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 4, 5})
    void testIncrease(int testGrade) {
        Grade grade = new Grade(testGrade);
        assertTrue(grade.increase(), "True not returned");
        assertEquals(testGrade - 1, grade.getValue());
    }

    ;

    @Test
    void testIncreaseTopGrade() {
        Grade grade = new Grade(1);
        assertFalse(grade.increase());
        assertEquals(1, grade.getValue());
    }

    ;

}
