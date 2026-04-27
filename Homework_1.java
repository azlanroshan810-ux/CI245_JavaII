package Homeworkfiles;

import java.util.Scanner;

public class Homework_1 {

    // method to display array
    public static void display(int[] list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // method to compare arrays
    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 1) ask number of elements
        System.out.print("Enter the number of elements: ");
        int num = input.nextInt();

        // 2) create arrays
        int[] list1 = new int[num];
        int[] list2 = new int[num];

        // 3) input list1
        System.out.println("Enter numbers for list1:");
        System.out.println("-----------------------");
        for (int i = 0; i < list1.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list1[i] = input.nextInt();
        }

        // 4) input list2
        System.out.println("\nEnter numbers for list2:");
        System.out.println("-----------------------");
        for (int i = 0; i < list2.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            list2[i] = input.nextInt();
        }

        // display arrays
        System.out.print("\nList1: ");
        display(list1);

        System.out.print("List2: ");
        display(list2);

        // compare arrays
        if (equals(list1, list2)) {
            System.out.println("Both arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }

        input.close();
    }
}





public class problem2 {
    // display 10 scores per line
    public static void display(int[] scores) {
        System.out.println("Scores");
        System.out.println("------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    // calculate average
    public static double average(int[] scores) {
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        return (double) sum / scores.length;
    }

    // count scores >= average
    public static int countAboveAvg(int[] scores, double avg) {
        int count = 0;
        for (int s : scores) {
            if (s >= avg) {
                count++;
            }
        }
        return count;
    }

    // count ranges
    public static void countRanges(int[] scores) {
        int[] ranges = new int[10]; // 0-9, 10-19, ..., 90-99

        for (int s : scores) {
            ranges[s / 10]++;
        }

        System.out.println("\nCounts of scores in each range");
        System.out.println("------------------------------------");

        for (int i = 0; i < ranges.length; i++) {
            System.out.println((i * 10) + "--" + (i * 10 + 9) + " : " + ranges[i]);
        }
    }

    public static void main(String[] args) {

        int[] scores = new int[100];

        // generate random scores (0–99)
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (Math.random() * 100);
        }

        // display scores
        display(scores);

        // average
        double avg = average(scores);
        System.out.printf("\n\nAverage Scores: %.2f\n", avg);

        // count above average
        int count = countAboveAvg(scores, avg);
        System.out.println("Above average Scores: " + count);

        // ranges
        countRanges(scores);
    }
}