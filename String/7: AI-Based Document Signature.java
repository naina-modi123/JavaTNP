import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            Set<Character> set = new HashSet();
            int sum = 0;
            for(int i=0;i<word.length();i++){
                set.add(word.charAt(i));
                sum += word.charAt(i)-'A'+1;
            }
            sb.append(sum*set.size());
        }
        System.out.println(sb.toString());
    }
}
