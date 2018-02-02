package array;

import java.util.Arrays;
import java.util.Scanner;

public class LottoArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println( "How many number u need for lotto:");
        int k = in.nextInt();
        System.out.println("Max number can be picked:");
        int n=in.nextInt();

        // fill an array with numbers 1 2 3 . . . n
        int[] num=new int[n];
        for (int i =0;i< num.length;i++)
            num[i]=i+1;
        // draw k numbers and put them into a second array
        int[] result=new int[k];
        for (int i=0;i< result.length;i++){

            // make a random index between 0 and n - 1
            int r = (int) (Math.random()*n);
            // pick the element at the random location
            result[i]=num[r];
            // move the last element into the random location
            num[r]=num[n-1];
            n--;
        }
        // print the sorted array
        Arrays.sort(result);
        System.out.println("Here is your lucky number: ");
        for (int r : result)
            System.out.println(r);


    }
}
