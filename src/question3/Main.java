
/*
You are a teacher in school In your class there are 10 students, you have decided to
give special gifts to those students whose names start with "A".
you are asked to separate those students with the help of a java program.

Requirement:

-Use List interface to store the student name
-Use a lambda expression and the Stream API to filter the students
 */
package question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> studentname= Arrays.asList("Azar","Anbu","Balaji","Chandra","Shalini","Aravind","Annakamu","Ramya");

        List<String> stdentWithA=studentname.stream().filter(name-> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(stdentWithA);
    }
}
