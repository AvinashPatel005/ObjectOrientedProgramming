package Constructor;

public class defaultConstructor2 {

    int roll;
    String name;

    void display(){
        System.out.println(roll+" "+name);
    }
    public static void main(String[] args) {

        defaultConstructor2 o1 = new defaultConstructor2();
        o1.display();

    }
}
