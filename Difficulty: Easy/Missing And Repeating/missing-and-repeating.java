class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        long n=arr.length;
        long expectedSum=(n*(n+1))/2;
        long expectedSquareSum=(n*(n+1)*(2*n+1))/6;
        long actualSum=0;
        long actualSquareSum=0;
        for(int a : arr){
            actualSum+=a;
            actualSquareSum+=1L*a*a;
        }
        long a=actualSum-expectedSum;
        long b=actualSquareSum-expectedSquareSum;
        int repeating=(int)((b/a)+a)/2;
        int missing=(int)((b/a)-a)/2;
        ans.add(repeating);
        ans.add(missing);
        return ans;
            
    }
}
