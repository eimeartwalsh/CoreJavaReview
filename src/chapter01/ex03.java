package chapter01;

/*Using only the conditional operator, write a program that reads three integers and prints the largest.
  Repeat with Math.max.
 */
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int int1, int2, int3;
        System.out.println("Enter three integers: \n");
        System.out.println("First integer:");
        int1 = in.nextInt();
        System.out.println("Second integer:");
        int2 = in.nextInt();
        System.out.println("Third integer:");
        int3 = in.nextInt();

        int maxTemp = Math.max(int1, int2);
        int maxNum = Math.max(maxTemp, int3);
        System.out.println("Largest number is " + maxNum);
    }
}
