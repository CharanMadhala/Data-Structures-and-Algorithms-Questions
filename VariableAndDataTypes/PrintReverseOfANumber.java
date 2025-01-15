package VariableAndDataTypes;
import java.util.Scanner;

public class PrintReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
       
        // 345
        while(n>0){
            int mod = n%10;
            reverse = (reverse*10) + mod;
            n/=10;
        }

        System.out.println("reverse of "+ n +" is: "+ reverse);
        sc.close();
    }
}
