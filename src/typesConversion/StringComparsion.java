package typesConversion;

import java.util.Scanner;

public class StringComparsion {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a String:  ");
        String name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter another String: ");
        String name2 = scanner1.nextLine();

        System.out.println("Both entries are the same: " + name.equals(name2));
        System.out.println();
    }
}
