/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

*/

public class RotateMatrixBy90Degree {
    public static void main(String args[]) {
      
      int a[][] = {{1,2,3}, 
                   {4,5,6},
                   {7,8,9}};
                   
     for(int i=0;i<a.length;i++){
         for(int j=0;j<a[i].length;j++){
             System.out.print(a[i][j] +" ");
         }
         System.out.println();
         
     }
     
     for(int i=0; i<a.length;i++){
         
         for(int j=i; j<a.length;j++){
             int temp = a[i][j];
             a[i][j] = a[j][i];
             a[j][i] = temp;
         }
         
     }
     
     for(int i=0; i<a.length;i++){
         
         for(int j=0; j<a.length/2;j++){
             int temp = a[i][j];
             a[i][j] = a[i][a.length-1-j];
             a[i][a.length-1] = temp;
         }
         
     }
     
     System.out.println("--------Print Result Metrix2-------");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
    }
}
