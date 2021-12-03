package Ss2_java_vong_lap.bai_tap;

import java.util.Scanner;

public class ShowIntergers {
    public static boolean prime(int n) {
        if (n < 2) {
            return false;
        }
        for ( int i =2 ; i < n; i++){
            if( n % 1 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số nguyên tố:");
        int count = 0;
        int n = 2;
        int number = sc.nextInt();

        while (count < number) {
            if (prime(n)) {
                System.out.println(n);
                count++;

            }
            n++;
        }
    }
}
