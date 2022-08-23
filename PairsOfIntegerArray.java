/*
Write a function to find all pairs of an integer array whose sum is equal to a given number.
pairSum({2, 4, 3, 5, 6, -2, 4, 7, 8, 9},7)
Output : "2:5 4:3 3:4 -2:9 "
*/

public class PairsOfIntegerArray {
    public static void main(String[] args) {
        
    int[] a ={2,4,3,5,6,-2,7,8,9};
    int target =7;
    
    for(int i=0; i<a.length;i++){
        for(int j=0; j<a.length;j++){
            if(a[i]+a[j]==target){
                System.out.print(a[i]+":"+a[j] +" ");
            }
        }
    }
        
        
    }
}
