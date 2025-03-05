package src.CollectionJava;

import java.util.Scanner;

public class UserInputP {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter First Name");
        String a = scn.next();

        System.out.print("Enter Last Name");
        String b = scn.next();

        System.out.println("Sum is: " + (a+b));
        scn.close();

    }
}
