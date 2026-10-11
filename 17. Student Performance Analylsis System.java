import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        double avg=0;
        int high = arr[0], low = arr[0];
        int passed = 0, failed = 0;
        int above_avg = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];
            if(arr[i] > high){
                high = arr[i];
            }
            if(arr[i] < low){
                low = arr[i];
            }
            if(arr[i] >= 40){
                passed++;
            }else{
                failed++;
            }
        }
        avg = sum/(double) n;
        for(int i=0;i<n;i++){
            if(arr[i] > avg){
                above_avg++;
            }
        }
        System.out.println("Average: "+ avg);
        System.out.println("Highest: "+ high);
        System.out.println("Lowest: "+ low);
        System.out.println("Passed: "+ passed);
        System.out.println("Failed: "+ failed);
        System.out.println("Above Average: "+ above_avg);
        
    }
}
