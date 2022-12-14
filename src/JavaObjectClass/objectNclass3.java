package JavaObjectClass;
//Initializing object/storing information and accessing through method
//main method in different class
public class objectNclass3 {
    int phoneNo;
    String email;
    void insert(int n , String e){
        phoneNo = n;
        email = e;
    }
    void display(){
        System.out.println(phoneNo+" "+email);
    }
}
class mainClass3{
    public static void main(String[] args) {
        objectNclass3 o1 = new objectNclass3();
        o1.insert(12121,"awin123");
        o1.display();
    }
}
