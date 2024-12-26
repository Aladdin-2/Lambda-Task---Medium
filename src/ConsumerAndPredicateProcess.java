import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateProcess {
    public static void main(String[] args) {

        List<Integer> integers = List.of(-41, 450, -7, 12, -7, 2, 3);


        Predicate<Integer> predicate = integer -> integer > 0;
        Consumer<Integer> consumer = integer -> {
            Integer multiply = integer * 2;
            System.out.println(multiply);
        };
        checkInteger(integers, predicate, consumer);
    }

    static void checkInteger(List<Integer> integers, Predicate<Integer> predicate, Consumer<Integer> consumer) {
        integers.stream().filter(predicate).forEach(consumer);
    }
}
