package Ss6_java_inheritance.bai_tap.bai3;

import java.util.Arrays;
import java.util.Scanner;

public class TestMoveablePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập x ");
        float x = Float.parseFloat(sc.nextLine());
        System.out.println("nhập y ");
        float y = Float.parseFloat(sc.nextLine());
        System.out.println("nhập xSpeed ");
        float xSpeed = Float.parseFloat(sc.nextLine());
        System.out.println("nhập ySpeed ");
        float ySpeed = Float.parseFloat(sc.nextLine());

        MoveablePoint move = new MoveablePoint(x , y , xSpeed, ySpeed);
        move.getX();
        move.getY();
        move.getxSpeed();
        move.getySpeed();

        System.out.println("Mảng Arr = " + Arrays.toString(move.getSpeed()));
        System.out.println( move.toString());
        System.out.println( move.move());

    }
}
