package subarray;



public class MaxSubarraySum{
    public static void main(String[] args){
        int arr[]= {1,-2,3,4,5,-6};
        int n= arr.length;

        int maxsum= Integer.MIN_VALUE;
        int minsum= Integer.MAX_VALUE;
        int totalsum=0;

        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum =0;
                for(int k=i; k<=j ;k++){
                    sum +=arr[k];
                }
                totalsum += sum;
                System.out.println(sum);
                maxsum= Math.max(maxsum, sum);
                minsum= Math.min(maxsum, sum);
            }
        
        }

        System.out.println("maximum sum of subarray is : "+ maxsum);
        
        System.out.println("manimum sum of subarray is : "+ minsum);
        System.out.println("total sum of all sub arrays are : "+totalsum );
    }
}