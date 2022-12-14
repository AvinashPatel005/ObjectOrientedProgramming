package Method;

public class StaticMethod1 {
    //Static method do not require creating object of class.
    public static void factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        factorial(5);
    }
}
