/*
Write a program to check whether the Strings in the List are empty or not
and print the list having non-empty strings. If the given List
is: Liststrings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
 */


package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmptyorNot {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("abc","","bc","efg","abcd","","jkl");

        List<String> nonEmpty =strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());

        System.out.println(nonEmpty);
    }

}
