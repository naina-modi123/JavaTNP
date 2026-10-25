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
                int a = word.charAt(left) - 'A'+1;
                int b = word.charAt(right) - 'A'+1;
                if(a-b == 0){
                    sb.append(a+b);
                }else{
                    sb.append(Math.abs(a-b));
                }
                left++;
                right--;
            }
            if(word.length() % 2 != 0){
                sb.append((word.charAt(word.length()/2) - 'A'+1)*word.length());
            }
        }
        System.out.println(sb.toString());
    }
}
