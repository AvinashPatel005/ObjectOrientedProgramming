package thisKeyword;

public class this1 {
    int roll;
    String name;

    // this is used refer to current class instance ,when field and parameter variable are same.
    this1(int roll,String name){
        this.roll = roll;
        this.name = name;
    }

    public static void main(String[] args) {
        this1 o1 = new this1(1,"Avi");

        System.out.println(o1.name);
    }
}
