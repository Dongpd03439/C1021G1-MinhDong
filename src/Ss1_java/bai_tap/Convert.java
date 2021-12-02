package Ss1_java.bai_tap;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of money: ");
        float USD = scanner.nextFloat();
        float VND = USD / 23;
        System.out.println("the amount to be exchanged is: " + VND);
    }
}
