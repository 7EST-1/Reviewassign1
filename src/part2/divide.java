package part2;

import java.util.Scanner;

public class divide {

    public static void main(String[] args) {
        int n1, n2;
        int nb = 0, ns = 0, total = 0, totalm = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter N1");
        n1 = s.nextInt();
        System.out.println("Enter N2");
        n2 = s.nextInt();

        if (n2 > n1) {
            total = n1 / n2;
            totalm = n1 % n2;
        } else if (n1 > n2) {
            total = n1 / n2;
            totalm = n1 % n2;

        }
        System.out.println("Your answer is" + total + "r" + totalm);

    }

}
