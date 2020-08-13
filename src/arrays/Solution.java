package arrays;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		int[] xArray = { 4, 8, -7, -5, -13, 9, -7, 8 };
		int[] yArray = { 4, -15, -10, -3, -13, 12, 8, -8 };
		
		for(int i = 0; i < xArray.length; i++) {
			a.add(xArray[i]);
			b.add(yArray[i]);
		}
		
		System.out.println(new Solution().coverPoints(a, b));
	}

	public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int stepCount = 0;
        for(int i = 0; i < A.size()-1; i++) {
            int distanceForX = Math.abs(A.get(i) - A.get(i+1));
            int distanceForY = Math.abs(B.get(i) - B.get(i+1));
            stepCount += Math.max(distanceForX, distanceForY);
        }
        return stepCount;
    }
}
