package Constructor;

public class copyConstructor1 {
    int roll;
    String name;

    copyConstructor1(int r,String n){
        roll = r;
        name = n;
    }
    copyConstructor1(copyConstructor1 c){
        roll  = c.roll;
        name = c.name;
    }
    void display(){
        System.out.println(roll+" "+name);
    }

    public static void main(String[] args) {

        copyConstructor1 o1 = new copyConstructor1(1,"Avi");

        // copying the object o1 to object o2
        copyConstructor1 o2 = new copyConstructor1(o1);

        o2.display();

    }
}
