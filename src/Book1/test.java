package Book1;

public class test {
    public static void main(String[] args) {
        int[] myArray = {17,25,34,37,41};
        for(int i =0;i<myArray.length;i++){
            for (int j = 2;j<=myArray[i];j++){
                if(myArray[i]%j!=0){
                    System.out.println(myArray[i]);
                }
                    break;

            }

        }
    }
}
