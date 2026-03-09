public class Main {
    static void main(String[] args) {
        ICalculator obj=new FactoryMethod()::createObject;
        Student s=obj.createStudent("Pragya", 78);
        System.out.println("Name= "+s.getName());
        System.out.println("Marks= "+s.getMarks());

    }
}
