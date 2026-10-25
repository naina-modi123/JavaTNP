import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int left = 0, right = word.length()-1;
            int sum = 0;
            while(left < right){
                int a = word.charAt(left)-'A'+1;
                int b = word.charAt(right)-'A'+1;
                int diff = Math.abs(a-b);
                if(diff % 2 == 0){
                    diff /= 2;
                }else{
                    diff *= 3;
                }
                left++;
                right--;
                sum += diff;
            }
            if(word.length()%2 != 0){
                int ans = (word.charAt(word.length()/2)-'A'+1)*word.length();
                sum += ans;
            }
            if(sum % 3 == 0){
                sb.append(sum/3);
            }else{
                sb.append(sum*2);
            }
        }
        System.out.println(sb.toString());
    }
}
