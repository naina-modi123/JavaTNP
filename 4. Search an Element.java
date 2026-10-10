import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] enrollments = new int[n];
        for(int i=0;i<n;i++){
            enrollments[i] = sc.nextInt();
        }
        int targetEnrollment = sc.nextInt();
        for(int i=0;i<n;i++){
            if(enrollments[i] == targetEnrollment){
                System.out.println("Index: "+i);
                return;
            }
        }
        System.out.println(-1);
       
        
    }
}
