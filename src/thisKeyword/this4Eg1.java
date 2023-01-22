package thisKeyword;

public class this4Eg1 {
    int roll;
    String name;
    String sex;

    this4Eg1(int roll , String name){
        this.name = name;
        this.roll = roll;
    }
    this4Eg1(int roll , String name , String sex){
        this(roll , name);            // calling constructor with 2 parameter.
        this.sex = sex;
    }

    void display(){
        System.out.println(roll+" "+name+" "+sex);
    }

    public static void main(String[] args) {

        this4Eg1 o2 = new this4Eg1(2,"Ankit","male");
        o2.display();
    }
}
