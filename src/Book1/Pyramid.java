package Book1;

public class Pyramid {
    public static void main(String[] args) {
        int level=10;
        for (int i =0;i<level;i++){
            for(int j=0; j<level-i;j++){
                System.out.print(" " );
            }
            for(int n=0; n<=i;n++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}