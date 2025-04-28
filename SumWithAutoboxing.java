import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumWithAutoboxing {
    public static void main(String[] args) {
        String[] numberStrings = {"10", "20", "30", "40", "50"};

        List<Integer> numbers = Arrays.stream(numberStrings)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of integers: " + sum);
    }
}
