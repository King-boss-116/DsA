class Solution
{
    boolean check_elements(int arr[], int n, int a, int b)
    {
        int range=b-a;
        for(int i=0;i<n;i++){
            if(((int)Math.abs(arr[i])>=a) && ((int)Math.abs(arr[i]))<=b){
                int z=((int)Math.abs(arr[i]))-a;
                if(z<n && arr[z]>0){
                    arr[z]=(-1*arr[z]);
                }
            }
        }
        int count=0;
        for(int i=0;i<=range && i<n;i++){
            if(arr[i]<0){
                count++;
            }
            else{
                return false;
            }
        }
        if(count==range+1){
            return true;
        }
        return false;
    }
}
