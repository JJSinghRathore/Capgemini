public class FactoryMethod {
    //method that creating the obj of class
    public Student createObject(String name, int marks) {
        Student s=new Student();
        s.setName(name);
        s.setMarks(marks);
        return s;

    }
}
