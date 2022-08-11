package stream;

import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        var strs = List.of("apple", "banana", "orange", "pineapple");

        var upper = strs.stream().filter(s -> s.length() >= 6).map(s -> s.toUpperCase()).toList();
        System.out.println(upper);

        var count = strs.stream().filter(s -> s.length() >= 6).count();
        System.out.println(count);

        var hasA = strs.stream().allMatch(s -> s.contains("a"));
        System.out.println(hasA);

        System.out.println(strs.stream().filter(s -> s.contains("c")).count());
    }
}
