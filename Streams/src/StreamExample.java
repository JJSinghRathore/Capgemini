import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
//        1. filtering and collecting names
        List<String> names= Arrays.asList("Anna","Bob","Charlie","David");
//        names.stream().filter(s->s.length()>3).forEach(System.out::println);
        System.out.println(names.stream().filter(s->s.length()>3).toList());

//        2. squaring and sorting names
        List<Integer> numbers=Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().sorted().map(x->x*x).toList());

//        3. summing values
        List<Integer> integers=Arrays.asList(1,2,3,4,5);
        System.out.println(integers.stream().reduce(0,(a,b)->a+b));
    }
}
