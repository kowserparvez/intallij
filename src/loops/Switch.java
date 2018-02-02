package loops;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any one option 1-4: ");
        int pick =in.nextInt();
        switch (pick){
            case 1:
                System.out.println("Pats will win.");
                break;

            case 2:
                System.out.println("Jags will win.");
                break;

            case 3:
                System.out.println("Vikings will win.");
                break;

            case 4:
                System.out.println("Philly will win.");
                break;

            default:
                System.out.println("Invalid input");
                break;

                }

    }
}
