package Ss2_java_vong_lap.thuc_hanh;

import java.util.Scanner;

public class Bignumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();

        a = Math.abs(a); // abs() để trả về giá trị tuyệt đối(Phần dương)
        b = Math.abs(b);

        if(a == 0 || b == 0){
            System.out.println("No greatest common factor: ");
      }
        while ( a != b ){
            if ( a > b){
                a = a -b;
            }else{
                b = b -a;
            }
        }
        System.out.println("Great common factor: " + a);
    }
}
