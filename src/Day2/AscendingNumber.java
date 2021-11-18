package Day2;

import java.util.Scanner;

public class AscendingNumber {
    public static void main(String[] args) {
        int i, tempnumber, remainder;

        Scanner sc = new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        for (i=0; i < 10; i++) {
            tempnumber = number;
            while (tempnumber != 0) {
                remainder = tempnumber % 10;
                if (remainder == i) {
                   System.out.print(remainder);
                }
                tempnumber = tempnumber / 10;
            }
        }
        System.out.println();
    }

}