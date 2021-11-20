import java.util.Scanner;

public class methodoverloading {
    public static void main(String[] args) {

        //Adding 2 numbers
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        float sum=addNumbers(a,b);
        System.out.println("Sum is:" +sum);

        //Adding third number
        System.out.println("Enter Third number:");
        float c = sc.nextFloat();
         sum=addNumbers(a,b,c);
        System.out.println("Sum is:" +sum);

    }



    static int addNumbers(int a,int b){
        int sum=a+b;
        return sum;
    }
    static float addNumbers(int a,int b,float c){
        float sum=a+b+c;
        return sum;
    }
}
