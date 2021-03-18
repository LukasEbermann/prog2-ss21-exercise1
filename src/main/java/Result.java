import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> modification = new ArrayList<>();

        if (grades.get(0) > 60 || grades.get(0) < 1) {
            System.out.println("Grade out of Range");
            return new ArrayList<>();
        }


        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) > 30) {
                if ((grades.get(i) + 1) % 5 == 0) {
                    modification.add(grades.get(i) + 1);

                } else if ((grades.get(i) + 2) % 5 == 0) {
                    modification.add(grades.get(i) + 2);

                } else {
                    modification.add((grades.get(i)));

                }
            } else {
                modification.add((grades.get(i)));
            }
        }
        return modification;
    }


    public static void main(String[] args) {

    }
}