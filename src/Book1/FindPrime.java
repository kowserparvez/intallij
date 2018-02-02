package Book1;

public class FindPrime {
    public static void main(String[] args) {

        for (int i=2;i<50;i++){
            if(isPrime(i)){
                System.out.println(i+ " is Prime");
            }else{
                System.out.println(i+ " is not Prime");
            }
        }
    }

    public static boolean isPrime(int n){
        if (n%2==0)return false;
        for (int i=3;i*i<=n;i+=2){
            if (n%i==0)return false;
        }

        return true;
    }
}