package Book1;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count=10;
       System.out.print(n1+" "+n2);//printing 0 and 1

        //loop starts from 2 because 0 and 1 are already printed
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

        System.out.println("***********************************");
        System.out.println("***********************************");
        System.out.println("***********************************");

        int prev=0;
        int next=1;
        int counter =10;
        for (int n=0;n<counter; n++){
            System.out.println(prev);
            prev=prev+next;
            next=prev-next;
        }
    }
}
