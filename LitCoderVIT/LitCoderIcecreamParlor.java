// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//10
//2 3 4 5 5
import java.util.*;
class LitCoderIcecreamParlor {
    public static class arrayObj{
        int i;
        int data;
        public arrayObj(int i, int data){
            this.i = i;
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        // arrayObj[] ele = new arrayObj[5];
        ArrayList<arrayObj> ele  = new ArrayList<>();
        
        for(int i =0;i<5;i++){
            int n=sc.nextInt();
            ele.add(new arrayObj(i, n));
            
        }
        doSomething(ele,price);
        sc.close();
    }
    public static void doSomething(ArrayList<arrayObj> arr,int price){
        //printing list
        Collections.sort(arr, (a,b)->a.data-b.data);
        // for(int i=0;i<5;i++){
        //     System.out.println(arr.get(i).i+" "+arr.get(i).data);
        // }

        int lp = 0;
        int rp = arr.size()-1;
        // System.out.println(arr.get(++lp).data);
        while(lp<rp){
            if(arr.get(lp).data + arr.get(rp).data==price){
                System.out.println((arr.get(lp).i+1)+" "+(arr.get(rp).i+1));
                return;
            }else if(arr.get(lp).data+arr.get(rp).data>price){
                rp--;
            }else{
                lp++;
            }
        }



        // int lp=0;
        // int rp = arr.length-1;
        // while(lp<rp){
        //     if(arr[lp]+arr[rp]==price){
        //         System.out.println((lp+1)+" "+(rp+1));
        //         return;
        //     }else if(arr[lp]+arr[rp]>price){
        //         rp--;
        //     }else{
        //         lp++;
        //     }
        // }
    }
}