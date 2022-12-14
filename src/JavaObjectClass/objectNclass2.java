package JavaObjectClass;
// main method in different class
public class objectNclass2 {
    int rollNo;
    String name;
}
class mainClass2{
    public static void main(String[] args) {
        objectNclass2 o1 = new objectNclass2();

        System.out.println(o1.rollNo);
        System.out.println(o1.name);
    }
}
