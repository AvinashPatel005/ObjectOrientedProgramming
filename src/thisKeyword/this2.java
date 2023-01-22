package thisKeyword;
// to invoke current class method
public class this2 {

    void hi() {
        System.out.println("hi");
    }

    void hello() {
        this.hi();
    }
    public static void main(String[] args) {

        this2 o1 = new this2();

        o1.hello();
    }
}