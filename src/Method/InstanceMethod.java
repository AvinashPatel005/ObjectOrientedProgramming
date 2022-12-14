package Method;

public class InstanceMethod {
    public boolean evenOdd(int n){
        return n%2==0;
    }
    public static void main(String[] args) {
        InstanceMethod o1 = new InstanceMethod();
        boolean b = o1.evenOdd(2);
        if(b){
            System.out.println("even");
        }
        else System.out.println("odd");
    }

}
