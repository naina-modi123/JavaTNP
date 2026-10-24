import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] elements = new int[n];
        for(int i=0;i<n;i++){
            elements[i] = sc.nextInt();
        }
        int countEven = 0, countOdd = 0;
        for(int i=0;i<n;i++){
            if(elements[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Even: "+countEven);
        System.out.println("Odd: "+ countOdd);
        
    }
}
