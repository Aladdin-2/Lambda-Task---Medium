import java.util.List;
import java.util.function.Predicate;

public class ChainingForComplexConditions {
    public static void main(String[] args) {
        List<String> stringList = List.of("Kompyuter", "Telefon", "Planset", "Qulaqciq","Saat");

        Predicate<String> firstPredicate = string -> string.equalsIgnoreCase("Telefon") && string.length() > 5;

        Predicate<String> secondPredicate = string -> string.equalsIgnoreCase("Telefon") || string.length() > 5;


        complexConditions(stringList,firstPredicate);
        System.out.println("=============================");
        complexConditions(stringList,secondPredicate);

    }

    static void complexConditions(List<String> strings, Predicate<String> predicate) {
        strings.stream().filter(predicate).forEach(System.out::println);
    }
}
