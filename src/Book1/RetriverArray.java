package Book1;

import java.util.Scanner;

public class RetriverArray {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<num.length;i++){
            System.out.println("enter a number");
            num[i]=sc.nextInt();
        }
        for (int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
