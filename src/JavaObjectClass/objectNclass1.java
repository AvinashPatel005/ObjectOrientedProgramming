package JavaObjectClass;
//main method in same class
public class objectNclass1 {
    //defining fields
    int rollNo;
    String name;
    String address;


    public static void main(String[] args) {
        //creating object of the objectNclass class
        objectNclass1 o1 = new objectNclass1();

        //Initializing object/storing information into objects through reference
        o1.rollNo = 1;
        o1.name = "Avinash";
        o1.address ="Patna";

        //accessing object through reference variable
        System.out.println(o1.rollNo);
        System.out.println(o1.name);
        System.out.println(o1.address);
    }
}
