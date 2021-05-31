
/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 

How many different ways do you know to solve this problem?
Theare many ways to solvbe this problem. I provided this example to solve easily for everyone
*/

public class RotateArrayKElements {

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int k = 6;

		//reverse the array
		for (int i = n.length; i > n.length - k; i--) {
			int temp = n[i - 1];
			n[i - 1] = n[n.length - i];
			n[n.length - i] = temp;
		}

		//reverse k first three elements
		for (int i = 0; i < k / 2; i++) {
			int temp = n[k - i - 1];
			n[k - i - 1] = n[i];
			n[i] = temp;
		}
		//reverse last n-k elements
		for (int i = 0; i < (n.length - k) / 2; i++) {
			int temp = n[n.length - i - 1];
			n[n.length - i - 1] = n[k + i];
			n[k + i] = temp;
		}

		System.out.println(n);
	}

}
