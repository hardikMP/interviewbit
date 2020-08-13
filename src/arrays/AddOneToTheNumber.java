package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class AddOneToTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] A = { 9 };
		int[] A = { 0 };
//		int[] A = { 0, 3, 7, 6, 4, 0, 5, 5, 9 };
//		int[] A = { 0, 9, 9, 9, 9, 9};
		int[] temp = plusOne(A);
		for (int t : temp) {
			System.out.print(t);
		}
	}

	public static int[] plusOne(int[] A) {
		if(A.length == 1 && A[0] == 0) {
			A[0] += 1;
			return A;
		}
		int zeros = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != 0) {
				int[] temp = new int[A.length - zeros];
				temp = Arrays.copyOfRange(A, zeros, A.length);
				for (int j = temp.length - 1; j >= 0; j--) {
					temp[j] += 1;
					if (temp[j] != 10)
						return temp;
					if (j == 0) {
						int[] temp1 = new int[temp.length+1];
						temp1[0] = 1;
						for (int k = 1; k < temp1.length; k++) {
							temp1[k] = 0;
						}
						return temp1;
					} else
						temp[j] = 0;
				}
				return temp;
			} else {
				++zeros;
			}
		}
		return A;
	}
	
	
	public static int[] plusOne1(int[] A) {
        if(A.length == 1) {
            A[0] += 1;
            return A;
        }
        for(int i = 0; i < A.length; i++) {
            if(A[i] != 0) {
                for(int j = A.length-1; j >= 0; j--) {
                    A[j] += 1;
                    if(A[j] != 10)
                        return A;
                    if(j == 0) {
                        int[] temp = new int[A.length+1];
                        temp[0] = 1;
                        for(int k = 1; k < temp.length; k++) {
                            temp[k] = 0;
                        }
                        return temp;
                    } else
                        A[j] = 0;
                }
                return A;
            }
        }
        return A;
    }
}
