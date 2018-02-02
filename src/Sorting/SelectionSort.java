package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {8,5,9,3,0,6,4,2,1};
        for ( int j = 0; j<array.length;j++){
            for(int i = j+1; i<array.length; i++){
                if (array[i]<array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;

                }
            }
        }
        for (int n = 0; n<array.length;n++){
            System.out.println(array[n]);
        }
    }
}
