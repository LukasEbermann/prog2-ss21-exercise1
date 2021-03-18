import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testcases {

    @BeforeAll
    static void init() {
        System.out.println();

    }

    @BeforeEach
    void SetUp() {

    }
    @DisplayName("#1 basic")
    @Test
    void testGrad_basic() {
        List<Integer> grades = Arrays.asList(4, 73, 67, 38, 33);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = Arrays.asList(75, 67, 40, 33);

        assertEquals(expected, actual);


    }

    @DisplayName("#2Size of First Parameter Too High")
    @Test
    void testGradingStudents_sizeOfFirstParameterTooHigh() {
        List<Integer> grades = Arrays.asList(65, 73, 67, 38, 33);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = new ArrayList<>();


        assertEquals(expected, actual);

    }
    @DisplayName("#3Size of First Parameter Too Low")
    @Test
    void testGradingStudents_sizeOfFirstParameterTooLow() {
        List<Integer> grades = Arrays.asList(-2, 73, 67, 38, 33);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = new ArrayList<>();


        assertEquals(expected, actual);

    }
    @DisplayName("#4Size of Grade Too Low")
    @Test
    void testGradingStudents_sizeOfGradeTooLow() {
        List<Integer> grades = Arrays.asList(65, -2, 67, 38, 33);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = Arrays.asList(null, 67, 40, 33);


        assertEquals(expected, actual);

    }
}
