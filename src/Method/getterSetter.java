package Method;
//Type of Instance method.
//private fields cannot be accessed from another class
//Getter and Setters are used to access private fields.
public class getterSetter {
    private int roll;
    private String name;

    //getter or Accessor Method
    public int getRoll(){
        return roll;
    }
    //setter or mutator Method.
    public void setRoll(int roll){
        this.roll = roll;
    }

    public String getName(){
        return name;
    }
    //setter or mutator Method.
    public void setName(String name){
        this.name = name;
    }
}
class mainClass{
    public static void main(String[] args) {
        getterSetter o1 = new getterSetter();
        o1.setRoll(3);
        o1.setName("Avi");
        System.out.println(o1.getRoll()+" "+o1.getName());
    }
}
