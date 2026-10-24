import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int secondarySum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    sum += arr[i][j];
                }
                if(i+j == (n-1)){
                    secondarySum += arr[i][j];
                }
            }
        }
        int ans = Math.abs(sum - secondarySum);
        System.out.println("Main Diagonal Sum: "+sum);
        System.out.println("Secondary Diagonal Sum: "+secondarySum);
        System.out.println("Difference: "+ans);
    }
}
