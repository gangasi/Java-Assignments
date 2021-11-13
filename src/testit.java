import java.util.Scanner;

public class testit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int i, j, p, r;
        for (i = 0; i < 10; i++) {
            p = n;
            while (p != 0) {
                r = p % 10;
                if (r == i) {
                    System.out.print(r);
                }
                p = p / 10;
            }
        }

    }
}