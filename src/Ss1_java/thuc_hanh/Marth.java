package Ss1_java.thuc_hanh;

import java.util.Scanner;

public class Marth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c ;
                System.out.println("a :");
        a = sc.nextDouble();
                System.out.println("b :");
        b = sc.nextDouble();
                System.out.println("c :");
        c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f! \n", answer);
        }else {
            if(b == 0){
                System.out.print("The sulotion is al x!");
            }else {
                System.out.println("No sulotion");
            }
        }
    }
}
