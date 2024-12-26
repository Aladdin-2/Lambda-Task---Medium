import java.util.List;
import java.util.function.Predicate;

public class CombinePredicateForComplexValidation {
    public static void main(String[] args) {
        List<String> strings = List.of("New","year","Happy");
        Predicate<String> checkStart = str -> str.startsWith("N");
        Predicate<String> checkEnd = str -> str.endsWith("w");

        checkPredicateMethod(strings, checkStart, checkStart);

    }

    public static void checkPredicateMethod(List<String> strings, Predicate<String> checkStart, Predicate<String> checkEnd) {
        strings.stream().filter(str -> checkStart.and(checkEnd).test(str)).forEach(System.out::println);
    }
}
