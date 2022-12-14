package JavaObjectClass;
//Initializing object/storing information and accessing through method
//main method in same class
public class objectNclass4 {
    int phone;
    String name;

    void insertRec(int p , String s){
        phone = p;
        name = s;
    }
    void display(){
        System.out.println(phone+" "+name);
    }

    public static void main(String[] args) {
        objectNclass4 o1 = new objectNclass4();
        o1.insertRec(123,"Avi");
        o1.display();
    }
}
