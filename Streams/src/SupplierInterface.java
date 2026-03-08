import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<String> s=()-> "hello";
        System.out.println(s.get());

        Supplier<Double> random=()->Math.random();
        System.out.println(random.get());

        Supplier<Long> time=()->System.currentTimeMillis();
        System.out.println(time.get());

    }
}
