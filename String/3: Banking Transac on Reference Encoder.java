import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            for(int i=0;i<word.length()-1;i++){
                    int a = word.charAt(i)-'A'+1;
                    int b = word.charAt(i+1)-'A'+1;
                    sb.append(Math.abs(a-b));
            }
        }
        System.out.println(sb.toString());
    }
}
