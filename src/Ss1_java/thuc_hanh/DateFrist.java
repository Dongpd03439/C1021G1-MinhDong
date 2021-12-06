package Ss1_java.thuc_hanh;

import java.util.Scanner;

public class DateFrist {
    public static void main(String[] args){
        Scanner sc = new Scanner("System.in");
        int year;

        System.out.println("Enter a year: ");
        year = sc.nextInt();
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;

                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            }else{
                isLeapYear = true;
            }

        }
        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d ís Not a leap year", year);
        }

}
}