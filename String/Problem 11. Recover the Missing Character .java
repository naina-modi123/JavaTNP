import java.util.*;
class Main {
    public static void main(String[] args) {
        String s1 = "Fi_er";
        String s2 = "FEVER:filer:Filter:Offer:FiBre:FiBer:Fixer:Tailor";
        s2 = s2.toUpperCase();
        s1 = s1.toUpperCase();
        StringBuilder sb = new StringBuilder();
        String[] dict = s2.split(":");
        for(int i=0;i< dict.length;i++){
            String word = dict[i];
            if(word.length() != s1.length()){
                continue;
            }
            Boolean flag = true;
            for(int j=0;j<s1.length();j++){
                if((s1.charAt(j) != '_') && (s1.charAt(j) != word.charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                sb.append(word);
                sb.append(":");
            }
            
        }
        if(sb.length() == 0){
            System.out.println("ERROR-009");
        }else{
            sb.setLength(sb.length() - 1);
            System.out.println(sb.toString());
        }
    }
}
