// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int max=0;
        int answer=-1;
        for(int i=0; i<arr.length; i++){
            int cnt=0;
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==1)
                cnt++;
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
            
        }
        return answer;
    }
}