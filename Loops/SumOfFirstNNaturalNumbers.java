package Loops;
//Sum of first n natural numbers
import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static int calcSum(int n){
        int sum =0;
        for(int i=1; i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("sum of " + n+" natural no.s: "+ calcSum(n));
        
        sc.close();
    }
}
