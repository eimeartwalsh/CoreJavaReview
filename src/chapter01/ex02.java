package chapter01;

/* Write a program that reads an integer angle (which may be positive or negative) and normalizes it to a value between
   0 and 359 degrees. Try it first with the % operator, then with floorMod.
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int angle = in.nextInt();

        int normalAngle = (angle % 360 + 360) % 360;
        System.out.println(normalAngle);

        int normalAngle2 = Math.floorMod(angle, 360);
        System.out.println(normalAngle2);
    }
}
