package array;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> quizGrades = new ArrayList<>();

        quizGrades.add(90);
        quizGrades.add(70);
        quizGrades.add(80);
        quizGrades.add(50);
        quizGrades.add(60);

        for (int i = 0; i < quizGrades.size(); i++) {
            System.out.println(quizGrades.get(i));
        }

        System.out.println("----------------------");

        for(int j : quizGrades){
            System.out.println(j);
        }
    }
}
