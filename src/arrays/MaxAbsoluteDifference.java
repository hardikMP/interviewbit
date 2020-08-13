package arrays;

public class MaxAbsoluteDifference {

	public static void main(String[] args) {
//		int[] A = { 1 };
		int[] A = { 1, 3, -1};
		System.out.println(maxArr1(A));
	}
	
	public static int maxArr(int[] A) {
		int maxSoFar = 0, temp = 0;
		for(int i = 0; i < (A.length-1)/2; i++) {
			for(int j = i+1; j < A.length; j++) {
				temp = Math.abs(A[i] - A[j]) + ((j+1) - (i+1));
				maxSoFar = Math.max(maxSoFar, temp);
			}
		}
		return maxSoFar;
    }
	
	public static int maxArr1(int[] A) {
		int max1 = Integer.MIN_VALUE, 
				max2 = Integer.MIN_VALUE,
				min1 = Integer.MAX_VALUE,
				min2 = Integer.MAX_VALUE;
		for(int i = 0; i < A.length; i++) {
			max1 = Math.max(max1, A[i] + i);
			max2 = Math.max(max2, A[i] - i);
			min1 = Math.min(min1, A[i] + i);
			min2 = Math.min(min2, A[i] - i);
		}
		return Math.max(max1 - min1, max2 - min2);
    }
}
