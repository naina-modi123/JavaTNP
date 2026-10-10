import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        int j = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }
        for(int k=j;k<n;k++){
            arr[k] = 0;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
