
/*Merge Overlapping Intervals with Complications
You are given two arrays representing the starting and ending times of intervals. Each interval is defined by a pair of values, where the first array represents the starting times, and the second array represents the corresponding ending times.
Write a program that merges all overlapping intervals into one and outputs the result with mutually exclusive intervals. Additionally, find the count of intervals that do not overlap with any other interval and the count of invalid starting time and ending time pairs (ie,Starting time >= Ending time).

Sample Examples:

Input:
1 2 6 2 9 11
0 4 8 5 10 13

First line: startTimes is an array of integers representing the starting times of intervals.
Second line: endTimes is an array of integers representing the ending times of intervals.

Output:
2 4 6 8 9 10 11 13
1
1

The first line contains merged all overlapping intervals
Second line contains count of intervals that do not overlap with any other interval
Third line contains count of INVALID starting time and ending time pairs (Starting time >= Ending time)

Explanation: Pair (Starting time, Ending time) two given arrays like (1,0), (2,4), (6,8), (2,5), (9,10), (11,13). The first pair (1,0) is invalid because the starting time is greater than the ending time. So, take the second pair (2,4), then check if the second pair's end time value is less than the third pair's starting value. If 'YES,' take (6,8). If 'NO,' omit the pair and count the number of intervals that do not overlap with any other interval. follow the same rest of pairs. Finally, the overlapping values are (2,4), (6,8), (9,10), (11,13).

Constraints:

1.Start time and endtime length is less than equal to one (or) start time lenghth and end time length is not equal, print "Invalid Input".
2. if you find the duplicate interval, take one interval and rest of the interval count with mismatched intervals.
2.All input values must be integer.

Sample Exercise -1:

Input:
1 2 6 2 9 1
0 1 8 5 10 3

Output:
6 8 9 10
2
2

Sample Exercise -2:

Input:
1 2 6 2 9 1
3 4 8 5 10 3

Output:
1 3 6 8 9 10
3
0 */
import java.util.*;

public class LitcoderPROOFMergeOverlapping {
    public static void main(String[] args) {
        ArrayList<Integer> startingTime = new ArrayList<>();
        ArrayList<Integer> endingTime = new ArrayList<>();

        // Scanner sc = new Scanner(System.in);

        // String[] str = sc.nextLine().split(" ");

        // for(String s: str){
        // startingTime.add(Integer.parseInt(s));
        // }
        startingTime.add(1);
        startingTime.add(2);
        startingTime.add(6);
        startingTime.add(2);
        startingTime.add(9);
        startingTime.add(1);
        endingTime.add(3);
        endingTime.add(4);
        endingTime.add(8);
        endingTime.add(5);
        endingTime.add(10);
        endingTime.add(3);
        int inValid, notOverlapping;
        inValid = notOverlapping = 0;
        for (int i = 0; i < startingTime.size(); i++) {
            if (startingTime.get(i) >= endingTime.get(i)) {
                inValid++;
                continue;
            }

            if (i != 0 && startingTime.get(i) < endingTime.get(i - 1)) {
                notOverlapping++;
                continue;
            }

            System.out.print(startingTime.get(i) + " " + endingTime.get(i) + " ");
        }
        System.out.println();
        System.out.println(notOverlapping);
        System.out.println(inValid);

        // sc.close();
    }

}
