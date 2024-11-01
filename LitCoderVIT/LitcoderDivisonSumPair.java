import java.util.Scanner;
import java.util.ArrayList;
public class LitcoderDivisonSumPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int divisor = sc.nextInt();
        int divisor = 4;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        // int j=0;
        // while(j<6){
        //     al.add(sc.nextInt());j++;
        // }
        
        // for(int i=0;i<6;i++){
        //     System.out.print(al.get(i));
        // }
        
        int freq[] = new int[divisor];
        for(int i=0;i<al.size(); i++){
            freq[al.get(i)%divisor]++;
        }
        
        int pair = (freq[0]*(freq[0]-1))/2;
        //1 to n-1
        int lp = 1;
        int rp = freq.length-1;
        int sum = 0;
        while(lp<rp){
            sum = lp+rp;
            if(sum==divisor){
                pair+=freq[lp]*freq[rp];
                lp++;
                rp--;
            }else if(sum>=divisor){
                rp--;
            }else{
                lp++;
            }
        }
        //even case
        if(divisor%2==0){
            pair+=(freq[divisor/2]*(freq[divisor/2]-1))/2;
        }
        
        System.out.println(pair);
        sc.close();
    }
    
    
}
                                                                                                                            