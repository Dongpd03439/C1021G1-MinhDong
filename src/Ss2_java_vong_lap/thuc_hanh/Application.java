package Ss2_java_vong_lap.thuc_hanh;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("Enter inversment amount");
        money = input.nextDouble();
        System.out.println("Enter number of months:");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interestRate = input.nextDouble();

        double totalIntergest = 0;
        for(int i = 0; i < month; i++){
            totalIntergest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of" + totalIntergest);
    }
}
