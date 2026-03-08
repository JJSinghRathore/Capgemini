import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> sqr=x->x*x;
        System.out.println(sqr.apply(2));
    }
}
