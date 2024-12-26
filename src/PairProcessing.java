import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class PairProcessing {
    public static void main(String[] args) {

        Map<Integer, String> keysAndValues = new HashMap<>();
        keysAndValues.put(1, "Aladdin");
        keysAndValues.put(2, "Togrul");
        keysAndValues.put(3, "Yusif");
        keysAndValues.put(4, "Tofiq");

        BiConsumer<Integer, String> biConsumer = (key, value) -> System.out.println("Your ID: " + key + ", Name: " + value);

        pairProcessing(keysAndValues, biConsumer);

    }

    static void pairProcessing(Map<Integer, String> keys, BiConsumer<Integer, String> biConsumer) {
        keys.forEach(biConsumer);
    }
}
