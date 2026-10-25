import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int left = 0, right = word.length()-1;
            while(left < right){
                int a = word.charAt(left)-'A'+1;
                int b = word.charAt(right)-'A'+1;
                int diff = Math.abs(a-b);
                int ans = diff*word.length();
                int sum = 0;
                while(ans > 99){
                    while(ans > 0){
                        sum += ans%10;
                        ans /= 10;  
                    }
                }
                if(ans > 99) sb.append(sum);
                else sb.append(ans);
                left++;
                right--;
            }
            if(word.length() % 2 != 0){
                int sum = 0;
                int subans = (word.charAt(word.length()/2)-'A'+1)*word.length();
                while(subans > 99){
                    while(subans > 0){
                        sum += subans%10;
                        subans /= 10;  
                    }
                }
                if(subans > 99) sb.append(sum);
                else sb.append(subans);
            }
        }
        System.out.println(sb.toString());
    }
}
