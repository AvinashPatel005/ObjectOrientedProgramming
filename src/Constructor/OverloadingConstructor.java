package Constructor;

public class OverloadingConstructor {
    int roll;
    int code;
    String name;

    OverloadingConstructor(int r,String n){
        roll = r;
        name = n;
    }

    OverloadingConstructor(int r,int c,String n){
        roll = r;
        code = c;
        name = n;
    }

    void display(){
        System.out.println(roll+" "+code+" "+name);
    }

    public static void main(String[] args) {
        OverloadingConstructor o1 = new OverloadingConstructor(1,"Ravi");
        OverloadingConstructor o2 = new OverloadingConstructor(2,210,"Avi");

        o1.display();
        o2.display();
    }
}
