public class EL {
    int arr[] = {4, 1, 3, 6, 2, 9};
    int sum=0;
    int divBySum(int n){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%n==0){
                    sum = sum+arr[i];
            }
        }
        return sum;
    }

    
}
