package arrays;

public class Partitions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 5;
		int[] B = {1, 2, 3, 0, 3};
		
		System.out.println(solve(A, B));
	}
	
	public static int solve(int A, int[] B) {
		int sum = 0;
		
		//Calculate the total sum
		for(int i = 0; i < A; i++)
			sum += B[i];
		
		if(sum%3 != 0)
			return 0;
		
		sum /= 3;
		
		return num(B,sum,3,0);
    }
	
	private static int num(int[] a, int sum, int part, int start) {
        if (part==0 && start==a.length) {
            return 1;
        }else if (part==0){
            return 0;
        }else {
            if (start>=a.length) {
                return 0;
            }
            int val = 0;
            int ans = 0;
            for (int i = start; i<a.length; i++) {
                val = val + a[i];
                if (val ==sum) {
                    ans = ans + num(a,sum,part-1,i+1);
                }
            }
            
            return ans;
        }
    }

}
