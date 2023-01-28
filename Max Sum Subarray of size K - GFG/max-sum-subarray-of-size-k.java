//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long sum = 0;
        long sum2 = 0;
        for(int i = 0 ;i < K ; i++){
            sum += Arr.get(i);
        }
        sum2 = sum;
        for(int j = 1 ;j <= N-K ; j++){
            sum = sum - Arr.get(j-1) + Arr.get(j+K-1);
            if(sum2 <= sum){
                sum2 = sum;
            }
        }
        return sum2;
    }
}