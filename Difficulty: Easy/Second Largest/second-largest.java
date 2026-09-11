class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=-1;
        int secondLargest=-1;
        for(int a : arr){
            if(a > largest){
                secondLargest=largest;
                largest=a;
            }
            if(a>secondLargest && a!=largest)
            secondLargest=a;
        }
        return secondLargest;
    }
}