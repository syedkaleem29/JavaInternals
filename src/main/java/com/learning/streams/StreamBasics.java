package com.learning.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamBasics {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(100);
        l.add(5);

        List<Integer> l1 = l.stream().sorted(Comparator.reverseOrder()).limit(1).toList();
        System.out.println(l1.get(0));

        int i = l.stream().mapToInt(x -> x).max().getAsInt();
        System.out.println(i);

        List<String> sl = Arrays.asList("Kaleem", "Syed", "Heena");
        String main = sl.stream().sorted(Comparator.reverseOrder()).limit(1).toList().get(0);
        System.out.println(main);

        List<String> names = Arrays.asList("Syed Kaleem", "Heena Shanawaaz", "Syed Hamed");
        List<String> sortedName = names.stream().map(s -> {
            String[] ar = s.split(" ");
            return ar[0] + " " + ar[1].charAt(0);
        })
                .sorted(Comparator.comparing(s -> s.split(" ")[1].charAt(0)))
                .toList();

        sortedName.stream().forEach(System.out::println);

        List<String> names1 = Arrays.asList("Syed Kaleem", "Heena Shanawaaz", "Syed Hamed");
        List<String> codes = names1.stream().flatMap(s -> Arrays.stream(s.split(" "))).map(s -> "" + s.charAt(0) + s.charAt(1)).sorted().toList();
        System.out.println(codes);

        List<String> names2 = Arrays.asList("Syed Kaleem", "Heena Shanawaaz", "Syed Hamed");
        List<String> codes2 = names2.stream().map(s -> s.split(" ")).map(s -> "" + s[0].charAt(0) + s[1].charAt(0)).sorted().toList();
        System.out.println(codes2);

        List<Integer> ints = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> ans = ints.stream().collect(Collectors.groupingBy(n -> n%2 ==0));
        System.out.println(ans.get(Boolean.FALSE));
        System.out.println(ans.get(Boolean.TRUE));

        int ans2 = ints.stream().map(x -> x * 10).mapToInt(x -> x).sum();
        System.out.println(ans2);

        int ans3 = ints.stream().reduce(0, (a, b) -> a + b);
        System.out.println(ans3);
    }
}
