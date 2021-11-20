package OOPSAssignments;
public class AddingNumbers {

    static int addition(int num1, int num2){
        int res = num1 + num2 ;
        return(res);
    }

    static String addition(String str1, String str2){
        String res = str1 + str2;
        return(res);
    }
}
class MethodOverridingMain extends AddingNumbers {
    public static void main(String[] args) {
        System.out.println(AddingNumbers.addition(6, 5));
        System.out.println(AddingNumbers.addition("Thoughtworks", "Vapasi"));
    }
}
