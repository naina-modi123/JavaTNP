import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sales = new int[n];
        for(int i=0;i<n;i++){
            sales[i] = sc.nextInt();
        }
        int maxSale = sales[0];
        int minSale = sales[0];
        for(int i=0;i<n;i++){
            if(sales[i] > maxSale){
                maxSale = sales[i];
            }else{
                if(sales[i] < minSale){
                    minSale = sales[i];
                }
            }
        }
        System.out.println("Maximum: "+maxSale);
        System.out.println("Minimum: "+ minSale);
        
    }
}
