package Method;

public class StaticMethod2 {
    public static void main(String[] args) {
        evenOdd(10);
    }

    public static void evenOdd(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else System.out.println("odd");
    }
}
