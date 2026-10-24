import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        List<Integer> ans = new ArrayList<>();
        int rmin = 0, rmax = n-1;
        int cmin = 0, cmax = m-1;
        int count = n*m;
        while(count > 0){
            for(int col = cmin;col <= cmax && count > 0;col++){
                ans.add(matrix[rmin][col]);
                count--;
            }
            rmin++;
            for(int row = rmin;row <= rmax && count > 0;row++){
                ans.add(matrix[row][cmax]);
                count--;
            }
            cmax--;
            for(int col = cmax;col >= cmin && count > 0;col--){
                ans.add(matrix[rmax][col]);
                count--;
            }
            rmax--;
            for(int row = rmax;row >= rmin && count > 0;row--){
                ans.add(matrix[row][cmin]);
                count--;
            }
            cmin++;
        }
        for(int num : ans){
            System.out.print(num+" ");
        }
    }
}
