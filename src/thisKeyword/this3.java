package thisKeyword;
//to invoke current class constructor
public class this3 {

    this3(){
        System.out.println("Hello");
    }
    this3(int x){
        this();                   // calling default constructor from parameterized constructor.
        System.out.println(x);
    }
    public static void main(String[] args) {
        this3 o1 = new this3();
        this3 o2 = new this3(4);
    }
}
