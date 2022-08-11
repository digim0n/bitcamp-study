package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSample1 {
    public static void main(String[] args) {
        var data = List.of("apple", "orange", "watermelon");
        var result = data.stream()
                .filter(s -> s.length() >= 6)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(result);

        var newList = data.stream().filter(a -> a.contains("p")).collect(Collectors.toList());
        System.out.println(newList);
    }
}
