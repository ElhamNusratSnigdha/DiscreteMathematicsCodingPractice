import java.util.Scanner;

public class findPrimeNumber {

    public static boolean primeOrNot(int n){
        boolean flag=false;
        int count=1, range = (int) Math.sqrt(n);
        for (int i=0;i<=range;i++){
            if (i%n==0){
                count++;
            }
        }
        if (count==2&&n>1) flag=true;
        return flag;
    }
    public static void main(String[] args) {
        Scanner ens = new Scanner(System.in);
        int n = ens.nextInt();
        System.out.println(n+" is a prime number: "+primeOrNot(n));
    }
}
