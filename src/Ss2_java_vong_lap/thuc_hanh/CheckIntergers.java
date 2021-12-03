package Ss2_java_vong_lap.thuc_hanh;

import java.util.Scanner;

public class CheckIntergers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = sc.nextInt();
        if (number < 2){
            System.out.println(number + "is not a prime");
        } else{
            int i = 2;
            boolean check = true;
            while ( i <= Math.sqrt(number)){
                if ( number % 1 == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + "is a prime");
            }else{
                System.out.println(number + "is not a prime");
            }
        }

    }
}
