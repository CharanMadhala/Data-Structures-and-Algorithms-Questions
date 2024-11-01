/*Special Prime
The problem at hand involves finding the largest special prime number that is smaller than a given input number. A special prime number is a unique type of prime number that can be constructed by concatenating its individual digits in a particular order. The resulting numbers, obtained by considering all possible combinations of concatenation, must also be prime.

To illustrate this concept, let's take an example with an input number of 100. We need to find the largest special prime number that is less than 100.

Starting the process, we examine different digit combinations by concatenating the digits together. In this case, we search for a combination that results in a prime number.

Considering the available digits, we attempt to concatenate them. If a resulting number is prime, we continue by adding more digits until we reach the desired special prime number or find no more primes.

For the given input of 100, we search for a special prime number less than 100. In this case, the largest special prime number that satisfies the given conditions is 79.

To obtain 79, we concatenate the digits 7 and 9. Both 7 and 79 are prime numbers, fulfilling the requirement of a special prime. Moreover, 79 is smaller than the given number, 100. Thus, the output for the given input of 100 is 79.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input:
400

Output:
379

Exercise-2

Input:
100

Output:
79 */
import java.util.Arrays;
// import java.util.Collections;
import java.util.Scanner;
import java.lang.Math;

public class LitcoderSpecialPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        

        for(int i=num-1;i>1;i--){
            if(isPrime(i)){
                if(checkPermutations(Integer.toString(i),Integer.toString(i), "")){
                    System.out.print(Integer.parseInt(sortStringAscending(Integer.toString(i))));
                    break;
                }
            }
        }
        // System.out.println(sortStringAscending("97"));
        // printPermutations("79", "79", "");

        sc.close();
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean checkPermutations(String str, String unChanged, String newStr){
        if(str.length()==0){
            if(isPrime(Integer.parseInt(newStr)) && !newStr.equals(unChanged)){
                return true;
            }

            return false;
        }
        
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            
            String changedStr = str.substring(0,i) + str.substring(i+1);
            if(checkPermutations(changedStr, unChanged, newStr+currChar)){
                return true;
            }
        }
        return false;
    }
    
    public static String sortStringAscending(String input) {
        // Convert the string into an array of characters
        Character[] digits = new Character[input.length()];
        
        for (int i = 0; i < input.length(); i++) {
            digits[i] = input.charAt(i);
        }

        // Sort the array in descending order
        Arrays.sort(digits);

        // Convert the sorted array back into a string
        StringBuilder sortedString = new StringBuilder();
        for (Character digit : digits) {
            sortedString.append(digit);
        }

        return sortedString.toString();
    }

    

}
