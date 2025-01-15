package VariableAndDataTypes;

import java.util.Scanner;
public class SumOfAAndB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum of "+ "a and "+ " b is: "+ (a+b));
        System.out.println("product of "+ "a and "+ " b is: "+ (a*b));
        System.out.println("Area of circle: "+ (3.14f * a* a)); //assuming a as radius
        sc.close();
    }
}

// Datatypes in java
// Premitive and Non-Premitive
// int      -4b   |    String
// double    -8b  |    Array
// char       -2b |    Class, Object 
// float      -4b |    Interface etc..
// byte       -1b
// short      -2b
// long       -8b
// boolean    -1b
