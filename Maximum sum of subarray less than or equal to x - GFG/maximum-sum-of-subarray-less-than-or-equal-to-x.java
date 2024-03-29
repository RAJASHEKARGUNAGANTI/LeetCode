//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    long findMaxSubarraySum(long arr[], int N,int X)
    {
        long sum  = 0;
        int i = 0 , j = 0;
        HashSet<Long> hs = new HashSet<Long>();
        hs.add(sum);
        while(j < N && i < N){
                sum += arr[j];
            if(sum <= X){
                j++;
                    hs.add(sum);
                // if(sum <= X){
                // }
            }
            else{
                i++;
                j = i;
                sum =0;
            }
        }
        return Collections.max(hs);
    }
}


//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine().trim());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int m =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[n];
//            for (int i = 0; i < n; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            long ans=ob.findMaxSubarraySum(a,n,k);
            System.out.println(ans);
        }
    }
}




// } Driver Code Ends