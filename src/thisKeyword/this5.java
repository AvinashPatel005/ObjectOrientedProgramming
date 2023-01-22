package thisKeyword;

public class this5 {
    void m(this5 obj){

        System.out.println("Hello method m");
    }
    void n(int n){
        m(this);
    }

    public static void main(String[] args) {
        this5 o1 = new this5();
        o1.n(5);
    }
}
