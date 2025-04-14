/*
This probram used to find the exponantional value using recursion
*/

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// I want to findout the exponantional series epow(x)
//

class Main {
    double p=1, f=1;
    double v =1;
    public static void main(String[] args) {
        Main m = new Main();
        double result = m.pow_e(5,4);
       double result2 = m.pow_e1(5,4);
       double result3 = m.pow_e2(5,4);
        System.out.println(result);
    }

    /*
      Time complixity here is O(n²) using recursion
    */
    double pow_e(int x, int n){
        double r=0;
        if(n==0){
            return 1;
        } else{
            r = pow_e(x, n-1);
            p = p*x;
            f = f*n;
            return r+(double)p/f;
        }
    }

  /*
    Optimized time complixity Horner's rule O(n)
  */
  double pow_e1(int x, int n){
    double s = 1;
    for(; n>0; n--){
      s = 1+((x/n)*s);
    }
    return s
  }

  /*
    Optimized time complixity using Horner's rule O(n) with recursion
  */
  double pow_e2(int x, int n){
   if(n==0{
      return 1;
   }else{
      v = 1+((x/n)*v);
      return pow_e(x, n-1);
   } 
  } 
}

