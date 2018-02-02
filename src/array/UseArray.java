package array;

import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {
        int[] stId = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < stId.length; i++) {
            System.out.println("Please enter student number::: ");
            int value = sc.nextInt();
            stId[i] = value;
        }
        for (int i = 0; i < stId.length; i++) {
            System.out.println("studen id is : " + stId[i]);
        }
    }
}
