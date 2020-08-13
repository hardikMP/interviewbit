package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MAXSPPROD {

	public static void main(String[] args) {
		int[] temp = { 5, 9, 6, 8, 6, 4, 6, 9, 5, 4, 9 };
//		int[] temp = { 2,5,3,7,8,4 };
//		ArrayList<Integer> A = new ArrayList<>();
//		for (Integer value : temp) {
//			A.add(value);
//		}
		ArrayList<Integer> A = new ArrayList(Arrays.asList(temp));
		System.out.println(new MAXSPPROD().maxSpecialProduct(A));
	}
	
	public int maxSpecialProduct(ArrayList<Integer> A) {
        int maxProd = 0;
        if(A.size() == 0)
        	return maxProd;
        
        ArrayList<Integer> leftSpecial = new ArrayList<>();
        ArrayList<Integer> rightSpecial = new ArrayList<>();
        leftSpecial.add(0);
        int tempMax = 0, tempMaxIndex = 0;
        for (int i = 1; i < A.size(); i++) {
        	int j = i-1;
			if(A.get(j) > A.get(i)) {
				leftSpecial.add(j);
				tempMax = A.get(j);
				tempMaxIndex = j;
			} else if(tempMax > A.get(i)) {
				leftSpecial.add(tempMaxIndex);
			} else {
				leftSpecial.add(0);
			}
		}
        rightSpecial.add(0);
        tempMax = 0;
        tempMaxIndex = 0;
        for (int i = A.size()-2; i >= 0; i--) {
        	int j = i+1;
			if(A.get(j) > A.get(i)) {
				rightSpecial.add(j);
				tempMax = A.get(j);
				tempMaxIndex = j;
			} else if(tempMax > A.get(i)) {
				rightSpecial.add(tempMaxIndex);
			} else {
				rightSpecial.add(0);
			}
		}
        Collections.reverse(rightSpecial);
        maxProd = leftSpecial.get(0) * rightSpecial.get(0);
        for (int i = 1; i < leftSpecial.size(); i++) {
			if(leftSpecial.get(i) * rightSpecial.get(i) > maxProd) {
				maxProd = leftSpecial.get(i) * rightSpecial.get(i);
			}
		}
        return maxProd;
    }

}
