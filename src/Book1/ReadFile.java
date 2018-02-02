package Book1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in =new Scanner(new File("C:\\Users\\Kowser\\Desktop\\1.txt"));

        System.out.println(in.nextLine());

    }
}
