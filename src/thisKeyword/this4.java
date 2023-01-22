package thisKeyword;

public class this4 {
    this4(){
        this(4);                      // calling parameterized constructor from default constructor.
        System.out.println("Hello");
    }
    this4(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        this4 o1 = new this4();
    }
}
