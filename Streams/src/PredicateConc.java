import java.util.function.Predicate;
public class PredicateConc {
    public static void main(String[] args) {
        //predicate interface
        Predicate<Integer> isEven = x-> x%2 == 0;
        System.out.println(isEven.test(5));

        Predicate<String> sLen=x->x.length()>5;
        System.out.println( sLen.test("Pragya"));

        Predicate<Integer> p1=x->x>5;
        Predicate<Integer> p2=x->x%2==0;
        System.out.println(p1.and(p2).test(10));

        Predicate<String> isStrEndsWith= x->x.endsWith("a");
        Predicate<String> isStrStartsWith=x->x.startsWith("P");
        System.out.println(isStrEndsWith.or(isStrStartsWith).test("Pragya"));
    }
}
