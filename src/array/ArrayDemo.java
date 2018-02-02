package array;

public class ArrayDemo {
    public static void main(String[] args) {
        int []num = new int[5];
        //for (int i =0;i<num.length;i++){

        //}
        num[0]=89;
        num[1]=94;
        num[2]=73;
        num[3]=64;
        num[4]=59;
        //findAvg(num);

        System.out.println(findLetterGrade(findAvg(num)));

        String [] names = { "Jon","Bob","Tom","Larry", "Sarah"};
        System.out.println(names[4]);
    }
    public static double findAvg(int []greades){
        double result = 0;
        int count = greades.length;
        int sum =0;
    // adding quiz grades
    for(int i = 0; i<count;i++){
        sum+=greades[i];
    }
    // divides quiz grades by count to get avg
    result=sum/count;
        System.out.println(result);
        return result;
}
    public static char findLetterGrade(double score){
        if (score>=90){

            return 'A';
        }else if(score>=80){
            return 'B';
        }else if (score>=70){
            return 'C';
        }else if (score>=60){
            return 'D';
        }else {
            return 'F';
        }

    }
}

