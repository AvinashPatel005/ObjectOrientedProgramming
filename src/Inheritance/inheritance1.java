package Inheritance;

class hello{

}
public class inheritance1 extends hello{
    public static void main(String[] args) {
        int a=1,b=2;
        System.out.println("a\tb\tpow(a,b)");

        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
        System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a++,b++));
    }
    }
