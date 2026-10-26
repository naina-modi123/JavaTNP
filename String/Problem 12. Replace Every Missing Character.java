import java.util.*;
class Main {
    public static void main(String[] args) {
        String s1 = "c__e";
        String s2 = "care:code:cake:cope:case:cheese:core";
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();
        StringBuilder sb = new StringBuilder();
        String[] dict = s2.split(":");
        for(int i=0;i<dict.length;i++){
            String word = dict[i];
            if(word.length() != s1.length()){
                continue;
            }
            boolean flag = true;
            for(int j=0;j<s1.length();j++){
                if((s1.charAt(j) != '_') && (word.charAt(j) != s1.charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                sb.append(word);
                sb.append(":");
            }
        }
        if(sb.length() == 0){
            System.out.println("NO-MATCH");
        }else{
            sb.setLength(sb.length()-1);
            System.out.println(sb.toString());
        }
    }
}
