import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        double avg = 0;
        for(int i=0;i<n;i++){
            sum += marks[i];
        }
        avg = sum/n;
        System.out.println("Total: "+ sum);
        System.out.println("Average: "+avg);
    }
