package lesson18.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        getSolutionTaskOne();
    }

     public static void getSolutionTaskOne()
     {
         List<Integer> list = new ArrayList<Integer>();
         list.add(10);
         list.add(11);
         list.add(12);
         list.add(13);
         list.add(14);
         list.add(15);
         list.add(16);
         list.add(16);

         List<Integer> dist = list.stream().distinct().collect(Collectors.toList());
         System.out.println(dist);
         List<Integer> even = dist.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
         System.out.println(even);
         int sum = even.stream().mapToInt(i -> i).sum();
         System.out.println(sum);
     }
}

