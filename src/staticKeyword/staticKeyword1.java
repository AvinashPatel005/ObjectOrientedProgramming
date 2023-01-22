package staticKeyword;
//static variable

public class staticKeyword1 {
    int roll;
    String name;
   static String college = "ITER"; // this can be written as String college = "ITER" but will consume more memory.
    // because of static keyword , college will get memory only once.
    staticKeyword1(int r,String n){
        roll = r;
        name = n;
    }
    void display(){
        System.out.println(roll+" "+name+" "+college);
    }

    public static void main(String[] args) {
        staticKeyword1 o1 = new staticKeyword1(1,"Avi");
        staticKeyword1 o2 = new staticKeyword1(2,"Reema");

        o1.display();
        o2.display();
    }
}
