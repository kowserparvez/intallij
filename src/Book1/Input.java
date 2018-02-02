package Book1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name=in.nextLine();
        System.out.println("how old are you ?");
        int age=in.nextInt();
        System.out.println("Hello, i am "+name+" and i will be "+(age+1)+" next year");


    }
}
