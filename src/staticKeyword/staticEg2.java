package staticKeyword;

public class staticEg2 {
    static int c=0;
    //due to static c will retain its value.
    staticEg2(){
        c++;
        System.out.println(c);
    }
    public static void main(String[] args) {
        staticEg2 o1 = new staticEg2();
        staticEg2 o2 = new staticEg2();
        staticEg2 o3 = new staticEg2();

    }
}
