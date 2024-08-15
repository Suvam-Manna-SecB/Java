// Write a Java program to calculate Sum & Average of an integer array.

CODE :-

public class SumAverageArray {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		int sum = 0;
		for(int val: arr) {
			sum += val;
		}
		float avg = (float)sum / 5;
		System.out.println("Sum: " + sum + "\nAverage: " + avg);
	}
}
