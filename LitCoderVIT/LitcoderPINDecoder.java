/*Input:
145 875 695 214 12 1

Output:
a22gca

Exercise-2

Input:
10 20 30 40 50 60

Output:
a2c4e6 */

import java.util.Scanner;
import java.util.ArrayList;


public class LitcoderPINDecoder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        // while(sc.hasNext()){
        //     al.add(sc.nextInt());
        // }
        // System.out.println(""+10);
        System.out.println(decodePIN(al));
        sc.close();
    }
    
    public static String decodePIN(ArrayList<Integer> al) {
        String str = "";
        int curr,sum,sum2=0;
        for(int i=0;i<al.size();i++){
            curr = al.get(i);
            sum =sum2 = 0;
            while(curr>0){
                int remainder = curr %10;
                sum+=remainder;
                curr/=10;
            }

            while(sum>0){
                int remainder1 = sum%10;
                sum2+=remainder1;
                sum/=10;
            }
            if(sum2%2!=0){
                str+=((char)('a'+(sum2-1)));
                
            }else{
                str+=sum2;
            }
            
        }
        
        return str; 
        
        
    }
}
                                                                                                                            