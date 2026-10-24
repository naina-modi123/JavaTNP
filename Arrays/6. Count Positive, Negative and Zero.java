import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] balance = new int[n];
        for(int i=0;i<n;i++){
            balance[i] = sc.nextInt();
        }
        int pos = 0, neg = 0, zero = 0;
        for(int num : balance){
            if(num > 0){
                pos++;
            }else if(num == 0){
                zero++;
            }else{
                neg++;
            }
        }
        System.out.println("Positive: "+pos);
        System.out.println("Negative: "+neg);
        System.out.println("Zero: "+zero);
    }
}
