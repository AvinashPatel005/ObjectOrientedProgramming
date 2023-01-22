package staticKeyword;
//static method
public class staticKeyword2 {

    static void cube(int n){
        int cub = n*n*n;
        System.out.println(cub);
    }

    public static void main(String[] args) {
        cube(2);
    }
}
