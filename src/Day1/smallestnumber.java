import com.sun.xml.internal.xsom.XSComplexType;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class smallestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        //int a = sc.nextInt();
        int a = 5;
        int b = 8;
        int  c = 2;
        int d = 3;
        int smallest = 0;
        if (a < b && a < c && a < d){
            System.out.println("smallest = a");
        }
        if (b<a && b < c && b < d) {
            System.out.println("smallest = b");
        }
        if (c < a && c < b && c < d) {
            System.out.println("smallest = c");
        }
        if (d < a && d < c && d < b){
            System.out.println("smallest = d");
    }


    }
}
