import java.util.HashMap;
import java.util.Map;

public class SumOfArraySingles {
    public static int repeats(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : arr)
            count.put(n, count.getOrDefault(n, 0) + 1);

        int sum = 0;
        for (Map.Entry<Integer, Integer> e : count.entrySet())
            if (e.getValue() == 1)
                sum += e.getKey();

        return sum;
    }
}
