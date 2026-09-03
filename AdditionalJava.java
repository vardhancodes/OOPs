import java.util.*;
import java.util.stream.Stream;

//STREAM API
public class AdditionalJava {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,4,6,8,2,3);

        Stream<Integer> newStream = nums.stream();
        newStream.forEach((Integer n) -> System.out.println(n));

        Stream<Integer> sortedStream = nums.stream().sorted();
        sortedStream.forEach((Integer n) -> System.out.println(n));


    }
}
