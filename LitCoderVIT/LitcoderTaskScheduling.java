/*Task Scheduling
Problem Statement
Task Scheduling
There are N tasks of varying durations, represented by an array A of size N. K workers are available, and each worker takes 1 unit of time to complete 1 unit of work. The goal is to find the minimum time required to complete all the tasks, with the constraint that each worker can only work on a continuous sequence of tasks. To solve this problem, we can use the binary search algorithm to find the minimum time required.. e.g., with 4 tasks of 10,20,30 & 40 time duration and 2 workers, min time is 50 mins.
Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input:
4
10 20 30 40
2

First line => Number of tasks
Second line => task durations
Third line => Number of workers

Output:
50

Exercise-2

Input:
4
60 20 40 50
2

Output:
90 */

import java.util.Arrays;
import java.util.Scanner;

public class LitcoderTaskScheduling {

    // Function to find the minimum time required using a greedy approach
    private static int findMinimumTime(int[] tasks, int workers) {
        // Sort tasks in descending order so we assign larger tasks first
        Arrays.sort(tasks);

        // We'll start allocating tasks in reverse order (from largest to smallest task)
        int[] workerTimes = new int[workers]; // Array to track the total time for each worker

        // Greedily assign tasks to the worker with the least current workload
        for (int i = tasks.length - 1; i >= 0; i--) {
            // Find the worker with the least workload
            int minWorker = 0;
            for (int j = 1; j < workers; j++) {
                if (workerTimes[j] < workerTimes[minWorker]) {
                    minWorker = j;
                }
            }

            // Assign this task to that worker
            workerTimes[minWorker] += tasks[i];
        }

        // The result will be the maximum workload any worker has
        int maxTime = 0;
        for (int time : workerTimes) {
            maxTime = Math.max(maxTime, time);
        }

        return maxTime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of tasks
        int n = sc.nextInt();
        int[] tasks = new int[n];

        // Input task durations
        for (int i = 0; i < n; i++) {
            tasks[i] = sc.nextInt();
        }

        // Input number of workers
        int workers = sc.nextInt();

        // Output the minimum time required to complete all tasks
        System.out.println(findMinimumTime(tasks, workers));

        sc.close();
    }
}
