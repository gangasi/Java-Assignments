import java.util.Scanner;

public class loweruppercase {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character  ");
        ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("\n" + ch +
                    " is an UpperCase character");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("\n" + ch +
                    " is an LowerCase character");
        } else {

            System.out.println(ch + " is not an alphabet.");
        }
    }
}

