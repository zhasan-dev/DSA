import java.util.*;
public class FavouriteSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int left=0;
            int right=n-1;
            boolean odd =true;
            while(left <= right){
                if(odd){
                    System.out.print(arr[left] + " ");
                    left++;
                    odd = false;
                }
                else{
                    System.out.print(arr[right] + " ");
                    right--;
                    odd = true;
                }
            }
        } 
         
    }
}
