public class LambdaFunc {
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            System.out.println("hello");
        });
        MathOperations add=(a,b)->a+b;
        System.out.println(add.operate(1,3));
//        Thread t1=new Thread(MathOperations add=(a,b)->a+b);
    }
}

interface MathOperations{
     int operate(int a, int b);
}
