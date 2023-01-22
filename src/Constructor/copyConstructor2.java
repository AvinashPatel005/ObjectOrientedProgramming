package Constructor;

public class copyConstructor2 {
    int roll;
    String name;

    copyConstructor2(int r,String n){
        roll = r;
        name = n;
    }
    copyConstructor2(){

    }
    void display(){
        System.out.println(roll+" "+name);
    }

    public static void main(String[] args) {

        copyConstructor2 o1 = new copyConstructor2(1,"Avi");
        copyConstructor2 o2 = new copyConstructor2();
        // copying the object o1 to object o2
        o2.name = o1.name;
        o2.roll = o1.roll;

        o2.display();
    }
}
