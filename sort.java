package Java;
import java.util.*;
/**
 * Sort
 */
public class Sort {
    
    /**
     * @param arr
     * @param l
     * @param mid
     * @param r
     */
    public static int merge(int[] arr, int l, int mid, int r){
        int i = l, j = mid+1, k = 0, ans=0;
        int[] temp = new int[r - l + 1];
        while(i<=mid && j<=r){
            if(arr[i] > arr[j]){ temp[k++] = arr[j++]; ans += (mid + 1 - i);}
            else temp[k++] = arr[i++];
        }
        while(i<=mid) temp[k++] = arr[i++];
        while(j<=r) temp[k++] = arr[j++];
        
        for(i=l, k=0; k<temp.length; i++){
            arr[i] = temp[k++];
        }
        return ans;
    }   
    
    public static int mergeSort(int[] arr, int l, int r){
        int ans = 0;
        if(l < r){
            int mid = l + (r - l)/2;
            ans += mergeSort(arr, l, mid);
            ans += mergeSort(arr, mid+1, r);
            ans += merge(arr, l, mid, r);
        }
        return ans;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println("Before Sorting : ");
        for(int i: arr) System.out.print(i + " ");
        System.out.println();
        int val = mergeSort(arr, 0, n-1);
        System.out.println("After Sorting : ");
        for(int i: arr) System.out.print(i + " ");
        System.out.println("\n" + val);
    }
}
