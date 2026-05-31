class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l<r){
            int mid= l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    void merge(int arr[], int l, int mid, int r){
        int i=l;
        int j=mid+1;
        int c[]=new int[r-l+1];
        int k=0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                c[k]=arr[i];
                i++;
                k++;
            }
            else{
                c[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            c[k]=arr[i];
                i++;
                k++;
        }
        
        while(j<=r){
                c[k]=arr[j];
                j++;
                k++;
            }
            
        for (int x = 0; x < c.length; x++) {
            arr[l + x] = c[x];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna