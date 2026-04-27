package Homeworkfiles;

public class homework_1_q2 {

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
