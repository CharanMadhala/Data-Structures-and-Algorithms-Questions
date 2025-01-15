import java.util.Scanner;
import java.util.ArrayList;

public class LitCoderMaxSubarraySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(-3);
        // arr.add(1);
        // arr.add(6);

        
        // while(sc.hasNext()){
        //     int ele = sc.nextInt();
        //     if(!(ele>=-10 && ele<=10)){
        //         System.out.println("Array elements must be from -10 to 10");
        //         break;
        //     }
        //     if(!(ele>0 || ele<0)){
        //         System.out.println("Array elements must ne integers");
        //         break;
        //     }
            
            
        //     arr.add(ele);
            
        // }
        if(arr.size()>9){
            System.out.println("Array size must be between 1 and 10");
            
        }else{
            doSomething(arr);
        }

        sc.close();
        
    }
    
    public static void doSomething(ArrayList<Integer> arr) {
        //Do Something
        int[] prefix = new int[arr.size()];
        prefix[0]=arr.get(0);
        for(int i=1;i<arr.size();i++){
            prefix[i]=prefix[i-1]+arr.get(i);
        }
        int currSum;
        for(int i=0;i<arr.size();i++){
            
            for(int j=i+1;j<arr.size();j++){
                currSum = (i==0)?prefix[j]:prefix[j]-prefix[i-1];
                if(currSum==0){
                    System.out.println("True");
                    System.out.println(arr.size());
                    return;
                }
            }
        }
        System.out.println("False");
        System.out.println(arr.size());

        
    }
}