import java.util.*;
class Main {
    public static void main(String[] args) {
        char ch = 'a';
        String s = "banana:apple:grape:pear:avacado";
        String[] dict = s.split(":");
        HashMap<String, Integer> map = new HashMap<>();
        int maxFreq = 0;
        for(String word : dict){
            int count = 0;
            for(int i=0;i<word.length();i++){
                if(Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(ch)){
                    count++;
                }
            }
            if(count > maxFreq){
                maxFreq = count;
            }
            map.put(word, count);
        }
        StringBuilder sb = new StringBuilder();
        for(String word : dict){
            if(map.get(word) == maxFreq){
                if(sb.length() > 0){
                    sb.append(":");
                }
                sb.append(word); 
            }
        }
        System.out.println(sb.toString().toUpperCase());
    }
}
