import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Integer> print= x-> System.out.println(x);
        print.accept(1);

        List<Integer> list= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Consumer<List<Integer>> printList=x-> System.out.println(x);
//        for(Integer i:list){
//            System.out.println(i);
//        }
//        printList.accept(list);

        list.forEach(x-> System.out.print(x));
    }
}
