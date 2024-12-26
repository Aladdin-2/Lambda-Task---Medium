package task3;

import javax.xml.crypto.dsig.Transform;
import java.util.List;

public class ForTransformation {
    public static void main(String[] args) {
        List<String> strings = List.of("Aladdin", "Asif", "Toğrul");

        Transformation<List<String>, List<String>> toUpperCase = stringList -> stringList
                .stream()
                .map(str -> str.toUpperCase())
                .toList();


        Transformation<List<String>, List<String>> toLowerCase = stringList -> stringList
                .stream()
                .map(str -> str.toLowerCase())
                .toList();


        Transformation<List<String>, List<String>> reverseString = stringsList -> stringsList
                .stream()
                .map(str -> new StringBuilder(str)
                        .reverse().toString())
                .toList();


        Transformation<List<String>, List<String>> addingSuffix = stringList -> stringList
                .stream()
                .map(str -> new String("Hello - ") + str)
                .toList();


        System.out.println("Original Strings: " + strings);
        System.out.println("Uppercase: " + toUpperCase.transformer(strings));
        System.out.println("Lowercase: " + toLowerCase.transformer(strings));
        System.out.println("Reversed: " + reverseString.transformer(strings));
        System.out.println("With Suffix: " + addingSuffix.transformer(strings));

    }



}
