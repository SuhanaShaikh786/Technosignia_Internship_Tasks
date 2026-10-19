import java.util.*;
class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n=sc.nextInt();

        boolean isPrime= n>=2;
        for(int i=2;i<=n/i && isPrime;i++){
            if(n % i == 0){
                isPrime=false;
            }
        }
        if(isPrime){
            System.out.println("Prime number");
        }
         else{
                System.out.println("Prime number");
            }
            sc.close();
    }
}