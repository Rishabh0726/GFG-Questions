class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr, 0, arr.length-1);
    }
    public static int mergeSort(int[] arr, int left, int right) {
        int cnt=0;
        if (left >= right) 
        return cnt;
        
            int mid = left + (right - left) / 2;

            cnt+=mergeSort(arr, left, mid);
            cnt+=mergeSort(arr, mid + 1, right);

            cnt+=merge(arr, left, mid, right);
            return cnt;
    }
    
    private static int merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int cnt=0;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j) R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                cnt+=(n1-i);
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return cnt;
    }
    
}