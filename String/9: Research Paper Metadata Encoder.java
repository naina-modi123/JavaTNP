import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            int sum = 0;
            Set<Character> set = new HashSet();
            for(int i=0;i<word.length();i++){
                set.add(word.charAt(i));
                sum += word.charAt(i)-'A'+1;
            }
            int distinct = set.size();
            int diff = Math.abs(sum - (distinct*distinct));
            if(diff == 0) sb.append(sum);
            else sb.append(diff);
            
        }
        System.out.println(sb.toString());
    }
}
