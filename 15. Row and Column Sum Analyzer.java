import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        int idx = -1;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                idx = i+1;
            }
            System.out.println("Row "+(i+1)+" Sum: "+ sum);
        }
        
        for(int j=0;j<m;j++){
            int colSum = 0;
            for(int i=0;i<n;i++){
                colSum += arr[i][j];
            }
            System.out.println("Column "+(j+1)+" Sum: "+ colSum);
        }
        System.out.println("Highest Sales Branch: "+idx);
            System.out.println("Highest Sales: "+maxSum);
        
    }
}
