package Method;

public class StaticMethod3 {
    public static void main(String[] args) {
        boolean b = evenOdd(5);
        if(b){
            System.out.println("even");
        }
        else System.out.println("odd");
    }

    public static boolean evenOdd(int n){
        return n%2==0;
    }
}
