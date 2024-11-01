import java.util.*;
/*The task is to find the maximum amount of money a thief can rob from a row of houses. Each house contains a certain amount of money. However, the thief has a rule that they cannot rob two adjacent houses. We need to determine the maximum amount of money the thief can steal while following this constraint.

For example, let's consider a row of houses with the following amounts of money: [100, 200, 150, 50, 300]. The thief needs to find the best strategy to maximize their stolen amount.

The thief cannot rob adjacent houses. Therefore, they have two options at each house: either rob the current house and move two houses ahead or skip the current house and move to the next house.

To maximize the stolen amount, the thief should consider the maximum amount of money they can steal at each step. By calculating the maximum amount of money that can be robbed for each house, the thief can determine the overall maximum stolen amount.

The task is to implement an algorithm that finds the maximum amount of money the thief can rob from the given row of houses while following the constraint of not robbing adjacent houses.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1
Input:
1 2 3 4 5 6
Output:
12

Exercise-2
Input:
1 2 3 4 5 6 7
Output:
16 */
public class LitCoderMaximizeRobbery {
    static class Houses{
        int i;
        int money;
        public Houses(int i, int money){
            this.i = i;
            this.money = money;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //take array
        int[] arr = {1,2,3,4,5,6,7};
        ArrayList<Houses> house = new ArrayList<>();
        // Houses[] house = new Houses[arr.length];
        for(int i=0;i<arr.length;i++){
            house.add(new Houses(i, arr[i]));
        }
        for(Houses h: house){
            System.out.println(h.money);
        }

        Collections.sort(house, (a,b)-> b.money-a.money);
        for(Houses h: house){
            System.out.println(h.money);
        }
        
        System.out.println(findMaxProfit(house));
        sc.close();
    }

    public static int findMaxProfit(ArrayList<Houses> house){
        int profit = 0;
        Houses prev = null;
        Houses curr = null;
        for(int i=0;i<house.size();i++){
            curr= house.get(i);
            if(i>0 && ((curr.i)+1)==(prev.i)){
                continue;
            }
            
            profit+= curr.money;
            prev = curr;

        }

        return profit;
    }
}
