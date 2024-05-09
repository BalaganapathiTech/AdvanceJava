
/*
Write a program using map() method to convert a list of Strings into uppercase.
If the given List is: Stream names = Stream.of("abc", "d", "ef");
 */

package question1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class convertUppercase{
    public static void main(String[] args) {
        Stream<String> names=Stream.of("aBc","d","ef");

       List<String> upperCase=names.map(String::toUpperCase).collect(Collectors.toList());
       System.out.print(upperCase);
    }

}
