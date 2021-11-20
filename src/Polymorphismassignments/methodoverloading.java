package OOPSAssignments;

import java.util.Scanner;
//methodOverloading concept
public class MethodOverLoading {
    public static void main(String[] args) {

        //Largest of 2 numbers
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        float res1=largestNumbers(a,b);
        System.out.println("Largest number is:" +res1);

        //Largest of three numbers
        System.out.println("Enter Third number:");
        float c = sc.nextFloat();
        float res2=largestNumbers(a,b,c);
        System.out.println("Largest number is:" +res2);
}
    static int largestNumbers(int a,int b){
        if(a>=b)
           return a;
        else
            return b;
    }
    static float largestNumbers(int a,int b,float c){
        if(a>b && a>c)
            return a;
        if(b>a && b>c)
            return b;
        else
            return c;
    }
}
