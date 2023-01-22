package staticKeyword;

public class staticEg1 {
    int c=0;

    staticEg1(){
        c++;
        System.out.println(c);
    }
    public static void main(String[] args) {
        staticEg1 o1 = new staticEg1();
        staticEg1 o2 = new staticEg1();
        staticEg1 o3 = new staticEg1();

    }
}
