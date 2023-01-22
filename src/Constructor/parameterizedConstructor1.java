package Constructor;

public class parameterizedConstructor1 {
    int regNo;
    String name;

    // Creating parameterized constructor with 2 parameters.
    parameterizedConstructor1(int r , String n){
        regNo = r;
        name = n;
    }
    void display(){
        System.out.println(regNo+" "+name);
    }

    public static void main(String[] args) {

        // creating object and passing value.
        parameterizedConstructor1 o1 = new parameterizedConstructor1(1,"Avi");

        o1.display();
    }
}
