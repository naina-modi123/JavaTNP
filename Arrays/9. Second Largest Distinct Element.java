import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        } 
        int largest = arr[0], secLargest = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                secLargest = largest;
                largest = num;
            }else if(num > secLargest && num < largest){
                secLargest = num;
            }
        }
        if(secLargest == Integer.MIN_VALUE){
            secLargest = -1;
        }
        System.out.println("Second Largest: "+secLargest);
    }
}
