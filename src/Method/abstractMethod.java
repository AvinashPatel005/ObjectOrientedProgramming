package Method;
//Method with no Body. It is always created in Abstract class.
abstract class demo{
    //abstract method declared.
    abstract void helloWorld();
}
//extending main class with Abstract class.
public class abstractMethod extends demo {
    //implementing abstract method.
    void helloWorld(){
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        //creating object of abstract class.
        demo o1 = new abstractMethod();
        o1.helloWorld();
    }
}
