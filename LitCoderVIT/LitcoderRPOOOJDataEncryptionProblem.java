import java.util.Scanner;
public class LitcoderRPOOOJDataEncryptionProblem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean validInput = false;
        int number;
        while(!validInput){
            String input = sc.nextLine();

            // Check if input contains only digits
            if (!input.matches("\\d+")) {
                System.out.println("Enter only integer value");
                continue;
            }

            // Convert the string to an integer
            number = Integer.parseInt(input);
            
            // Check if input is a positive integer
            if (number <= 0) {
                System.out.println("Enter positive 4-digit integer");
                continue;
            }

            // Check if the input is exactly 4 digits long
            if (input.length() < 4) {
                System.out.println("Provided input is less than 4, enter four digit integers");
            } else if (input.length() > 4) {
                System.out.println("Provided input is more than 4, enter four digit integers");
            } else {
                validInput = true;
                // System.out.println("Valid input received: " + number);
            }
            int result = encryptInt(number);
            // System.out.println("result: "+ result);
            System.out.println(SwapInt(result));
            sc.close();
        }
    }

    public static int encryptInt(int number){
        int count = 0;
        int result = 0;
        while(number>0){
            int remainder = number%10;
            result+=((remainder+5)%10 * (int)Math.pow(10, count));
            number/=10;
            count++;
        }
        return result;
    }
    public static int SwapInt(int number){
        // int result = 0;
        String dupStr = Integer.toString(number);
        char[] digits = dupStr.toCharArray();
        char temp = digits[0];
        digits[0]= digits[2];
        digits[2]=temp;

        temp = digits[1];
        digits[1]= digits[3];
        digits[3]=temp;

        dupStr = new String(digits);

        return Integer.parseInt(dupStr);
    }
}